package com.example.learning.adapters;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.learning.R;
import com.example.learning.database.DBHelper;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

import java.util.List;

public class FavouriteCourseAdapter extends RecyclerView.Adapter<FavouriteCourseAdapter.RecyclerViewHolder> {
    List<String> text;
    List<Bitmap> images;
    List<String> category;
    Context context;

    public FavouriteCourseAdapter(Context context , List<String> text , List<Bitmap> images , List<String> category) {
        this.text = text;
        this.images = images;
        this.category = category;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent , int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.favourite_course_item , parent , false);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder , int position) {
        String t = text.get(position);
        Bitmap i = images.get(position);
        String c = category.get(position);

        holder.fitem_text.setText(t);
        holder.fitem_category.setText(c);

        Glide.with(holder.itemView.getContext())
                .load(i)
                .diskCacheStrategy(DiskCacheStrategy.NONE)
                .skipMemoryCache(true)
                .into(holder.fitem_image);

        holder.fitem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DBHelper dbHelper = new DBHelper(context);
                GoogleSignInAccount account = GoogleSignIn.getLastSignedInAccount(context);
                String email = account.getEmail();
                String i = holder.fitem_text.getText().toString();
                String c = holder.fitem_category.getText().toString();
                boolean res = dbHelper.delete_favourite_course(i , c , email);
                if (res) {
                    int deletedPosition = holder.getAdapterPosition();
                    text.remove(deletedPosition);
                    images.remove(deletedPosition);
                    category.remove(deletedPosition);
                    notifyItemRemoved(deletedPosition);
                    Toast.makeText(context , "Course Deleted Successfully" , Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(context , "Course Delete Failed" , Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return text.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder {
        TextView fitem_text, fitem_category;
        ImageView fitem_image, fitem;

        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            fitem_text = itemView.findViewById(R.id.fitem_text);
            fitem_image = itemView.findViewById(R.id.fitem_image);
            fitem_category = itemView.findViewById(R.id.fitem_category);
            fitem = itemView.findViewById(R.id.fitem);
        }
    }
}