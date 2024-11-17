//package com.example.learning.adapters;
//
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.TextView;
//
//import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.RecyclerView;
//
//import com.example.learning.R;
//
//import java.util.List;
//
//public class EnrollActivityRVAdapter extends RecyclerView.Adapter<EnrollActivityRVAdapter.MYViewHolder> {
//    List<String> module_arry;
//
//    public EnrollActivityRVAdapter(List<String> module_arry) {
//        this.module_arry = module_arry;
//    }
//    @NonNull
//    @Override
//    public MYViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.enroll_rv_item,parent,false);
//        return new MYViewHolder(view);
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull EnrollActivityRVAdapter.MYViewHolder holder, int position) {
//        String n = module_arry.get(position);
//        holder.module_name.setText(n);
//
//    }
//
//    @Override
//    public int getItemCount() {
//        return module_arry.size();
//    }
//
//    public class MYViewHolder extends RecyclerView.ViewHolder {
//        TextView module_name;
//        public MYViewHolder(@NonNull View itemView) {
//            super(itemView);
//            module_name = itemView.findViewById(R.id.module_name);
//        }
//    }
//}
package com.example.learning.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.learning.R;

import java.util.List;

public class EnrollActivityRVAdapter extends RecyclerView.Adapter<EnrollActivityRVAdapter.MYViewHolder> {
    List<String> module_arry;

    public EnrollActivityRVAdapter(List<String> module_arry) {
        this.module_arry = module_arry;
    }

    @NonNull
    @Override
    public MYViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.enroll_rv_item, parent, false);
        return new MYViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EnrollActivityRVAdapter.MYViewHolder holder, int position) {
        String n = module_arry.get(position);
        holder.module_name.setText(n);
    }

    @Override
    public int getItemCount() {
        if (module_arry != null) {
            return module_arry.size();
        } else {
            return 0;
        }
    }

    public class MYViewHolder extends RecyclerView.ViewHolder {
        TextView module_name;

        public MYViewHolder(@NonNull View itemView) {
            super(itemView);
            module_name = itemView.findViewById(R.id.module_name);
        }
    }
}
