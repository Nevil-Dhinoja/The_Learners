package com.example.learning.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.learning.R;
import com.makeramen.roundedimageview.RoundedImageView;


public class SearchFragmentRVAdapter extends RecyclerView.Adapter<SearchFragmentRVAdapter.MYViewHolder> {

    String[] top_searches_items_arry;

    public SearchFragmentRVAdapter(String[] top_searches_items_arry) {
        this.top_searches_items_arry = top_searches_items_arry;
    }

    @NonNull
    @Override
    public MYViewHolder onCreateViewHolder(@NonNull ViewGroup parent , int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.search_top_search_item , parent , false);
        return new MYViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SearchFragmentRVAdapter.MYViewHolder holder , int position) {
        String t = top_searches_items_arry[position];
        holder.item_button.setText(t);
    }

    @Override
    public int getItemCount() {
        return top_searches_items_arry.length;
    }

    public class MYViewHolder extends RecyclerView.ViewHolder {
        Button item_button;

        public MYViewHolder(@NonNull View itemView) {
            super(itemView);
            item_button = itemView.findViewById(R.id.item_button);
        }
    }
}
