package com.example.learning.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.learning.Models.ApiInterface;
import com.example.learning.Models.Get_course;
import com.example.learning.Models.Get_course_category;
import com.example.learning.Models.RetrofitClient;
import com.example.learning.R;
import com.example.learning.adapters.CategoryCourseAdapter;
import com.example.learning.adapters.MycourseFragmentRVAdapter;
import com.example.learning.others.CustomLoadingDialog;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CategoryCourseActivity extends AppCompatActivity {

    RecyclerView category_rv;
    ImageView back_icon;
    TextView activity_name;
    ArrayList<Get_course.GetCourse> getCourses;
    CategoryCourseAdapter adapter2;
    private static final String TAG = "CategoryCourseActivity";
    String course_name;
    CustomLoadingDialog customLoadingDialog;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_course);
        category_rv = findViewById(R.id.category_rv);
        back_icon = findViewById(R.id.back_icon);
        activity_name = findViewById(R.id.activity_name);
        customLoadingDialog = new CustomLoadingDialog(this);
        back_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        Intent intent = getIntent();
        course_name = intent.getStringExtra("course_name");
        activity_name.setText(course_name);
        ActionBar actionBar = getSupportActionBar();
        if(actionBar!=null){
            actionBar.hide();
        }
        getCourses = new ArrayList<>();
        adapter2 = new CategoryCourseAdapter(CategoryCourseActivity.this,getCourses);
        category_rv.setLayoutManager(new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL,false));
        category_rv.setAdapter(adapter2);
        fetch();
    }
    public void fetch() {
        customLoadingDialog.show();
        ApiInterface apiInterface = RetrofitClient.getClient().create(ApiInterface.class);
          Intent intent = getIntent();
          String categoryId = intent.getStringExtra("category_id");
        Call<Get_course> call = apiInterface.get_course("get_course", categoryId);
        call.enqueue(new Callback<Get_course>() {
            @SuppressLint("NotifyDataSetChanged")
            @Override
            public void onResponse(@NonNull Call<Get_course> call, @NonNull Response<Get_course> response) {
                if (response.isSuccessful()) {
                    customLoadingDialog.dismiss();
                    Get_course get_course = response.body();
                    if (get_course != null && get_course.getGetCourse() != null) {
                        getCourses.addAll(get_course.getGetCourse());
                        adapter2.notifyDataSetChanged();
                    }
                } else {
                    customLoadingDialog.dismiss();
                    Log.e(TAG, "Unsuccessful response: " + response.message());
                }
            }

            @Override
            public void onFailure(@NonNull Call<Get_course> call, @NonNull Throwable t) {
                Log.e(TAG, "onFailure: " + t.getMessage());
            }
        });
    }
}