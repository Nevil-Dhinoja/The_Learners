package com.example.learning.adapters;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.learning.fragments.HomeFragment;
import com.example.learning.fragments.MycourseFragment;
import com.example.learning.fragments.MyprofileFragment;
import com.example.learning.fragments.SearchFragment;

public class MainActivityVPAdapter extends FragmentPagerAdapter {
    public MainActivityVPAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new HomeFragment();
        } else if (position == 1) {
            return new SearchFragment();
        } else if (position == 2) {
            return new MycourseFragment();
        } else {
            return new MyprofileFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return "";
        } else if (position == 1) {
            return "";
        } else if (position == 2) {
            return "";
        } else {
            return "";
        }
    }
}
