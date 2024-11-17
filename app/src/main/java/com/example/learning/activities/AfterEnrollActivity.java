package com.example.learning.activities;

import static androidx.fragment.app.FragmentManager.TAG;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.learning.Models.Add_certificate;
import com.example.learning.Models.Add_user_data;
import com.example.learning.Models.ApiInterface;
import com.example.learning.Models.Get_certificate;
import com.example.learning.Models.Get_enrolled_course;
import com.example.learning.Models.Get_quiz;
import com.example.learning.Models.Get_score;
import com.example.learning.Models.RetrofitClient;
import com.example.learning.R;
import com.example.learning.adapters.AfterEnrollRVAdapter;
import com.example.learning.others.CustomLoadingDialog;
import com.example.learning.others.ModuleDataProvider;
import com.example.learning.others.TopicsDataProvider;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.ApiException;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import io.github.muddz.styleabletoast.StyleableToast;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AfterEnrollActivity extends AppCompatActivity {

    TextView activity_name, take_quiz, claim_certi;
    ImageView back_icon, certificate_img, quiz_img;
    RecyclerView afterenroll_rv, topics_rv;
    List<String> module_arry;
    private Map<String, List<String>> topicsMap;
    String course_name, course_id;
    CardView claim_certificate, takequiz;
    ArrayList<Get_score.GetQuizScore> getQuizScores;
    RecyclerView allquestion_rv;
    ArrayList<Get_certificate.GetCertificate> getCertificates;
    CustomLoadingDialog customLoadingDialog;
    String max = "15";
    private static final int REQUEST_CODE_MAIN_ACTIVITY_2 = 101;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        customLoadingDialog = new CustomLoadingDialog(this);
        customLoadingDialog.show();
        setContentView(R.layout.activity_after_enroll);
        take_quiz = findViewById(R.id.take_quiz_btn);
        claim_certi = findViewById(R.id.claim_certificate_btn);
        certificate_img = findViewById(R.id.module_drop);
        quiz_img = findViewById(R.id.quiz_img);
        GoogleSignInAccount account = GoogleSignIn.getLastSignedInAccount(getApplicationContext());
        String userEmail = account != null ? account.getEmail() : "";
        Intent intent = getIntent();
        course_name = intent.getStringExtra("course_name");
        course_id = intent.getStringExtra("course_id");

        ApiInterface apiInterface = RetrofitClient.getClient().create(ApiInterface.class);
        Call<Get_score> call = apiInterface.get_score("get_quiz_score" ,
                userEmail , course_id);
        call.enqueue(new Callback<Get_score>() {
            @SuppressLint({"NotifyDataSetChanged" , "RestrictedApi"})
            @Override
            public void onResponse(@NonNull Call<Get_score> call , @NonNull Response<Get_score> response) {
                if (response.isSuccessful()) {
                    Get_score get_score = response.body();
                    if (get_score != null && get_score.getGetQuizScore() != null) {
                        getQuizScores = new ArrayList<>(get_score.getGetQuizScore());
                        boolean isCompleted = false;
                        for (Get_score.GetQuizScore quizScore : getQuizScores) {
                            int score = Integer.parseInt(quizScore.getTotalScore());
                            if (score >= 15) {
                                isCompleted = true;
                                break;
                            }
                        }
                        if (isCompleted) {
                            take_quiz.setClickable(false);
                            take_quiz.setText("Quiz Completed");
                            quiz_img.setImageResource(R.drawable.right_icon);
                            takequiz.setClickable(false);
                        } else {
                            take_quiz.setClickable(true);
                            take_quiz.setText("Take Quiz");
                            claim_certi.setText("Certificate is Lock");
                            certificate_img.setImageResource(R.drawable.password_icon);
                            claim_certificate.setClickable(false);
                        }
                    } else {
                        // Handle null response body or empty enrolled courses
                        take_quiz.setClickable(true);
                        take_quiz.setText("Take Quiz");
                        claim_certi.setText("Certificate is Lock");
                        certificate_img.setImageResource(R.drawable.password_icon);
                        claim_certificate.setClickable(false);
                    }
                    customLoadingDialog.dismiss();
                } else {
                    // Handle unsuccessful response
                    Log.e(TAG , "Unsuccessful response: " + response.message());
                    Toast.makeText(AfterEnrollActivity.this , "Failed to check" ,
                            Toast.LENGTH_SHORT).show();
                }
            }

            @SuppressLint("RestrictedApi")
            @Override
            public void onFailure(@NonNull Call<Get_score> call , @NonNull Throwable t) {
                Log.e(TAG , "onFailure: " + t.getMessage());
                customLoadingDialog.dismiss();
            }
        });


        ApiInterface apiInterface1 = RetrofitClient.getClient().create(ApiInterface.class);
        Call<Get_certificate> call1 = apiInterface1.get_certificate("get_certificate" , userEmail ,
                course_name);
        call1.enqueue(new Callback<Get_certificate>() {
            @SuppressLint({"NotifyDataSetChanged" , "RestrictedApi"})
            @Override
            public void onResponse(@NonNull Call<Get_certificate> call , @NonNull Response<Get_certificate> response) {
                customLoadingDialog.show();
                // Inside onResponse method of the Retrofit call to fetch user's certificate information
                if (response.isSuccessful()) {
                    Get_certificate get_certificate = response.body();
                    if (get_certificate != null && get_certificate.getGetCertificate() != null) {
                        getCertificates = new ArrayList<>(get_certificate.getGetCertificate());
                        boolean isClaimed = false;
                        for (Get_certificate.GetCertificate certificate : getCertificates) {
                            String courseId = certificate.getName().toString();
                            if (courseId.equals(course_name)) {
                                isClaimed = true;
                                break;
                            }
                        }
                        if (isClaimed) {
                            // Certificate is claimed, set button text to "Certificate Claimed"
                            claim_certi.setText("Certificate Claimed");
                            certificate_img.setImageResource(R.drawable.right_icon);
                            StyleableToast.makeText(getApplicationContext(), "Go To My Profile Page To View Your " +
                                    "Certificate..", Toast.LENGTH_LONG, R.style.go_to_my_profile).show();

                            claim_certificate.setClickable(false);
                        } else {
                            // Certificate is not claimed, set button text to "Claim Your Certificate"
                            claim_certi.setText("Claim Your Certificate");
                            claim_certificate.setClickable(true);
                        }
                    } else {
                        // Handle null response body or empty enrolled courses
                        claim_certi.setText("Claim Your Certificate");
                        claim_certificate.setClickable(true);
                    }
                    customLoadingDialog.dismiss();
                } else {
                    // Handle unsuccessful response
                    Log.e(TAG , "Unsuccessful response: " + response.message());
                    Toast.makeText(AfterEnrollActivity.this , "Failed to check" , Toast.LENGTH_SHORT).show();
                }
            }
            @SuppressLint("RestrictedApi")
            @Override
            public void onFailure(@NonNull Call<Get_certificate> call , @NonNull Throwable t) {
                Log.e(TAG , "onFailure: " + t.getMessage());
            }
        });

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }

        activity_name = findViewById(R.id.activity_name);
        back_icon = findViewById(R.id.back_icon);
        back_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        afterenroll_rv = findViewById(R.id.afterenroll_rv);
        topics_rv = findViewById(R.id.topics_rv);
        claim_certificate = findViewById(R.id.claim_certificate);
        takequiz = findViewById(R.id.take_quiz);
        activity_name.setText(course_name);

        if (course_name != null && course_id != null) {
            if (course_name.equals("Cloud Computing") && course_id.equals("6")) {
                setArraysForModule(ModuleDataProvider.cloudcomputingModules());
                setArraysForTopics(TopicsDataProvider.cloudcomputingTopicsMap());
            } else if (course_name.equals("Azure") && course_id.equals("7")) {
                setArraysForModule(ModuleDataProvider.azureModules());
                setArraysForTopics(TopicsDataProvider.azureTopicsMap());
            } else if (course_name.equals("AWS") && course_id.equals("8")) {
                setArraysForModule(ModuleDataProvider.awsModules());
                setArraysForTopics(TopicsDataProvider.awsTopicsMap());
            } else if (course_name.equals("gCloud") && course_id.equals("9")) {
                setArraysForModule(ModuleDataProvider.gcloudModules());
                setArraysForTopics(TopicsDataProvider.gcloudTopicsMap());
            } else if (course_name.equals("SQL") && course_id.equals("10")) {
                setArraysForModule(ModuleDataProvider.sqlModules());
                setArraysForTopics(TopicsDataProvider.sqlTopicsMap());
            } else if (course_name.equals("MySQL") && course_id.equals("11")) {
                setArraysForModule(ModuleDataProvider.mysqlModules());
                setArraysForTopics(TopicsDataProvider.mysqlTopicsMap());
            } else if (course_name.equals("Oracle") && course_id.equals("12")) {
                setArraysForModule(ModuleDataProvider.oracleModules());
                setArraysForTopics(TopicsDataProvider.oracleTopicsMap());
            } else if (course_name.equals("SQLite") && course_id.equals("13")) {
                setArraysForModule(ModuleDataProvider.sqliteModules());
                setArraysForTopics(TopicsDataProvider.sqliteTopicsMap());
            } else if (course_name.equals("HTML") && course_id.equals("14")) {
                setArraysForModule(ModuleDataProvider.htmlModules());
                setArraysForTopics(TopicsDataProvider.htmlTopicsMap());
            } else if (course_name.equals("CSS") && course_id.equals("15")) {
                setArraysForModule(ModuleDataProvider.cssModules());
                setArraysForTopics(TopicsDataProvider.cssTopicsMap());
            } else if (course_name.equals("JS") && course_id.equals("16")) {
                setArraysForModule(ModuleDataProvider.jsModules());
                setArraysForTopics(TopicsDataProvider.jsTopicsMap());
            } else if (course_name.equals("PHP") && course_id.equals("17")) {
                setArraysForModule(ModuleDataProvider.phpModules());
                setArraysForTopics(TopicsDataProvider.phpTopicsMap());
            } else if (course_name.equals("Bootstrap") && course_id.equals("18")) {
                setArraysForModule(ModuleDataProvider.bootstrapModules());
                setArraysForTopics(TopicsDataProvider.bootstrapTopicsMap());
            } else if (course_name.equals("Angular.JS") && course_id.equals("19")) {
                setArraysForModule(ModuleDataProvider.angularjsModules());
                setArraysForTopics(TopicsDataProvider.angularjsTopicsMap());
            } else if (course_name.equals("JQuery") && course_id.equals("20")) {
                setArraysForModule(ModuleDataProvider.jqueryModules());
                setArraysForTopics(TopicsDataProvider.jqueryTopicsMap());
            } else if (course_name.equals("Ajax") && course_id.equals("21")) {
                setArraysForModule(ModuleDataProvider.ajaxModules());
                setArraysForTopics(TopicsDataProvider.ajaxTopicsMap());
            } else if (course_name.equals("Laravel") && course_id.equals("22")) {
                setArraysForModule(ModuleDataProvider.laravelModules());
                setArraysForTopics(TopicsDataProvider.laravelTopicsMap());
            } else if (course_name.equals("Android") && course_id.equals("23")) {
                setArraysForModule(ModuleDataProvider.androidModules());
                setArraysForTopics(TopicsDataProvider.androidTopicsMap());
            } else if (course_name.equals("Dart") && course_id.equals("24")) {
                setArraysForModule(ModuleDataProvider.dartModules());
                setArraysForTopics(TopicsDataProvider.dartTopicsMap());
            } else if (course_name.equals("Flutter") && course_id.equals("25")) {
                setArraysForModule(ModuleDataProvider.flutterModules());
                setArraysForTopics(TopicsDataProvider.flutterTopicsMap());
            } else if (course_name.equals("Kotlin") && course_id.equals("26")) {
                setArraysForModule(ModuleDataProvider.kotlinModules());
                setArraysForTopics(TopicsDataProvider.kotlinTopicsMap());
            } else if (course_name.equals("Swift") && course_id.equals("27")) {
                setArraysForModule(ModuleDataProvider.swiftModules());
                setArraysForTopics(TopicsDataProvider.swiftTopicsMap());
            } else if (course_name.equals(".NET") && course_id.equals("28")) {
                setArraysForModule(ModuleDataProvider.netModules());
                setArraysForTopics(TopicsDataProvider.dotnetTopicsMap());
            } else if (course_name.equals("C#") && course_id.equals("30")) {
                setArraysForModule(ModuleDataProvider.csharpModules());
                setArraysForTopics(TopicsDataProvider.csharpTopicsMap());
            } else if (course_name.equals("Python") && course_id.equals("31")) {
                setArraysForModule(ModuleDataProvider.pythonModules());
                setArraysForTopics(TopicsDataProvider.pythonTopicsMap());
            } else if (course_name.equals("Programming in C") && course_id.equals("32")) {
                setArraysForModule(ModuleDataProvider.programmingincModules());
                setArraysForTopics(TopicsDataProvider.programmingincTopicsMap());
            } else if (course_name.equals("C++") && course_id.equals("33")) {
                setArraysForModule(ModuleDataProvider.cplusplusModules());
                setArraysForTopics(TopicsDataProvider.cplusplusTopicsMap());
            } else if (course_name.equals("Ruby") && course_id.equals("34")) {
                setArraysForModule(ModuleDataProvider.rubyModules());
                setArraysForTopics(TopicsDataProvider.rubyTopicsMap());
            } else if (course_name.equals("Golang") && course_id.equals("35")) {
                setArraysForModule(ModuleDataProvider.golangModules());
                setArraysForTopics(TopicsDataProvider.golangTopicsMap());
            } else if (course_name.equals("Software Testing") && course_id.equals("43")) {
                setArraysForModule(ModuleDataProvider.softwaretestingModules());
                setArraysForTopics(TopicsDataProvider.softwaretestingTopicsMap());
            } else if (course_name.equals("Selenium") && course_id.equals("44")) {
                setArraysForModule(ModuleDataProvider.seleniumModules());
                setArraysForTopics(TopicsDataProvider.seleniumTopicsMap());
            } else if (course_name.equals("Quality Assurance") && course_id.equals("45")) {
                setArraysForModule(ModuleDataProvider.qualityassuranceModules());
                setArraysForTopics(TopicsDataProvider.qualityassuranceTopicsMap());
            } else if (course_name.equals("Appium") && course_id.equals("46")) {
                setArraysForModule(ModuleDataProvider.appiumModules());
                setArraysForTopics(TopicsDataProvider.appiumTopicsMap());
            } else if (course_name.equals("Cyber Security") && course_id.equals("47")) {
                setArraysForModule(ModuleDataProvider.cybersecurityModules());
                setArraysForTopics(TopicsDataProvider.cybersecurityTopicsMap());
            } else {
                Toast.makeText(this , "Error" , Toast.LENGTH_SHORT).show();
            }
        }
        afterenroll_rv.setLayoutManager(new LinearLayoutManager(getApplicationContext() , LinearLayoutManager.VERTICAL , false));
        AfterEnrollRVAdapter adapter = new AfterEnrollRVAdapter(course_name , getApplicationContext() , module_arry , topicsMap);
        afterenroll_rv.setAdapter(adapter);
        claim_certificate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GoogleSignInAccount account = GoogleSignIn.getLastSignedInAccount(getApplicationContext());
                if (account == null) {
                    Toast.makeText(AfterEnrollActivity.this , "User not signed in" , Toast.LENGTH_SHORT).show();
                    customLoadingDialog.dismiss();
                    return;
                }
                // User is signed in, fetch the user's email
                String userEmail = account.getEmail();
                String userName = account.getDisplayName();

                // Proceed to fetch the score
                ApiInterface apiInterface = RetrofitClient.getClient().create(ApiInterface.class);
                Call<Get_score> call = apiInterface.get_score("get_quiz_score" , userEmail , course_id);
                call.enqueue(new Callback<Get_score>() {
                    @Override
                    public void onResponse(Call<Get_score> call , @NonNull Response<Get_score> response) {
                        if (response.isSuccessful() && response.body() != null) {
                            Get_score getScore = response.body();
                            if (getScore.getGetQuizScore() != null && !getScore.getGetQuizScore().isEmpty()) {
                                Get_score.GetQuizScore quizScore = getScore.getGetQuizScore().get(0); //
                                // Assuming only one score is returned
                                int userScore = Integer.parseInt(quizScore.getTotalScore()); // Assuming there's a method to
                                // get the score from the GetQuizScore object
                                if (userScore >= 15) {
                                    // User's score is greater than or equal to 15, allow them to claim the certificate
                                    // Navigate to the claim certificate activity here
                                    Intent claimCertificateIntent =
                                            new Intent(AfterEnrollActivity.this , ClaimCertificate.class);
                                    claimCertificateIntent.putExtra("cat_name" , course_name);
                                    claimCertificateIntent.putExtra("course_id" , course_id);
//                                    startActivity(claimCertificateIntent);
                                    startActivityForResult(claimCertificateIntent, REQUEST_CODE_MAIN_ACTIVITY_2);
                                } else {
                                    // User's score is less than 15, inform the user
                                    StyleableToast.makeText(getApplicationContext(), "Your score is less than 15. You need a score of at least 15 to claim the certificate.", Toast.LENGTH_LONG, R.style.go_to_my_profile).show();
                                }
                            } else {
                                // No score found for the user
                                StyleableToast.makeText(getApplicationContext(), "You Have not " +
                                                "Given Quiz.",
                                        Toast.LENGTH_LONG, R.style.go_to_my_profile).show();

                            }
                        } else {
                            Toast.makeText(AfterEnrollActivity.this , "Failed to fetch user's score" , Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onFailure(Call<Get_score> call , Throwable t) {
                        String errorMessage = t.getMessage();
                        Toast.makeText(AfterEnrollActivity.this , errorMessage , Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
        customLoadingDialog.show();
        takequiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(getApplicationContext() , TakeQuizActivity.class);
                intent1.putExtra("course_id" , course_id);
                intent1.putExtra("course_name" , course_name);
                customLoadingDialog.dismiss();
                startActivity(intent1);
            }
        });
    }

    private void setArraysForModule(List<String> module) {
        module_arry = module;
    }

    private void setArraysForTopics(Map<String, List<String>> topics) {
        topicsMap = topics;
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE_MAIN_ACTIVITY_2) {
            if (resultCode == RESULT_OK) {
                recreate();
            }
        }
    }
    @Override
    protected void onResume() {
        super.onResume();
    }
}
