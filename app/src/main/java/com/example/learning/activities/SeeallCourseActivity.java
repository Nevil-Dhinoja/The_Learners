package com.example.learning.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.learning.Models.ApiInterface;
import com.example.learning.Models.Get_course_category;
import com.example.learning.Models.RetrofitClient;
import com.example.learning.R;
import com.example.learning.adapters.AllCourseAdapter;
import com.example.learning.adapters.upcomming_course_adapter;
import com.example.learning.others.CustomLoadingDialog;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SeeallCourseActivity extends AppCompatActivity {

    RecyclerView allcourses_rv,upcoming_course;
    private static final String TAG = "SeeallCourseActivity";
    TextView toolbar_text;
    ImageView back;
    ArrayList<Get_course_category.GetCategory> getCategories;
    AllCourseAdapter adapter;
    CustomLoadingDialog customLoadingDialog;

    int upcomming_img_arry[] = {R.drawable.lock,R.drawable.lock,
            R.drawable.lock,R.drawable.lock};
    String upcomming_course_cat_arry[] = {"App Development","Web Technologies","Software Development",
            "Digital Marketing"};
    String upcomming_course_arry[] = {"5","10","5","7"};

    @SuppressLint({"MissingInflatedId" , "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seeall_course);
        back = findViewById(R.id.back1);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        toolbar_text = findViewById(R.id.text1);
        customLoadingDialog = new CustomLoadingDialog(this);
        toolbar_text.setText("All Courses");
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        getCategories = new ArrayList<>();
        allcourses_rv = findViewById(R.id.allcourses_rv);
        upcoming_course = findViewById(R.id.upcoming_course);
        int numberOfColumns = 2;
        adapter = new AllCourseAdapter(SeeallCourseActivity.this ,getCategories);
        allcourses_rv.setLayoutManager(new GridLayoutManager(getApplicationContext() , numberOfColumns));
        allcourses_rv.setAdapter(adapter);

        int numberOfColumns2 = 2; // You can change this value to the number of columns you want
        upcomming_course_adapter adapter = new upcomming_course_adapter(upcomming_img_arry, upcomming_course_cat_arry,
                upcomming_course_arry);
        upcoming_course.setLayoutManager(new GridLayoutManager(getApplicationContext(),numberOfColumns));
        upcoming_course.setAdapter(adapter);
        fetch();
    }
    public void fetch() {
        customLoadingDialog.show();
        ApiInterface apiInterface = RetrofitClient.getClient().create(ApiInterface.class);
        Call<Get_course_category> call = apiInterface.get_course_category("get_category");
        call.enqueue(new Callback<Get_course_category>() {
            @SuppressLint("NotifyDataSetChanged")
            @Override
            public void onResponse(@NonNull Call<Get_course_category> call, @NonNull Response<Get_course_category> response) {
                if (response.isSuccessful()) {
                    customLoadingDialog.dismiss();
                    Get_course_category get_course_category = response.body();
                    if (get_course_category != null && get_course_category.getGetCategory() != null) {
                        getCategories.addAll(get_course_category.getGetCategory());
                        adapter.notifyDataSetChanged();
                    }
                } else {
                    customLoadingDialog.dismiss();
                    Log.e(TAG, "Unsuccessful response: " + response.message());
                }
            }

            @Override
            public void onFailure(@NonNull Call<Get_course_category> call, @NonNull Throwable t) {
                Log.e(TAG, "onFailure: " + t.getMessage());
            }
        });
    }
}