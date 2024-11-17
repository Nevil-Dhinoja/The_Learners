package com.example.learning.activities;

import static androidx.fragment.app.FragmentManager.TAG;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.learning.Models.ApiInterface;
import com.example.learning.Models.Get_certificate;
import com.example.learning.Models.Get_course_category;
import com.example.learning.Models.RetrofitClient;
import com.example.learning.R;
import com.example.learning.adapters.AllCourseAdapter;
import com.example.learning.adapters.MyCertificateRVAdapter;
import com.example.learning.adapters.MycourseFragmentRVAdapter;
import com.example.learning.others.CustomLoadingDialog;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MyCertificateActivity extends AppCompatActivity {

    RecyclerView mycertificates_rv;
    TextView activity_name;
    ImageView back_icon;
    final static int REQUEST_CODE = 1232;
    MyCertificateRVAdapter adapter;
    ArrayList<Get_certificate.GetCertificate> getCertificates;
    CustomLoadingDialog customLoadingDialog;
    SharedPreferences sharedPreferences;

    String userEmail, course_id, course_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_certificate);
        GoogleSignInAccount account = GoogleSignIn.getLastSignedInAccount(getApplicationContext());
        userEmail = account != null ? account.getEmail() : "";
        customLoadingDialog = new CustomLoadingDialog(this);
        sharedPreferences = getSharedPreferences("MyPrefs" , MODE_PRIVATE);

        // Retrieve course_name and course_id from SharedPreferences
        course_name = sharedPreferences.getString("course_name" , "");
        course_id = sharedPreferences.getString("course_id" , "");

        askPermissions();

        activity_name = findViewById(R.id.activity_name);
        back_icon = findViewById(R.id.back_icon);
        activity_name.setText("My Certificates");
        back_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });


        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        mycertificates_rv = findViewById(R.id.mycertificates_rv);
        getCertificates = new ArrayList<>();
        adapter = new MyCertificateRVAdapter(MyCertificateActivity.this , getCertificates);
        mycertificates_rv.setLayoutManager(new LinearLayoutManager(getApplicationContext() , LinearLayoutManager.VERTICAL , false));
        mycertificates_rv.setAdapter(adapter);
        adapter.notifyDataSetChanged();
        fetch();
        customLoadingDialog.dismiss();
      if(ActivityCompat.checkSelfPermission(this,Manifest.permission.WRITE_EXTERNAL_STORAGE)
            ==PackageManager.PERMISSION_GRANTED)
    {
        fetch();
    } else {
          // Permission is not granted, request it
          ActivityCompat.requestPermissions(this,
                  new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, REQUEST_CODE);
      }
}

    @Override
    public void onRequestPermissionsResult(int requestCode , @NonNull String[] permissions ,
                                           @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode , permissions , grantResults);
        if (requestCode == REQUEST_CODE) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                // Permission granted, proceed with your logic
                fetch();
            } else {
                Toast.makeText(this , "Please Give Permission" , Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void fetch() {
        customLoadingDialog.show();
        ApiInterface apiInterface = RetrofitClient.getClient().create(ApiInterface.class);
        Call<Get_certificate> call = apiInterface.get_certificate("get_certificate" , userEmail , course_name);
        call.enqueue(new Callback<Get_certificate>() {
            @SuppressLint({"NotifyDataSetChanged" , "RestrictedApi"})
            @Override
            public void onResponse(@NonNull Call<Get_certificate> call , @NonNull Response<Get_certificate> response) {
                if (response.isSuccessful()) {
                    customLoadingDialog.dismiss();
                    Get_certificate get_certificate = response.body();
                    if (get_certificate != null && get_certificate.getGetCertificate() != null) {
                        getCertificates.clear();
                        getCertificates.addAll(get_certificate.getGetCertificate());
                        adapter.notifyDataSetChanged();
                    }
                } else {
                    customLoadingDialog.dismiss();
                    Log.e(TAG , "Unsuccessful response: " + response.message());
                }
            }

            @SuppressLint("RestrictedApi")
            @Override
            public void onFailure(@NonNull Call<Get_certificate> call , @NonNull Throwable t) {
                Log.e(TAG , "onFailure: " + t.getMessage());
            }
        });
    }
    private void askPermissions() {
        ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, REQUEST_CODE);
    }
}