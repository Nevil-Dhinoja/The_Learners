package com.example.learning.adapters;

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
import com.example.learning.Models.Get_course_category;
import com.example.learning.R;
import com.example.learning.activities.CategoryCourseActivity;

import java.util.ArrayList;

//public class AllCourseAdapter extends RecyclerView.Adapter<AllCourseAdapter.MYViewHolder> {
//
//    int[] course_img_arry;
//    String[] course_name_arry;
//    String[] course_cat_arry;
//    Context context;
//    ArrayList<Get_course_category.GetCategory> getCategories;
//    public AllCourseAdapter(Context context,ArrayList<Get_course_category.GetCategory> getCategories) {
//        this.context = context;
//        this.getCategories = getCategories;
//    }
//
//    @NonNull
//    @Override
//    public MYViewHolder onCreateViewHolder(@NonNull ViewGroup parent , int viewType) {
//        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.one_course_item , parent , false);
//        return new MYViewHolder(view);
//    }
//
//
//    @Override
//    public void onBindViewHolder(@NonNull AllCourseAdapter.MYViewHolder holder , int position) {
//        holder.bind(getCategories.get(position));
//    }
//
//    @Override
//    public int getItemCount() {
//        return getCategories.size();
//    }
//
//    public class MYViewHolder extends RecyclerView.ViewHolder {
//        ImageView course_img;
//        TextView course_name, course_category;
//        CardView cv;
//
//        public MYViewHolder(@NonNull View itemView) {
//            super(itemView);
//            course_img = itemView.findViewById(R.id.course_img);
//            course_name = itemView.findViewById(R.id.course_name);
//            course_category = itemView.findViewById(R.id.course_category);
//            cv = itemView.findViewById(R.id.cv);
//            cv.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    Intent intent = new Intent(itemView.getContext() , CategoryCourseActivity.class);
//                    intent.putExtra("course_name" , course_name.getText().toString());
//                    itemView.getContext().startActivity(intent);
//                }
//            });
//        }
//        public void bind(Get_course_category.GetCategory category)
//        {
//            course_name.setText(category.getName());
//            course_category.setText(category.getCourseCount());
//            Glide.with(context).load(category.getImage()).into(course_img);
//        }
//    }
//
//}
public class AllCourseAdapter extends RecyclerView.Adapter<AllCourseAdapter.MYViewHolder> {

    Context context;
    ArrayList<Get_course_category.GetCategory> getCategories;

    public AllCourseAdapter(Context context, ArrayList<Get_course_category.GetCategory> getCategories) {
        this.context = context;
        this.getCategories = getCategories;
    }

    @NonNull
    @Override
    public MYViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.one_course_item, parent, false);
        return new MYViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AllCourseAdapter.MYViewHolder holder, int position) {
        holder.bind(getCategories.get(position));
    }

    @Override
    public int getItemCount() {
        return getCategories.size();
    }

    public class MYViewHolder extends RecyclerView.ViewHolder {
        ImageView course_img;
        TextView course_name, course_category;
        CardView cv;
        String categoryId; // Include categoryId here

        public MYViewHolder(@NonNull View itemView) {
            super(itemView);
            course_img = itemView.findViewById(R.id.course_img);
            course_name = itemView.findViewById(R.id.course_name);
            course_category = itemView.findViewById(R.id.course_category);
            cv = itemView.findViewById(R.id.cv);

            cv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(itemView.getContext(), CategoryCourseActivity.class);
                    intent.putExtra("category_id", categoryId); // Pass category ID
                    intent.putExtra("course_name" , course_name.getText().toString());
                    itemView.getContext().startActivity(intent);
                }
            });
        }

        public void bind(Get_course_category.GetCategory category) {
            course_name.setText(category.getName());
            course_category.setText(category.getCourseCount());
            Glide.with(context).load(category.getImage()).into(course_img);
            categoryId = category.getId(); // Assign categoryId from the GetCategory object
        }
    }
}
