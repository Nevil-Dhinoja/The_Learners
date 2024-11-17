package com.example.learning.fragments;

import static androidx.fragment.app.FragmentManager.TAG;

import android.annotation.SuppressLint;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.SearchView;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;
import com.bumptech.glide.Glide;
import com.example.learning.Models.ApiInterface;
import com.example.learning.Models.Get_course;
import com.example.learning.Models.RetrofitClient;
import com.example.learning.R;
import com.example.learning.activities.CategoryCourseActivity;
import com.example.learning.activities.FavouriteCoursesActivity;
import com.example.learning.activities.NotificationBroadcastReceiver;
import com.example.learning.activities.SeeallCourseActivity;
import com.example.learning.activities.android_course;
import com.example.learning.activities.web_course;
import com.example.learning.adapters.TaskSliderAdapter;
import com.example.learning.adapters.popular_course_adapter;
import com.example.learning.others.CustomLoadingDialog;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HomeFragment extends Fragment {
    private ViewPager viewPager;
    ImageView profile_picture, fav;
    public TaskSliderAdapter taskSliderAdapter;
    private final int delay = 2000;
    SearchView searchView;
    private Handler handler;
    private Runnable runnable;
    TextView profile_name, name, see,app,web;
    RecyclerView popular_course;
    CardView all_category, category_app_dev, category_web_dev;
    popular_course_adapter adapter;
    ArrayList<Get_course.GetCourse> getCourses;
    CustomLoadingDialog customLoadingDialog;

    @Override
    public View onCreateView(LayoutInflater inflater , ViewGroup container , Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home , container , false);
        customLoadingDialog = new CustomLoadingDialog(requireContext());
        getCourses = new ArrayList<>();
        // finding id's...
        name = view.findViewById(R.id.profile_email);
        viewPager = view.findViewById(R.id.viewPager);
        profile_picture = view.findViewById(R.id.profile_picture);
        fav = view.findViewById(R.id.fav);
        see = view.findViewById(R.id.see_all);
        all_category = view.findViewById(R.id.all_category);
        category_app_dev = view.findViewById(R.id.category_app_dev);
        category_web_dev = view.findViewById(R.id.category_web_dev);
        //Code Starts from here...
        taskSliderAdapter = new TaskSliderAdapter(getContext());
        viewPager.setAdapter(taskSliderAdapter);
        GoogleSignInOptions gso;
        GoogleSignInClient gsc;
        gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestEmail().build();
        gsc = GoogleSignIn.getClient(getActivity() , gso);
        GoogleSignInAccount account = GoogleSignIn.getLastSignedInAccount(getActivity());
        if (account != null) {
            String personName = account.getDisplayName();
            Uri personPhoto = account.getPhotoUrl();
            name.setText(personName);
            if (personPhoto != null) {
                Glide.with(this).load(personPhoto).into(profile_picture);
            }
        }
        popular_course = view.findViewById(R.id.popular_course_rv);
        adapter = new popular_course_adapter(getContext(),getCourses);
        popular_course.setLayoutManager(new LinearLayoutManager(getContext() , LinearLayoutManager.VERTICAL , false));
        popular_course.setAdapter(adapter);
        fetch();
        fav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext() , FavouriteCoursesActivity.class);
                startActivity(intent);

            }
        });
        see.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity() , SeeallCourseActivity.class);
                startActivity(intent);
            }
        });
        category_app_dev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), android_course.class);
//                intent.putExtra("course_name","App Development");
                startActivity(intent);
            }
        });
        category_web_dev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), web_course.class);
//                intent.putExtra("course_name","Web Technologies");
                startActivity(intent);
            }
        });
        profile_picture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent = new Intent(getActivity() , MyprofileFragment.class);
//                startActivity(intent);
            }
        });
        all_category.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext() , SeeallCourseActivity.class);
                startActivity(intent);
            }
        });
//        category_app_dev.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getContext() , CategoryCourseActivity.class);
//                intent.putExtra("category_id","4"); // Pass category ID
//                intent.putExtra("course_name" , "App Development");
//                startActivity(intent);
//            }
//        });
//        category_web_dev.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getContext() , CategoryCourseActivity.class);
//                intent.putExtra("category_id","3"); // Pass category ID
//                intent.putExtra("course_name" , "Web Development");
//                startActivity(intent);
//            }
//        });
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        if (handler == null) {
            handler = new Handler();
            runnable = new Runnable() {
                public void run() {
                    if (taskSliderAdapter.getCount() == viewPager.getCurrentItem() + 1) {
                        viewPager.setCurrentItem(0);
                    } else {
                        viewPager.setCurrentItem(viewPager.getCurrentItem() + 1 , true);
                    }
                    handler.postDelayed(this , delay);
                }
            };
            handler.postDelayed(runnable , delay);
            handler.postDelayed(runnable , delay);
        }
        customLoadingDialog.show();
        updatePopularCourseAdapter();
    }

    @Override
    public void onPause() {
        super.onPause();
        if (handler != null) {
            handler.removeCallbacks(runnable);
            handler = null; // Release the handler
        }
    }

    private void updatePopularCourseAdapter() {
        // Show the loading dialog
        customLoadingDialog.show();

        // Perform heavy operations in the background
        new Thread(new Runnable() {
            @Override
            public void run() {
                // Simulate a delay or perform heavy operations
                try {
                    Thread.sleep(2000); // Simulate a delay of 2 seconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                // Update the adapter on the main UI thread
                getActivity().runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        adapter.notifyDataSetChanged();
                        // Dismiss the loading dialog
                        customLoadingDialog.dismiss();
                    }
                });
            }
        }).start();
    }
    public void fetch() {
        customLoadingDialog.show();
        ApiInterface apiInterface = RetrofitClient.getClient().create(ApiInterface.class);
        Call<Get_course> call = apiInterface.get_course("get_course", "3");
        call.enqueue(new Callback<Get_course>() {
            @SuppressLint({"NotifyDataSetChanged" , "RestrictedApi"})
            @Override
            public void onResponse(@NonNull Call<Get_course> call, @NonNull Response<Get_course> response) {
                if (response.isSuccessful()) {
                    customLoadingDialog.dismiss();
                    Get_course get_course = response.body();
                    if (get_course != null && get_course.getGetCourse() != null) {
                        getCourses.addAll(get_course.getGetCourse());
                        adapter.notifyDataSetChanged();
                    }
                } else {
                    customLoadingDialog.dismiss();
                    Log.e(TAG, "Unsuccessful response: " + response.message());
                }
            }

            @SuppressLint("RestrictedApi")
            @Override
            public void onFailure(@NonNull Call<Get_course> call, @NonNull Throwable t) {
                Log.e(TAG, "onFailure: " + t.getMessage());
            }
        });
    }
}
