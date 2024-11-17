package com.example.learning.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.example.learning.R;

public class TaskSliderAdapter extends PagerAdapter {

    public Context context;
    private final int[] imageIds = {R.drawable.slide1 , R.drawable.slide2 , R.drawable.slide3 , R.drawable.slide4};
    private final LayoutInflater layoutInflater;

    public TaskSliderAdapter(Context context) {
        this.context = context;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return imageIds.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view , @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container , int position) {
        View view = layoutInflater.inflate(R.layout.slider_item , container , false);

        ImageView imageView = view.findViewById(R.id.imageView);
        imageView.setImageResource(imageIds[position]);

        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container , int position , @NonNull Object object) {
        container.removeView((View) object);
    }
}
