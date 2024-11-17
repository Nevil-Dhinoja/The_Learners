package com.example.learning.activities;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.learning.R;
import com.example.learning.adapters.FavouriteCourseAdapter;
import com.example.learning.database.DBHelper;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

import java.util.ArrayList;
import java.util.List;

public class FavouriteCoursesActivity extends AppCompatActivity {

    RecyclerView favourite_rv;
    DBHelper dbHelper;
    List<Bitmap> images;
    List<String> text;
    List<String> category;
    FavouriteCourseAdapter adapter;
    GoogleSignInAccount account;
    TextView toolbar_text;
    ImageView back;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourite_courses);

        back=findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        toolbar_text=findViewById(R.id.text);
        toolbar_text.setText("Favourite Course");
//        favourite_rv = findViewById(R.id.favourite_rv);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        account = GoogleSignIn.getLastSignedInAccount(getApplicationContext());
        String email = account.getEmail();
        dbHelper = new DBHelper(getApplicationContext());
        Cursor cursor = dbHelper.fetch_favourite_course(email);

        images = new ArrayList<>();
        text = new ArrayList<>();
        category = new ArrayList<>();

        if (cursor.getCount() > 0) {
            while (cursor.moveToNext()) {
                @SuppressLint("Range") String courseName = cursor.getString(cursor.getColumnIndex("course_name"));
                @SuppressLint("Range") String c = cursor.getString(cursor.getColumnIndex("category_name"));
                @SuppressLint("Range") byte[] imageBytes = cursor.getBlob(cursor.getColumnIndex("image"));

                if (imageBytes != null && imageBytes.length > 0) {
                    Bitmap bitmap = BitmapFactory.decodeByteArray(imageBytes , 0 , imageBytes.length);
                    images.add(bitmap);
                }

                text.add(courseName);
                category.add(c);
            }
        }

//        favourite_rv.setLayoutManager(new LinearLayoutManager(getApplicationContext() , LinearLayoutManager.VERTICAL , false));
//        adapter = new FavouriteCourseAdapter(getApplicationContext() , text , images , category);
//        favourite_rv.setAdapter(adapter);
    }

    @SuppressLint("NotifyDataSetChanged")
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("FavouriteCoursesActivity" , "onResume called");

        Cursor cursor = dbHelper.fetch_favourite_course(account.getEmail());
        images.clear();
        text.clear();
        category.clear();

        if (cursor.getCount() > 0) {
            while (cursor.moveToNext()) {
                @SuppressLint("Range") String courseName = cursor.getString(cursor.getColumnIndex("course_name"));
                @SuppressLint("Range") String c = cursor.getString(cursor.getColumnIndex("category_name"));
                @SuppressLint("Range") byte[] imageBytes = cursor.getBlob(cursor.getColumnIndex("image"));

                if (imageBytes != null && imageBytes.length > 0) {
                    Bitmap bitmap = BitmapFactory.decodeByteArray(imageBytes , 0 , imageBytes.length);
                    images.add(bitmap);
                }

                text.add(courseName);
                category.add(c);
            }
        }
        // Notify adapter about the data change
//        adapter.notifyDataSetChanged();
    }
}