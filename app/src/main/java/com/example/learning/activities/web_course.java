package com.example.learning.activities;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.learning.R;
import com.example.learning.adapters.android_adapter;
import com.example.learning.adapters.upcomming_course_adapter;
import com.example.learning.adapters.web_adapter;
import com.example.learning.others.CustomLoadingDialog;

public class web_course extends AppCompatActivity {
    int upcomming_img_arry[] = {R.drawable.verified,R.drawable.verified,
            R.drawable.verified,R.drawable.verified,R.drawable.verified,R.drawable.verified,R.drawable.verified,
            R.drawable.verified,R.drawable.verified};
    String upcomming_course_cat_arry[] = {"HTML","CSS","JS","PHP","Bootstrap","Angular.JS","JQuery",
            "Ajax","Laravel"};
    String upcomming_course_arry[] = {"Beginner","Beginner","Beginner","Beginner","Beginner",
            "Beginner","Beginner","Beginner","Beginner"};
    RecyclerView web_rv;
    TextView toolbar_text;
    ImageView back;
    CustomLoadingDialog customLoadingDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_course);
        web_rv = findViewById(R.id.web_rv);
        toolbar_text = findViewById(R.id.text1);
        customLoadingDialog = new CustomLoadingDialog(this);
        toolbar_text.setText("Web Development");
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        web_adapter adapter = new web_adapter(upcomming_img_arry,
                upcomming_course_cat_arry,
                upcomming_course_arry);
        web_rv.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL,
                false));
        web_rv.setAdapter(adapter);
    }
}