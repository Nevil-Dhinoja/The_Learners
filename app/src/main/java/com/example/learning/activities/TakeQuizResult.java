package com.example.learning.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.airbnb.lottie.Lottie;
import com.airbnb.lottie.LottieAnimationView;
import com.example.learning.Models.Add_user_data;
import com.example.learning.Models.ApiInterface;
import com.example.learning.Models.RetrofitClient;
import com.example.learning.Models.Store_score;
import com.example.learning.R;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.ApiException;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class TakeQuizResult extends AppCompatActivity {

    TextView correct,wrong,score_less,message;
    ImageView result_close;
    String course_id,UserEmail,UserName;
    LottieAnimationView quiz_lottie;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_quiz_result);
        GoogleSignInAccount account = GoogleSignIn.getLastSignedInAccount(getApplicationContext());
        UserEmail = account.getEmail();
        UserName = account.getDisplayName();
        quiz_lottie = findViewById(R.id.quiz_lottie);
        ActionBar actionBar = getSupportActionBar();
        if(actionBar!=null){
            actionBar.hide();
        }
        message = findViewById(R.id.message1);
        score_less = findViewById(R.id.score_less);
        correct = findViewById(R.id.quiz_completed_currect);
        wrong = findViewById(R.id.quiz_completed_wrong);
        result_close = findViewById(R.id.result_close);

        Intent intent = getIntent();
        int c = intent.getIntExtra("correct_answer", 0);
        int w = intent.getIntExtra("wrong_answer", 0);
        course_id = intent.getStringExtra("course_id");
        correct.setText("Correct : "+c);
        wrong.setText("Wrong : "+w);
        if (c<=5)
        {
            message.setText("Sorry Poor Score!!");
            quiz_lottie.setAnimation(R.raw.lottie_tryagain);
        } else if (c<=14 && c>5) {
            message.setText("Better Luck Next Time !!");
            quiz_lottie.setAnimation(R.raw.lottie_betterluck);
        }
        else {
            message.setText("Congratulations !!");
            quiz_lottie.setAnimation(R.raw.quiz_complete_lottie);
        }
        result_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
                finish();
            }
        });
        String c1 = String.valueOf(c);
        ins_Score(c1);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
    @SuppressLint("SetTextI18n")
    public void ins_Score(String correct) {
        if (Integer.parseInt(correct) >= 15) {
            ApiInterface apiInterface = RetrofitClient.getClient().create(ApiInterface.class);
            Call<Store_score> call = apiInterface.add_quiz_score("add_quiz_score" , UserEmail ,
                    course_id,correct);
            call.enqueue(new Callback<Store_score>() {
                @Override
                public void onResponse(Call<Store_score> call , @NonNull Response<Store_score> response) {
                    String user_status = response.body().getStatus();
                    Toast.makeText(TakeQuizResult.this , user_status , Toast.LENGTH_SHORT).show();
                }
                @Override
                public void onFailure(Call<Store_score> call , Throwable t) {
                }
            });
        }
        else{
            score_less.setText("Dear, "+UserName +" You haven't Qualified the Test,Kindly Score " +
                    "More" +
                    " than 15 Marks to Qualify the Test & Unlock the Certificate");
        }
    }
}