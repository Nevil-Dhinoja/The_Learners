package com.example.learning.fragments;

import static androidx.fragment.app.FragmentManager.TAG;

import android.annotation.SuppressLint;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.learning.Models.ApiInterface;
import com.example.learning.Models.Get_course_category;
import com.example.learning.Models.Get_enrolled_course;
import com.example.learning.Models.RetrofitClient;
import com.example.learning.R;
import com.example.learning.adapters.MycourseFragmentRVAdapter;
import com.example.learning.adapters.SearchFragmentRV2Adapter;
import com.example.learning.database.DBHelper;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MycourseFragment extends Fragment {

    RecyclerView mycourse_rv;
    MycourseFragmentRVAdapter adapter;
    ArrayList<Get_enrolled_course.GetEnrollCourse> getEnrollCourses_;


    @SuppressLint("NotifyDataSetChanged")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_mycourse, container, false);
        mycourse_rv = view.findViewById(R.id.mycourse_rv);
        getEnrollCourses_ = new ArrayList<>();
        adapter = new MycourseFragmentRVAdapter(getContext(),getEnrollCourses_);
        mycourse_rv.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        mycourse_rv.setAdapter(adapter);
        adapter.notifyDataSetChanged();
        fetch();
        return view;
    }
    public void fetch() {
        GoogleSignInAccount account = GoogleSignIn.getLastSignedInAccount(getContext());
        String userEmail = account != null ? account.getEmail() : "";
        ApiInterface apiInterface = RetrofitClient.getClient().create(ApiInterface.class);
        Call<Get_enrolled_course> call = apiInterface.get_enroll_course("get_enroll_course",
                userEmail);
        call.enqueue(new Callback<Get_enrolled_course>() {
            @SuppressLint({"NotifyDataSetChanged" , "RestrictedApi"})
            @Override
            public void onResponse(@NonNull Call<Get_enrolled_course> call, @NonNull Response<Get_enrolled_course> response) {
                if (response.isSuccessful()) {
                    Get_enrolled_course getEnrolledCourse = response.body();
                    if (getEnrolledCourse != null && getEnrolledCourse.getGetEnrollCourse() != null) {
                        getEnrollCourses_.clear();
                        getEnrollCourses_.addAll(getEnrolledCourse.getGetEnrollCourse());
                        adapter.notifyDataSetChanged();
                    }
                } else {
                    Log.e(TAG, "Unsuccessful response: " + response.message());
                }
            }

            @SuppressLint("RestrictedApi")
            @Override
            public void onFailure(@NonNull Call<Get_enrolled_course> call, @NonNull Throwable t) {
                Log.e(TAG, "onFailure: " + t.getMessage());
            }
        });
    }
    @Override
    public void onResume() {
        super.onResume();
        fetch();
    }
}