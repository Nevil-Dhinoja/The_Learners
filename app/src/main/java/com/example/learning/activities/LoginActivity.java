package com.example.learning.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.annotation.SuppressLint;
import android.os.AsyncTask;
import android.provider.Settings;
import android.provider.Settings.Secure;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.learning.Models.Add_user_data;
import com.example.learning.Models.ApiInterface;
import com.example.learning.Models.Get_user;
import com.example.learning.Models.RetrofitClient;
import com.example.learning.R;
import com.example.learning.others.CustomLoadingDialog;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.SignInButton;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity {

    private static final String TAG = "LoginActivity";
    private static final int RC_SIGN_IN = 1000;
    private EditText login_email, login_password;
    private Button login_btn;
    private GoogleSignInClient gsc;
    private GoogleSignInOptions gso;
    private ImageView login_google;
    private static boolean isLaunched = false;
    String userEmail, userName;
    CustomLoadingDialog customLoadingDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        if (isLaunched) {
            finish();
            return;
        }
        isLaunched = true;
        customLoadingDialog = new CustomLoadingDialog(this);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }

        login_google = findViewById(R.id.login_google);

        gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestEmail()
                .build();
        gsc = GoogleSignIn.getClient(this , gso);
        GoogleSignInAccount acct = GoogleSignIn.getLastSignedInAccount(this);
        if (acct != null) {
            navigateToSecondActivity();
        }

        login_google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                signIn();
            }
        });

    }

    private void navigateToSecondActivity() {
        Intent intent = new Intent(this , MainActivity.class);
        startActivity(intent);
    }

    public void signIn() {
        Intent signInIntent = gsc.getSignInIntent();
        startActivityForResult(signInIntent , RC_SIGN_IN);
        Log.d(TAG , "startActivityForResult works");
    }

    @Override
    public void onActivityResult(int requestCode , int resultCode , Intent data) {
        super.onActivityResult(requestCode , resultCode , data);
        if (requestCode == RC_SIGN_IN) {
            Task<GoogleSignInAccount> task = GoogleSignIn.getSignedInAccountFromIntent(data);
            handleSignInResult(task);
        }
    }

    private void handleSignInResult(Task<GoogleSignInAccount> completedTask) {
        try {
            customLoadingDialog.show();
            GoogleSignInAccount account = completedTask.getResult(ApiException.class);
            userEmail = account.getEmail();
            userName = account.getDisplayName();
            fetch();
//        sendEmail(userEmail);
            navigateToSecondActivity();
            @SuppressLint("HardwareIds") String android_id = Settings.Secure.getString(LoginActivity.this.getContentResolver() , Settings.Secure.ANDROID_ID);
            ApiInterface apiInterface = RetrofitClient.getClient().create(ApiInterface.class);
            Call<Add_user_data> call = apiInterface.add_user_data("add_user" , userEmail , android_id);
            call.enqueue(new Callback<Add_user_data>() {
                @Override
                public void onResponse(Call<Add_user_data> call , @NonNull Response<Add_user_data> response) {
                    String user_status = response.body().getStatus();
//                Toast.makeText(LoginActivity.this, user_status, Toast.LENGTH_SHORT).show();
                }

                @Override
                public void onFailure(Call<Add_user_data> call , Throwable t) {
                }
            });
            customLoadingDialog.dismiss();
        } catch (ApiException e) {
        }
    }

    public void fetch() {
        ApiInterface apiInterface = RetrofitClient.getClient().create(ApiInterface.class);
        Call<Get_user> call = apiInterface.get_user("get_user" , userEmail);
        call.enqueue(new Callback<Get_user>() {
            @SuppressLint("NotifyDataSetChanged")
            @Override
            public void onResponse(@NonNull Call<Get_user> call ,
                                   @NonNull Response<Get_user> response) {
                if (response.isSuccessful()) {
                    // Check if user email exists
                    if (response.body() != null && response.body().getGetUser() != null && !response.body().getGetUser().isEmpty()) {
                        // User email exists, do nothing or perform any required action
                        Log.d(TAG , "User email exists, no need to send email");
                    } else {
                        // User email does not exist, send the email
                        sendEmail(userEmail);
                    }
                } else {
                    // Handle unsuccessful response
                    Log.e(TAG , "Failed to fetch user data");
                }
            }

            @Override
            public void onFailure(@NonNull Call<Get_user> call , @NonNull Throwable t) {

            }
        });
    }

    @SuppressLint("StaticFieldLeak")
    private void sendEmail(String userEmail) {
        new AsyncTask<Void, Void, Void>() {
            @Override
            protected Void doInBackground(Void... voids) {
                final String username = "ndhinoja188@rku.ac.in"; // Your email address without the "mailto:" prefix
                final String password = "N2955467"; // Your email password
                GoogleSignInAccount account = GoogleSignIn.getLastSignedInAccount(getBaseContext());
                String personName = account.getDisplayName();
                Properties props = new Properties();
                props.put("mail.smtp.auth" , "true");
                props.put("mail.smtp.starttls.enable" , "true");
                props.put("mail.smtp.host" , "smtp.gmail.com");
                props.put("mail.smtp.port" , "587");

                javax.mail.Authenticator authenticator = new javax.mail.Authenticator() {
                    @Override
                    protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
                        return new javax.mail.PasswordAuthentication(username , password);
                    }
                };
                Session session = Session.getInstance(props , authenticator);

                try {
                    MimeMessage message = new MimeMessage(session);
                    message.setFrom(new InternetAddress(username));
                    message.setRecipients(javax.mail.Message.RecipientType.TO , InternetAddress.parse(userEmail));
                    message.setSubject("Successfully Registered");

                    // Set content as HTML
                    String htmlContent = "<!DOCTYPE html>\n" +
                            "<html lang=\"en\">\n" +
                            "<head>\n" +
                            "    <meta charset=\"UTF-8\">\n" +
                            "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
                            "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                            "    <title>Discover The Learners - Your Ultimate E-Learning Destination</title>\n" +
                            "    <style>\n" +
                            "        body {\n" +
                            "            font-family: Arial, sans-serif;\n" +
                            "            margin: 0;\n" +
                            "            padding: 0;\n" +
                            "            background-color: #f2f2f2;\n" +
                            "        }\n" +
                            "        .container {\n" +
                            "            max-width: 600px;\n" +
                            "            margin: 0 auto;\n" +
                            "            padding: 20px;\n" +
                            "            background-color: #ffffff;\n" +
                            "            border-radius: 10px;\n" +
                            "            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\n" +
                            "        }\n" +
                            "        .header{\n" +
                            "            background-color: #00417E;\n" +
                            "            height: 150px;\n" +
                            "            border-top-left-radius: 10px;\n" +
                            "            border-top-right-radius: 10px;\n" +
                            "            display: flex;\n" +
                            "            justify-content: center;\n" +
                            "            color: #ffffff;\n" +
                            "        }\n" +
                            "        .header h1 {\n" +
                            "            font-family:cursive;\n" +
                            "            letter-spacing: 1px;\n" +
                            "            font-size: 20px;\n" +
                            "            padding-left: 70px;\n" +
                            "            padding-top: 50px;\n" +
                            "        }\n" +
                            "        .content {\n" +
                            "            background-color: #F6F7F7;\n" +
                            "            padding: 20px;\n" +
                            "            text-align: center;\n" +
                            "        }\n" +
                            "        .cta-button {\n" +
                            "            display: inline-block;\n" +
                            "            background-color: #00417E;\n" +
                            "            color: white;\n" +
                            "            padding: 10px 20px;\n" +
                            "            text-align: center;\n" +
                            "            text-decoration: none;\n" +
                            "            border-radius: 5px;\n" +
                            "        }\n" +
                            "        li,p{\n" +
                            "            font-family: cursive;\n" +
                            "            line-height: 18px;\n" +
                            "        }\n" +
                            "        h1{\n" +
                            "            font-family: cursive;\n" +
                            "            font-size: 20px;\n" +
                            "        }\n" +
                            "    </style>\n" +
                            "</head>\n" +
                            "<body>\n" +
                            "    <div class=\"container\">\n" +
                            "        <div class=\"header\">\n" +
                            "            <h1>Ocean Infotech</h1>\n" +
                            "        </div>\n" +
                            "        <div class=\"content\">\n" +
                            "            <h1>Discover The Learners - Your Ultimate E-Learning Destination</h1>\n" +
                            "            <p>Dear, " + personName + ",</p>\n" +
                            "            <p>Welcome to The Learners, where knowledge meets convenience! Whether you're a student, professional, or lifelong learner, our app offers a wide range of courses to fuel your curiosity and expand your skills.</p>\n" +
                            "            <p>With The Learners, you can:</p>\n" +
                            "            <ul style=\"text-align: left;\">\n" +
                            "                <li>Explore various of courses on various categories.</li>\n" +
                            "                <li>Learn at your own pace, anytime, anywhere.</li>\n" +
                            "                <li>Access quizzes, and content.</li>\n" +
                            "            </ul>\n" +
                            "            <p>Ready to embark on your learning journey ? </p>\n" +
                            "            <a href=\"https://oceaninfotech.co.in\" class=\"cta-button\">Get Started</a><br>\n" +
                            "            <p>Happy Learning!</p>\n" +
                            "            <p style=\"font-family: Cambria, Cochin, Georgia, Times, 'Times New Roman', serif;\"><b>Best Regards,<br> Nevil Dhinoja, Krish Kalariya <br>and The Learners Team</b> </p>\n" +
                            "        </div>\n" +
                            "    </div>\n" +
                            "</body>\n" +
                            "</html>\n";
                    message.setContent(htmlContent , "text/html");

                    Transport.send(message);

                    Log.d(TAG , "Email sent successfully");

                } catch (MessagingException e) {
                    e.printStackTrace();
                    Log.e(TAG , "Failed to send email: " + e.getMessage());
                }
                return null;
            }
        }.execute();
    }
}
