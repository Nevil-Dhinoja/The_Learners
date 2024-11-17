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
import com.example.learning.others.CustomLoadingDialog;

public class android_course extends AppCompatActivity {
    int upcomming_img_arry[] = {R.drawable.verified,R.drawable.verified,
            R.drawable.verified,R.drawable.verified,R.drawable.verified};
    String upcomming_course_cat_arry[] = {"Android","Dart","Kotlin",
            "Flutter","Swift"};
    String upcomming_course_arry[] = {"Beginner","Beginner","Beginner","Beginner","Beginner"};
    RecyclerView android_rv;
    TextView toolbar_text;
    ImageView back;
    CustomLoadingDialog customLoadingDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_course);
        android_rv = findViewById(R.id.android_rv);
        toolbar_text = findViewById(R.id.text1);
        customLoadingDialog = new CustomLoadingDialog(this);
        toolbar_text.setText("App Development");
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        android_adapter adapter = new android_adapter(upcomming_img_arry,
                upcomming_course_cat_arry,
                upcomming_course_arry);
        android_rv.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL,
                false));
        android_rv.setAdapter(adapter);
    }
}