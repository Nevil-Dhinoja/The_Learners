package com.example.learning.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.learning.R;
import com.makeramen.roundedimageview.RoundedImageView;

public class SearchFragmentRV2Adapter extends RecyclerView.Adapter<SearchFragmentRV2Adapter.MYViewHolder> {

    String[] top_searches_items_arry;
    int[] browse_items_img_arry;
    String[] browse_items_text_arry;

    public SearchFragmentRV2Adapter(int[] browse_items_img_arry , String[] browse_items_text_arry) {
        this.browse_items_img_arry = browse_items_img_arry;
        this.browse_items_text_arry = browse_items_text_arry;
    }

    @NonNull
    @Override
    public MYViewHolder onCreateViewHolder(@NonNull ViewGroup parent , int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.search_browse_item , parent , false);
        return new MYViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MYViewHolder holder , int position) {
        int i = browse_items_img_arry[position];
        holder.bitem_image.setImageResource(i);
        String t = browse_items_text_arry[position];
        holder.bitem_text.setText(t);
    }

    @Override
    public int getItemCount() {
        return browse_items_img_arry.length;
    }

    public class MYViewHolder extends RecyclerView.ViewHolder {
        RoundedImageView bitem_image;
        TextView bitem_text;

        public MYViewHolder(@NonNull View itemView) {
            super(itemView);
            bitem_image = itemView.findViewById(R.id.bitem_image);
            bitem_text = itemView.findViewById(R.id.bitem_text);
        }
    }
}
