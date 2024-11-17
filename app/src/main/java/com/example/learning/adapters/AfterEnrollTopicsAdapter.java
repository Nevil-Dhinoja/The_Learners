package com.example.learning.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.learning.R;

import java.util.List;

public class AfterEnrollTopicsAdapter extends RecyclerView.Adapter<AfterEnrollTopicsAdapter.MyViewHolder> {
    Context context;
    List<String> topics_arry;
    public AfterEnrollTopicsAdapter(Context applicationContext, List<String> topicsArry) {
        this.context = applicationContext;
        this.topics_arry = topicsArry;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.topics_item_design,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AfterEnrollTopicsAdapter.MyViewHolder holder, int position) {
        String topic = topics_arry.get(position);
        holder.topic_name.setText(topic);
    }

    @Override
    public int getItemCount() {
        return topics_arry.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView topic_name;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            topic_name = itemView.findViewById(R.id.topic_name);
        }
    }
}