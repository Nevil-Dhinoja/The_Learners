package com.example.learning.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.learning.R;
import com.example.learning.activities.TopicContentActivity;

import java.util.List;
import java.util.Map;

public class AfterEnrollRVAdapter extends RecyclerView.Adapter<AfterEnrollRVAdapter.MyViewHolder> {

    Context context;
    private final List<String> module_arry;
    private final Map<String, List<String>> topicsMap;
    String cat_name;
    public AfterEnrollRVAdapter(String cat_name, Context context, List<String> module_arry, Map<String, List<String>> topicsMap) {
        this.module_arry = module_arry;
        this.topicsMap = topicsMap;
        this.context = context;
        this.cat_name = cat_name;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.module_item_design, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AfterEnrollRVAdapter.MyViewHolder holder, int position) {
        String module = module_arry.get(position);
        holder.module_name.setText(module);

        final List<String> topicsList = topicsMap.get(module);
        if (topicsList != null) {
            AfterEnrollTopicsAdapter adapter = new AfterEnrollTopicsAdapter(context, topicsList);
            holder.topics_rv.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false));
            holder.topics_rv.setAdapter(adapter);
            holder.module_card.setOnClickListener(v -> toggleDrawer(holder.topics, holder.topics_rv));
            holder.module_start_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context, TopicContentActivity.class);
                    intent.putExtra("cat_name",cat_name);
                    intent.putExtra("module_name", module);

                    if (topicsList != null) {
                        intent.putExtra("total_topics", topicsList.size());
                    } else {
                        intent.putExtra("total_topics", 0); // or any default value
                    }

                    holder.itemView.getContext().startActivity(intent);
                }
            });
        }
    }

    @Override
    public int getItemCount() {
        return module_arry.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        CardView module_card;
        TextView module_name;
        LinearLayout topics;
        RecyclerView topics_rv;
        Button module_start_btn;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            module_name = itemView.findViewById(R.id.module_name);
            topics = itemView.findViewById(R.id.topics);
            module_card = itemView.findViewById(R.id.module_card);
            topics_rv = itemView.findViewById(R.id.topics_rv);
            module_start_btn = itemView.findViewById(R.id.module_start_btn);

        }
    }

    private void toggleDrawer(LinearLayout topics, RecyclerView topicsRecyclerView) {
        if (topics.getVisibility() == View.VISIBLE) {
            topics.setVisibility(View.GONE);
            topicsRecyclerView.setVisibility(View.GONE);
        } else {
            topics.setVisibility(View.VISIBLE);
            topicsRecyclerView.setVisibility(View.VISIBLE);
        }
    }
}