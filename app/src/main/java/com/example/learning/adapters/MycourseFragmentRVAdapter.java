package com.example.learning.adapters;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.learning.Models.Get_course_category;
import com.example.learning.Models.Get_enrolled_course;
import com.example.learning.R;
import com.example.learning.activities.AfterEnrollActivity;
import com.example.learning.activities.CategoryCourseActivity;
import com.example.learning.activities.MyCertificateActivity;

import java.util.ArrayList;
import java.util.List;

public class MycourseFragmentRVAdapter extends RecyclerView.Adapter<MycourseFragmentRVAdapter.MYViewHolder> {

    List<String> course_arry;
    List<Bitmap> images_arry;
    List<String> catname_arry;
    List<String> cattype_arry;
    String course_name, course_id;
    Context context;
    ArrayList<Get_enrolled_course.GetEnrollCourse> getEnrollCourses;


    public MycourseFragmentRVAdapter(Context context , ArrayList<Get_enrolled_course.GetEnrollCourse> getEnrollCourses) {
        this.context = context;
        this.getEnrollCourses = getEnrollCourses;
    }

    @NonNull
    @Override
    public MYViewHolder onCreateViewHolder(@NonNull ViewGroup parent , int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.mycourse_rv_item , parent , false);
        return new MYViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MycourseFragmentRVAdapter.MYViewHolder holder , int position) {
        holder.bind(getEnrollCourses.get(position));
    }

    @Override
    public int getItemCount() {
        return getEnrollCourses.size();
    }
public class MYViewHolder extends RecyclerView.ViewHolder {
    ImageView course_item_img;
    TextView course_item_name, course_item_type, course_item_cat;
    CardView course_item_card;

    public MYViewHolder(@NonNull View itemView) {
        super(itemView);
        course_item_img = itemView.findViewById(R.id.course_item_img);
        course_item_name = itemView.findViewById(R.id.course_item_name);
        course_item_cat = itemView.findViewById(R.id.course_item_cat);
        course_item_type = itemView.findViewById(R.id.course_item_type);
        course_item_card = itemView.findViewById(R.id.course_item_card);
    }

    public void bind(Get_enrolled_course.GetEnrollCourse category) {
        course_item_cat.setText(category.getCatName());
        course_item_name.setText(category.getName());
        course_item_type.setText(category.getLevel());
        Glide.with(context).load(category.getImage()).into(course_item_img);
        course_item_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, AfterEnrollActivity.class);
                intent.putExtra("course_name", category.getName()); // Pass course name
                intent.putExtra("course_id", category.getEnroollCourseId()); // Pass course ID
                context.startActivity(intent);
            }
        });
    }
}
}
