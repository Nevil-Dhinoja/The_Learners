package com.example.learning.adapters;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.learning.R;
import com.example.learning.activities.CategoryCourseActivity;
import com.example.learning.activities.SeeallCourseActivity;

public class upcomming_course_adapter extends RecyclerView.Adapter<upcomming_course_adapter.MYViewHolder> {

    int[] upcomming_img_arry;
    String upcomming_course_cat_arry[];
    String upcomming_course_arry[];
    public upcomming_course_adapter(int[] upcomming_img_arry, String[] upcomming_course_cat_arry, String[] upcomming_course_arry) {
        this.upcomming_img_arry = upcomming_img_arry;
        this.upcomming_course_cat_arry = upcomming_course_cat_arry;
        this.upcomming_course_arry = upcomming_course_arry;
    }
    @NonNull
    @Override
    public MYViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.one_course_item,parent,false);
        return new MYViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull upcomming_course_adapter.MYViewHolder holder, int position) {
        String n = upcomming_course_cat_arry[position];
        String c = upcomming_course_arry[position];
        int i = upcomming_img_arry[position];
        holder.course_img.setImageResource(i);
        holder.course_name.setText(n);
        holder.course_category.setText(c);

    }

    @Override
    public int getItemCount() {
        return upcomming_course_arry.length;
    }

    public class MYViewHolder extends RecyclerView.ViewHolder {
        CardView course_card;
        ImageView course_img;
        TextView course_name,course_category;
        public MYViewHolder(@NonNull View itemView) {
            super(itemView);
            course_img = itemView.findViewById(R.id.course_img);
            course_name = itemView.findViewById(R.id.course_name);
            course_category = itemView.findViewById(R.id.course_category);
            course_card = itemView.findViewById(R.id.course_card);

//            course_card.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    Intent intent = new Intent(itemView.getContext(), CategoryCourseActivity.class);
//                    intent.putExtra("course_name",course_name.getText().toString());
//                    itemView.getContext().startActivity(intent);
//                }
//            });
        }
    }
}
