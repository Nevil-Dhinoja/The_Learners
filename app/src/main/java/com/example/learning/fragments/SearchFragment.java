package com.example.learning.fragments;

import static androidx.fragment.app.FragmentManager.TAG;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.SearchView;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.learning.Models.ApiInterface;
import com.example.learning.Models.Get_course;
import com.example.learning.Models.RetrofitClient;
import com.example.learning.R;
import com.example.learning.activities.CategoryCourseActivity;
import com.example.learning.activities.SeeallCourseActivity;
import com.example.learning.activities.android_course;
import com.example.learning.activities.web_course;
import com.example.learning.adapters.SearchFragmentRVAdapter;
import com.example.learning.adapters.search_adapter;
import com.example.learning.adapters.ModelClass;
import com.example.learning.others.CustomLoadingDialog;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SearchFragment extends Fragment {
    String top_searches_items_arry[] = {"Excel" , "Photoshop" , "WordPress" , "Cloud" , ".NET" , "Digital Marketing" , "AI" , "Java" , "python"};
    RecyclerView lv,search_rv;
    SearchView searchView;
    ArrayList<ModelClass> arrayList = new ArrayList<>();
    ArrayList<Get_course.GetCourse> getCourses = new ArrayList<>();
    CustomLoadingDialog customLoadingDialog;
    search_adapter searchAdapter;
    CardView app_Dev,web_dev,all_Cat;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_search, container, false);

        lv = view.findViewById(R.id.lv);
        searchView = view.findViewById(R.id.sv);
        search_rv = view.findViewById(R.id.search_rv);
        app_Dev =view.findViewById(R.id.category_app_dev);
        web_dev =view.findViewById(R.id.category_web_dev);
        all_Cat =view.findViewById(R.id.all_category);
        customLoadingDialog = new CustomLoadingDialog(getContext());

        searchView.setIconified(true);
        searchView.clearFocus();

        lv.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        searchAdapter = new search_adapter(getContext(), getCourses);
        lv.setAdapter(searchAdapter);
        int numberOfColumns = 3; // You can change this value to the number of columns you want
        SearchFragmentRVAdapter adapter = new SearchFragmentRVAdapter(top_searches_items_arry);
        search_rv.setLayoutManager(new GridLayoutManager(getContext() , numberOfColumns));
        search_rv.setAdapter(adapter);
        fetch();
         all_Cat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext() , SeeallCourseActivity.class);
                startActivity(intent);
            }
        });
        app_Dev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext() , android_course.class);
//                intent.putExtra("category_id","4"); // Pass category ID
//                intent.putExtra("course_name" , "App Development");
                startActivity(intent);
            }
        });
        web_dev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext() , web_course.class);
//                intent.putExtra("category_id","3"); // Pass category ID
//                intent.putExtra("course_name" , "Web Development");
                startActivity(intent);
            }
        });
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                ArrayList<Get_course.GetCourse> filteredList = filter(getCourses, query);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                // Filter the getCourses list based on the newText
                ArrayList<Get_course.GetCourse> filteredList = filter(getCourses, newText);
                // Update the adapter with the filtered list
                searchAdapter.setData(filteredList);
                return false;
            }
        });

        return view;
    }

    private ArrayList<Get_course.GetCourse> filter(ArrayList<Get_course.GetCourse> courses, String query) {
        ArrayList<Get_course.GetCourse> filteredList = new ArrayList<>();
        for (Get_course.GetCourse course : courses) {
            // Search by course name or category
            if (course.getName().toLowerCase().contains(query.toLowerCase()) ||
                    course.getName().toLowerCase().contains(query.toLowerCase())) {
                filteredList.add(course);
            }
        }
        return filteredList;
    }

    public void fetch() {
        customLoadingDialog.show();
        ApiInterface apiInterface = RetrofitClient.getClient().create(ApiInterface.class);
        Call<Get_course> call = apiInterface.get_course("get_course", "4");
        call.enqueue(new Callback<Get_course>() {
            @SuppressLint({"NotifyDataSetChanged", "RestrictedApi"})
            @Override
            public void onResponse(@NonNull Call<Get_course> call, @NonNull Response<Get_course> response) {
                if (response.isSuccessful()) {
                    customLoadingDialog.dismiss();
                    Get_course get_course = response.body();
                    if (get_course != null && get_course.getGetCourse() != null) {
                        getCourses.clear();
                        getCourses.addAll(get_course.getGetCourse());
                        searchAdapter.notifyDataSetChanged();
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
