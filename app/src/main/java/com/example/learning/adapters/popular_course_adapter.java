package com.example.learning.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
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
import com.example.learning.Models.Get_course;
import com.example.learning.R;
import com.example.learning.activities.Enroll_Activity;
import com.example.learning.database.DBHelper;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

public class popular_course_adapter extends RecyclerView.Adapter<popular_course_adapter.MYViewHolder> {
    private final Context context;
    ArrayList<Get_course.GetCourse> getCourses;
    public popular_course_adapter(Context context,ArrayList<Get_course.GetCourse> getCourses) {
        this.context = context;
        this.getCourses = getCourses;
    }
    @NonNull
    @Override
    public MYViewHolder onCreateViewHolder(@NonNull ViewGroup parent , int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.popular_course , parent , false);
        return new MYViewHolder(view);
    }
@Override
public void onBindViewHolder(@NonNull popular_course_adapter.MYViewHolder holder, @SuppressLint("RecyclerView") int position) {
    holder.bind(getCourses.get(position));
    holder.cat_course_card.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Get_course.GetCourse course = getCourses.get(position); // Get the course at the current position
            Intent intent = new Intent(holder.itemView.getContext(), Enroll_Activity.class);
            intent.putExtra("course_name", course.getName()); // Use the course name from the object
            intent.putExtra("course_id",holder.course_id);
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
            cat_course_img = itemView.findViewById(R.id.image);
            cat_course_name = itemView.findViewById(R.id.title);
            cat_course_type = itemView.findViewById(R.id.category);
            cat_course_card = itemView.findViewById(R.id.card);
        }
        public void bind(Get_course.GetCourse category)
        {
            cat_course_name.setText(category.getName());
            cat_course_type.setText(category.getLevel());
            course_id = category.getId();
            Glide.with(context).load(category.getImage()).into(cat_course_img);
        }
    }

    private byte[] getByteArrayFromImageResource(int imageResource) {
        Bitmap bitmap = BitmapFactory.decodeResource(context.getResources(), imageResource);
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, stream);
        return stream.toByteArray();
    }
}
