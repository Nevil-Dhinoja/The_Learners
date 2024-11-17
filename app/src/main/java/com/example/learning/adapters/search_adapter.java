package com.example.learning.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.learning.Models.Get_course;
import com.example.learning.R;
import com.example.learning.activities.Enroll_Activity;

import java.util.ArrayList;

public class search_adapter extends RecyclerView.Adapter<search_adapter.MYViewHolder> {
    private final Context context;
    private ArrayList<Get_course.GetCourse> getCourses;

    public search_adapter(Context context, ArrayList<Get_course.GetCourse> getCourses) {
        this.context = context;
        this.getCourses = getCourses;
    }

    @NonNull
    @Override
    public MYViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.courses, parent, false);
        return new MYViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull search_adapter.MYViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.bind(getCourses.get(position));
        holder.cat_course_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Get_course.GetCourse course = getCourses.get(position); // Get the course at the current position
                Intent intent = new Intent(holder.itemView.getContext(), Enroll_Activity.class);
                intent.putExtra("course_name", course.getName()); // Use the course name from the object
                intent.putExtra("course_id", holder.course_id);
                intent.putExtra("cat_name", holder.cat_course_name.getText().toString());
                intent.putExtra("cat_type", holder.cat_course_type.getText().toString());
                holder.itemView.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return getCourses.size();
    }

    public class MYViewHolder extends RecyclerView.ViewHolder {
        ImageView cat_course_img;
        TextView cat_course_name, cat_course_type;
        String course_id;
        CardView cat_course_card;

        public MYViewHolder(@NonNull View itemView) {
            super(itemView);
            cat_course_img = itemView.findViewById(R.id.course_img);
            cat_course_name = itemView.findViewById(R.id.course);
            cat_course_type = itemView.findViewById(R.id.category);
            cat_course_card = itemView.findViewById(R.id.course_card);
        }

        public void bind(Get_course.GetCourse category) {
            cat_course_name.setText(category.getName());
            cat_course_type.setText(category.getLevel());
            course_id = category.getId();
            Glide.with(context).load(category.getImage()).into(cat_course_img);
        }
    }

    // Method to update the adapter's data
    public void setData(ArrayList<Get_course.GetCourse> updatedList) {
        this.getCourses = updatedList;
        notifyDataSetChanged();
    }
}
