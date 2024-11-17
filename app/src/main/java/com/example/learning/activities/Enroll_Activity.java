package com.example.learning.activities;

import static androidx.fragment.app.FragmentManager.TAG;

import androidx.annotation.NonNull;
import androidx.annotation.StyleableRes;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.learning.Models.Add_Enroll;
import com.example.learning.Models.ApiInterface;
import com.example.learning.Models.Get_course;
import com.example.learning.Models.Get_enrolled_course;
import com.example.learning.Models.RetrofitClient;
import com.example.learning.R;
import com.example.learning.adapters.EnrollActivityRVAdapter;
import com.example.learning.database.DBHelper;
import com.example.learning.others.CustomLoadingDialog;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.ApiException;
import com.shashank.sony.fancytoastlib.FancyToast;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import io.github.muddz.styleabletoast.StyleableToast;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Enroll_Activity extends AppCompatActivity {

    TextView enroll_course, enroll_category, enroll_paragraph, enroll_what;
    RecyclerView enroll_rv;
    AppCompatButton enroll_btn;
    EnrollActivityRVAdapter adapter;
    List<String> module_arry;
    DBHelper dbHelper;
    String course_name, cat_name, cat_type;
    CustomLoadingDialog customLoadingDialog;
    byte[] imageByteArray;
    GoogleSignInAccount account;
    ArrayList<Get_enrolled_course.GetEnrollCourse> getEnrollCourses_;

    @SuppressLint({"MissingInflatedId" , "ResourceAsColor"})

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enroll);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        dbHelper = new DBHelper(this); // Initialize dbHelper

        GoogleSignInAccount account = GoogleSignIn.getLastSignedInAccount(getApplicationContext());
        String userEmail = account != null ? account.getEmail() : "";
        ApiInterface apiInterface = RetrofitClient.getClient().create(ApiInterface.class);
        Call<Get_enrolled_course> call = apiInterface.get_enroll_course("get_enroll_course" ,
                userEmail);
        call.enqueue(new Callback<Get_enrolled_course>() {
            @SuppressLint({"NotifyDataSetChanged" , "RestrictedApi"})
            @Override
            public void onResponse(@NonNull Call<Get_enrolled_course> call, @NonNull Response<Get_enrolled_course> response) {
                if (response.isSuccessful()) {
                    Get_enrolled_course enrolledCourseResponse = response.body();
                    if (enrolledCourseResponse != null && enrolledCourseResponse.getGetEnrollCourse() != null) {
                        getEnrollCourses_ = new ArrayList<>(enrolledCourseResponse.getGetEnrollCourse());
                        boolean isEnrolled = false;
                        for (Get_enrolled_course.GetEnrollCourse course : getEnrollCourses_) {
                            if (course.getName().equals(course_name)) {
                                isEnrolled = true;
                                break;
                            }
                        }
                        if (isEnrolled) {
                            enroll_btn.setClickable(false);
                            enroll_btn.setText("Course Enrolled");
                            enroll_btn.setBackgroundColor(getResources().getColor(R.color.Black));
                        } else {
                            enroll_btn.setClickable(true);
                            enroll_btn.setText("Enroll Now");
                            enroll_btn.setBackgroundColor(getResources().getColor(R.color.Blue));
                        }
                    } else {
                        // Handle null response body or empty enrolled courses
                        enroll_btn.setClickable(true);
                        enroll_btn.setText("Enroll Now");
                        enroll_btn.setBackgroundColor(getResources().getColor(R.color.Blue));
                    }
                } else {
                    // Handle unsuccessful response
                    Log.e(TAG, "Unsuccessful response: " + response.message());
                    Toast.makeText(Enroll_Activity.this, "Failed to fetch enrolled courses", Toast.LENGTH_SHORT).show();
                }
            }


            @SuppressLint("RestrictedApi")
            @Override
            public void onFailure(@NonNull Call<Get_enrolled_course> call , @NonNull Throwable t) {
                Log.e(TAG , "onFailure: " + t.getMessage());
            }
        });

        enroll_course = findViewById(R.id.enroll_course);
        enroll_category = findViewById(R.id.enroll_category);
        enroll_paragraph = findViewById(R.id.enroll_paragraph);
        enroll_what = findViewById(R.id.enroll_what);
        enroll_rv = findViewById(R.id.enroll_rv);
        enroll_btn = findViewById(R.id.enroll_btn);

        Intent intent = getIntent();
        course_name = intent.getStringExtra("course_name");
        cat_name = intent.getStringExtra("cat_name");
        cat_type = intent.getStringExtra("cat_type");

        imageByteArray = intent.getByteArrayExtra("cat_image_path");
        enroll_category.setText(cat_name);
        enroll_course.setText(course_name);
        enroll_what.setText("What you learn in " + enroll_category.getText().toString() + "?");
        switch (enroll_category.getText().toString()) {
            case "Cloud Computing":
                enroll_paragraph.setText(R.string.cloud_computing_par);
                break;

            case "Azure":
                enroll_paragraph.setText(R.string.azure_par);
                break;

            case "AWS":
                enroll_paragraph.setText(R.string.aws_par);
                break;

            case "gCloud":
                enroll_paragraph.setText(R.string.gcloud_par);
                break;

            case "SQL":
                enroll_paragraph.setText(R.string.sql_par);
                break;

            case "MySQL":
                enroll_paragraph.setText(R.string.mysql_par);
                break;

            case "Oracle":
                enroll_paragraph.setText(R.string.oracle_par);
                break;

//            case "MongoDB":
//                enroll_paragraph.setText(R.string.mongodb_par);
//                break;

            case "SQLite":
                enroll_paragraph.setText(R.string.sqlite_par);
                break;

            case "HTML":
                enroll_paragraph.setText(R.string.html_par);
                break;

            case "CSS":
                enroll_paragraph.setText(R.string.css_par);
                break;

            case "JS":
                enroll_paragraph.setText(R.string.js_par);
                break;

            case "PHP":
                enroll_paragraph.setText(R.string.php_par);
                break;

            case "Bootstrap":
                enroll_paragraph.setText(R.string.bootstrap_par);
                break;

            case "Angular.JS":
                enroll_paragraph.setText(R.string.angularjs_par);
                break;

            case "Cyber Security":
                enroll_paragraph.setText(R.string.cyber_security_par);
                break;

            case "jQuery":
                enroll_paragraph.setText(R.string.jquery_par);
                break;

            case "Ajax":
                enroll_paragraph.setText(R.string.ajax_par);
                break;

            case "Laravel":
                enroll_paragraph.setText(R.string.laravel_par);
                break;

            case "Android":
                enroll_paragraph.setText(R.string.android_par);
                break;
            case "Dart":
                enroll_paragraph.setText(R.string.dart_par);
                break;
            case "Flutter":
                enroll_paragraph.setText(R.string.flutter_par);
                break;

            case "Kotlin":
                enroll_paragraph.setText(R.string.kotlin_par);
                break;

            case "Swift":
                enroll_paragraph.setText(R.string.swift_par);
                break;

            case ".NET":
                enroll_paragraph.setText(R.string.dotnet_par);
                break;

            case "ASP.net":
                enroll_paragraph.setText(R.string.aspnet_par);
                break;

            case "C#":
                enroll_paragraph.setText(R.string.csharp_par);
                break;

            case "Python":
                enroll_paragraph.setText(R.string.python_par);
                break;

            case "Programming in C":
                enroll_paragraph.setText(R.string.c_par);
                break;

            case "C++":
                enroll_paragraph.setText(R.string.cpp_par);
                break;

            case "Ruby":
                enroll_paragraph.setText(R.string.ruby_par);
                break;

            case "Golang":
                enroll_paragraph.setText(R.string.golang_par);
                break;

            case "Content Marketing":
                enroll_paragraph.setText(R.string.content_marketing_par);
                break;

            case "Mobile Marketing":
                enroll_paragraph.setText(R.string.mobile_marketing_par);
                break;

            case "Video Marketing":
                enroll_paragraph.setText(R.string.video_marketing_par);
                break;

            case "Email Marketing":
                enroll_paragraph.setText(R.string.email_marketing_par);
                break;

            case "SEO":
                enroll_paragraph.setText(R.string.seo_par);
                break;

            case "Social Media Marketing":
                enroll_paragraph.setText(R.string.social_media_marketing_par);
                break;

            case "Website Marketing":
                enroll_paragraph.setText(R.string.website_marketing_par);
                break;

            case "Software Testing":
                enroll_paragraph.setText(R.string.software_testing_par);
                break;

            case "Selenium":
                enroll_paragraph.setText(R.string.selenium_par);
                break;

            case "Quality Assurance":
                enroll_paragraph.setText(R.string.qa_par);
                break;

            case "Manual Testing":
                enroll_paragraph.setText(R.string.manual_testing_par);
                break;

            case "Appium":
                enroll_paragraph.setText(R.string.appium_par);
                break;

            default:
        }

        switch (enroll_category.getText().toString()) {
            case "Cloud Computing":
                setArraysForCourse(cloudcomputingModules());
                break;

            case "Azure":
                setArraysForCourse(azureModules());
                break;

            case "AWS":
                setArraysForCourse(awsModules());
                break;

            case "gCloud":
                setArraysForCourse(gcloudModules());
                break;

            case "SQL":
                setArraysForCourse(sqlModules());
                break;

            case "MySQL":
                setArraysForCourse(mysqlModules());
                break;

            case "Oracle":
                setArraysForCourse(oracleModules());
                break;

//            case "MongoDB":
//                setArraysForCourse(mongodbModules());
//                break;

            case "SQLite":
                setArraysForCourse(sqliteModules());
                break;

            case "HTML":
                setArraysForCourse(htmlModules());
                break;

            case "CSS":
                setArraysForCourse(cssModules());
                break;

            case "JS":
                setArraysForCourse(jsModules());
                break;

            case "PHP":
                setArraysForCourse(phpModules());
                break;

            case "Bootstrap":
                setArraysForCourse(bootstrapModules());
                break;

            case "Angular.JS":
                setArraysForCourse(angularjsModules());
                break;

            case "Cyber Security":
                setArraysForCourse(cybersecurityModules());
                break;

            case "JQuery":
                setArraysForCourse(jqueryModules());
                break;

            case "Ajax":
                setArraysForCourse(ajaxModules());
                break;

            case "Laravel":
                setArraysForCourse(laravelModules());
                break;

            case "Android":
                setArraysForCourse(androidModules());
                break;

            case "Dart":
                setArraysForCourse(dartModules());
                break;

            case "Flutter":
                setArraysForCourse(flutterModules());
                break;

            case "Kotlin":
                setArraysForCourse(kotlinModules());
                break;

            case "Swift":
                setArraysForCourse(swiftModules());
                break;

            case ".NET":
                setArraysForCourse(netModules());
                break;

            case "ASP.net":
                setArraysForCourse(aspnetModules());
                break;

            case "C#":
                setArraysForCourse(cshapModules());
                break;

            case "Python":
                setArraysForCourse(pythonModules());
                break;

            case "Programming in C":
                setArraysForCourse(programmingincModules());
                break;

            case "C++":
                setArraysForCourse(cplusplusModules());
                break;

            case "Ruby":
                setArraysForCourse(rubyModules());
                break;

            case "GoLang":
                setArraysForCourse(golangModules());
                break;

            case "Content Marketing":
                setArraysForCourse(contentmarketingModules());
                break;

            case "Mobile Marketing":
                setArraysForCourse(mobilemarketingModules());
                break;

            case "Video Marketing":
                setArraysForCourse(videomarketingModules());
                break;

            case "Email Marketing":
                setArraysForCourse(emailmarketingModules());
                break;

            case "SEO":
                setArraysForCourse(seoModules());
                break;

            case "Social Media Marketing":
                setArraysForCourse(socialmediamarketingModules());
                break;

            case "Website Marketing":
                setArraysForCourse(websitemarketingModules());
                break;

            case "Software Testing":
                setArraysForCourse(softwaretestingModules());
                break;

            case "Selenium":
                setArraysForCourse(seleniumModules());
                break;

            case "Quality Assurance":
                setArraysForCourse(qualityassuranceModules());
                break;

            case "Manual Testing":
                setArraysForCourse(manualtestingModules());
                break;

            case "Appium":
                setArraysForCourse(appiumModules());
                break;

            default:
                break;
        }
        adapter = new EnrollActivityRVAdapter(module_arry);
        enroll_rv.setLayoutManager(new LinearLayoutManager(getApplicationContext() , LinearLayoutManager.VERTICAL , false));
        enroll_rv.setAdapter(adapter);
        account = GoogleSignIn.getLastSignedInAccount(getApplicationContext());
        String e = account != null ? account.getEmail() : "";
        enroll_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GoogleSignInAccount account = GoogleSignIn.getLastSignedInAccount(getApplicationContext());
                String userEmail = account != null ? account.getEmail() : "";
                if (!userEmail.isEmpty()) {
                    Intent intent = getIntent();
                    String enroll_course_id = intent.getStringExtra("course_id");
                    ApiInterface apiInterface = RetrofitClient.getClient().create(ApiInterface.class);
                    Call<Add_Enroll> call = apiInterface.add_enroll("add_enroll" , userEmail , enroll_course_id);
                    call.enqueue(new Callback<Add_Enroll>() {
                        @Override
                        public void onResponse(Call<Add_Enroll> call , @NonNull Response<Add_Enroll> response) {
                            String user_status = response.body().getStatus();
                            enroll_btn.setClickable(false);
                            enroll_btn.setText("Course Enrolled");
                            enroll_btn.setBackgroundColor(getResources().getColor(R.color.Black));
                            StyleableToast.makeText(Enroll_Activity.this, "Enrolled Course",
                                    Toast.LENGTH_LONG,
                                    R.style.go_to_my_profile).show();

                        }

                        @Override
                        public void onFailure(Call<Add_Enroll> call , Throwable t) {
                            Toast.makeText(Enroll_Activity.this , "You are not able to enroll.." ,
                                    Toast.LENGTH_SHORT).show();
                        }
                    });
                } else {
                    Toast.makeText(Enroll_Activity.this , "User email not found" , Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void setArraysForCourse(List<String> module) {
        module_arry = module;
    }

    private List<String> cloudcomputingModules() {
        return Arrays.asList("What is Cloud Computing ?" , "Types Of Cloud" , "Cloud Services Models" , "Virtualization" , "Cloud Services Provider");
    }

    private List<String> azureModules() {
        return Arrays.asList("What is Azure ?" , "Azure Storage Service" , "Network Services" , "Computer Services" , "App Services" , "Database Services");
    }

    private List<String> awsModules() {
        return Arrays.asList("What is AWS ?" , "AWS IAM" , "Storage Services" , "EC2 - Backbone of AWS" , "AWS Route53" , "Database Services" , "Application Services" , "AWS VPC");
    }

    private List<String> gcloudModules() {
        return Collections.singletonList("Google Cloud Plateform Tutorial");
    }

    private List<String> sqlModules() {
        return Arrays.asList("What is SQL ?" , "SQL Database" , "SQL Table" , "SQL Select" , "SQL Clause" , "SQL Order by" , "SQL Insert" , "SQL Update" , "SQL Delete" , "SQL Join" , "SQL Keys" , "SQL Inhjection" , "SQL String Function");
    }

    private List<String> mysqlModules() {
        return Arrays.asList("What is MySQL ?" , "MySQL Workbench" , "User Management" , "MySQL Database" , "Table & Views" , "MySQL Queries" , "MySQL Indexes" , "MySQL Clauses" , "MySQL Privileges" , "Control Flow Function" , "MySQL Conditions" , "MySQL Join" , "MySQL Key" , "MySQL Triggers" , "Aggregate Functions");
    }

    private List<String> oracleModules() {
        return Arrays.asList("What is Oracle ?" , "Oracle Tables" , "Oracle Views" , "Oracle Query" , "Oracle Clauses" , "Oracle Operators" , "Oracle Joins" , "Oracle Advance");
    }

    private List<String> mongodbModules() {
        return Arrays.asList("What is MongoDB ?" , "MongoDB Operators" , "Database Commands" , "Database" , "Collection" , "CRUD: Documents" , "MongoDB Shell" , "MongoDB Cloud" , "MongoDB Tools");
    }

    private List<String> sqliteModules() {
        return Arrays.asList("What is SQLite ?" , "Databases" , "Table" , "CRUD Operation" , "Clauses/Conditions" , "SQLite Joins" , "SQLite Date & Time" , "Aggregate Functions" , "SQLite Triggers" , "SQLite Keys" , "SQLite Import/Export");
    }


    private List<String> htmlModules() {
        return Arrays.asList("HTML Tutorial" , "HTML Attributes" , "HTML Tags List" , "HTML5 Advance" , "HTML API" , "HTML Color Names");
    }

    private List<String> cssModules() {
        return Arrays.asList("CSS Tutorial" , "CSS Properties" , "CSS Advance" , "CSS Design");
    }

    private List<String> jsModules() {
        return Arrays.asList("Introduction to JavaScript" , "JavaScript Basics" , "JavaScript Objects" , "JavaScript BOM" , "JavaScript DOM" , "JavaScript Validation" , "JavaScript OOPs" , "JavaScript Cookies" , "JavaScript Events" , "Exception Handling" , "");
    }

    private List<String> phpModules() {
        return Arrays.asList("What is PHP ?" , "Control Statement" , "PHP Programs" , "PHP Functions" , "PHP Arrays" , "PHP Strings" , "PHP Math" , "PHP Form" , "PHP Include" , "State Management" , "PHP File" , "Upload Download");
    }

    private List<String> bootstrapModules() {
        return Arrays.asList("Bootstrap Tutorial" , "Bootstrap Examples" , "Bootstrap Advance" , "Bootstrap Utilities");
    }

    private List<String> angularjsModules() {
        return Arrays.asList("AngularJS Tutorial" , "Angular 7 Tutorial");
    }

    private List<String> cybersecurityModules() {
        return Collections.singletonList("Cyber Security Tutorial");
    }


    private List<String> jqueryModules() {
        return Arrays.asList("What is jQuery ?" , "jQuery Effects" , "jQuery HTML/CSS" , "jQuery Form" , "jQuery Events");
    }

    private List<String> ajaxModules() {
        return Arrays.asList("Ajax Tutorial" , "Java AJAX" , "JSON AJAX");
    }

    private List<String> laravelModules() {
        return Arrays.asList("What is Laravel ?" , "Installation on Windows" , "Laravel Routing" , "Laravel Controllers" , "Laravel Views" , "Laravel Blade Template" , "Laravel Migration" , "Laravel Database");
    }

    private List<String> androidModules() {
        return Arrays.asList("Android Tutorial" , "Android Widgets" , "Activity and Intents" , "Android Fragments" , "Android Menu" , "Android Service" , "Android AlarmManager" , "Android Storage" , "Android SQLite" , "Android Multimedia" , "Android Speech" , "Android Telephony" , "Android Device" , "Android Device" , "Sensor Tutorial" , "Android Graphics" , "Android Animation" , "Android Web Service" , "Google Map" , "Adding Ads" , "Android Examples" , "Android Social" , "Android Versions");
    }

    private List<String> dartModules() {
        return Arrays.asList("Dart Tutorial" , "Dart Data Types" , "Control Flow Statement" , "Dart Function" , "Object Oriented" , "Dart Advance Topics");
    }

    private List<String> flutterModules() {
        return Arrays.asList("What is Cloud Computing ?" , "Types Of Cloud" , "Cloud Services Models" , "Virtualization" , "Cloud Services Provider");
    }

    private List<String> kotlinModules() {
        return Arrays.asList("What is Cloud Computing ?" , "Types Of Cloud" , "Cloud Services Models" , "Virtualization" , "Cloud Services Provider");
    }

    private List<String> swiftModules() {
        return Arrays.asList("What is Cloud Computing ?" , "Types Of Cloud" , "Cloud Services Models" , "Virtualization" , "Cloud Services Provider");
    }

    private List<String> netModules() {
        return Arrays.asList(".Net Framework" , "C# Tutorial" , "C# Control Statement" , "C# Function" , "C# Arrays" , "C# Object Class" , "C# Properties" , "C# Inheritance" , "C# Polymorphism" , "C# Abstraction" , "C# Namespace" , "C# Strings" , "C# Exception Handling" , "C# File IO" , "C# Collections" , "C# Generics" , "C# Delegates" , "C# Reflection" , "Anonymous Function" , "C# Multithreading" , "C# Synchronization" , "C# Web Service");
    }

    private List<String> aspnetModules() {
        return Arrays.asList("ASP.NET Tutorial" , "ASP.NET Web Forms" , "ASP.NET Validation" , "ASP.NET MVC" , "ASP.NET Razor");
    }

    private List<String> cshapModules() {
        return Arrays.asList(".Net Framework" , "C# Tutorial" , "C# Control Statement" , "C# Function" , "C# Arrays" , "C# Object Class" , "C# Properties" , "C# Inheritance" , "C# Polymorphism" , "C# Abstraction" , "C# Namespace" , "C# Strings" , "C# Exception Handling" , "C# File IO" , "C# Collections" , "C# Generics" , "C# Delegates" , "C# Reflection" , "Anonymous Function" , "C# Multithreading" , "C# Synchronization" , "C# Web Service");
    }

    private List<String> pythonModules() {
        return Arrays.asList("Python Tutorial" , "Python OOPs" , "Python MySQL" , "Python MongoDB" , "Python SQLite");
    }

    private List<String> programmingincModules() {
        return Arrays.asList("C Tutorial" , "C Control Statements" , "C Functions" , "C Array" , "C Pointers" , "C Dynamic Memory" , "C Strings" , "C Math" , "C Structure Union" , "C File Handling" , "C Preprocessor" , "C Command Line");
    }

    private List<String> cplusplusModules() {
        return Arrays.asList("C++ Tutorial" , "C++ Control Statement" , "C++ Functions" , "C++ Arrays" , "C++ Pointers" , "C++ Object Class" , "C++ Inheritance" , "C++ Polymorphism" , "C++ Abstraction" , "C++ Namespaces" , "C++ Strings" , "C++ Exceptions" , "C++ Templates" , "Signal Handling" , "C++ File & Stream");
    }

    private List<String> rubyModules() {
        return Arrays.asList("Ruby Tutorial" , "Control Statements" , "Ruby Core" , "Ruby Advance");
    }

    private List<String> golangModules() {
        return Arrays.asList("Go Language Tutorial" , "Go Controls" , "Go Functions" , "Go Arrays" , "Go Strings" , "Go Types" , "Go Map" , "Go Error" , "Go Concurrency" , "Go Time");
    }

    private List<String> contentmarketingModules() {
        return Arrays.asList("What is Cloud Computing ?" , "Types Of Cloud" , "Cloud Services Models" , "Virtualization" , "Cloud Services Provider");
    }

    private List<String> mobilemarketingModules() {
        return Arrays.asList("What is Cloud Computing ?" , "Types Of Cloud" , "Cloud Services Models" , "Virtualization" , "Cloud Services Provider");
    }

    private List<String> videomarketingModules() {
        return Arrays.asList("What is Cloud Computing ?" , "Types Of Cloud" , "Cloud Services Models" , "Virtualization" , "Cloud Services Provider");
    }

    private List<String> emailmarketingModules() {
        return Arrays.asList("What is Cloud Computing ?" , "Types Of Cloud" , "Cloud Services Models" , "Virtualization" , "Cloud Services Provider");
    }

    private List<String> seoModules() {
        return Arrays.asList("What is Cloud Computing ?" , "Types Of Cloud" , "Cloud Services Models" , "Virtualization" , "Cloud Services Provider");
    }

    private List<String> socialmediamarketingModules() {
        return Arrays.asList("What is Cloud Computing ?" , "Types Of Cloud" , "Cloud Services Models" , "Virtualization" , "Cloud Services Provider");
    }

    private List<String> websitemarketingModules() {
        return Arrays.asList("What is Cloud Computing ?" , "Types Of Cloud" , "Cloud Services Models" , "Virtualization" , "Cloud Services Provider");
    }

    private List<String> softwaretestingModules() {
        return Arrays.asList("What is Software Testing ?" , "SDLC models" , "Types of Testing" , "Types of Manual" , "White Box Techniques" , "Black Box Techniques" , "Types of Black Box" , "Types of Functional" , "Types of Non-functional" , "Test case development" , "Testing Techniques" , "Test Management" , "Defect Tracking" , "Other types of Testing" , "Software Testing Tools");
    }

    private List<String> seleniumModules() {
        return Arrays.asList("What is Selenium ?" , "Selenium IDE" , "Selenium WebDriver");
    }

    private List<String> qualityassuranceModules() {
        return Arrays.asList("What is Quality Assurance ?" , "Software Testing" , "Black Box Testing" , "White Box Testing" , "Types of Testing" , "Levels of Testing");
    }

    private List<String> manualtestingModules() {
        return Arrays.asList("Why we need manual testing ?" , "SDLC models" , "Types of Testing" , "Types of Manual" , "White Box Techniques" , "Black Box Techniques" , "Types of Black Box" , "Types of Functional" , "Types of Non-functional" , "Test case development" , "Testing Techniques" , "Test Management" , "Defect Tracking" , "Other types of Testing" , "Software Testing Tools");
    }

    private List<String> appiumModules() {
        return Collections.singletonList("Appium Tutorial");
    }

}
