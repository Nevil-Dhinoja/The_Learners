package com.example.learning.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.viewpager.widget.ViewPager;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MenuItem;
import android.view.WindowManager;

import com.example.learning.R;
import com.example.learning.adapters.MainActivityVPAdapter;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    ViewPager vp;
    BottomNavigationView bnv;
    private static final String PREF_LAST_OPEN_TIME = "last_open_time";
    private static boolean isLaunched = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        configureUI();
        getSupportActionBar().hide();
        screenshot_and_nightmode();
        isLaunched = true;
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
    }

    private void configureUI() {
        getSupportActionBar().hide();
        setWindowFlags();
        setupViewPagerAndNavigation();
    }

    private void setWindowFlags() {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE , WindowManager.LayoutParams.FLAG_SECURE);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
    }
        private void setupViewPagerAndNavigation() {
            vp = findViewById(R.id.vp);
            bnv = findViewById(R.id.bnv);

            MainActivityVPAdapter adapter = new MainActivityVPAdapter(getSupportFragmentManager());
            vp.setAdapter(adapter);
            bnv.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    handleNavigationItemSelected(item);
                    return true;
                }
            });

        vp.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position , float positionOffset , int positionOffsetPixels) {
            }

            @Override
            public void onPageSelected(int position) {
                bnv.getMenu().getItem(position).setChecked(true);
            }

            @Override
            public void onPageScrollStateChanged(int state) {
            }
        });
        vp.setOffscreenPageLimit(4);
    }

    private void handleNavigationItemSelected(MenuItem item) {
        int itemId = item.getItemId();
        if (itemId == R.id.menu_home) {
            vp.setCurrentItem(0);
        } else if (itemId == R.id.menu_search) {
            vp.setCurrentItem(1);
        } else if (itemId == R.id.menu_mycourse) {
            vp.setCurrentItem(2);
        } else if (itemId == R.id.menu_myprofile) {
            vp.setCurrentItem(3);
        }
    }

    private void screenshot_and_nightmode() {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE , WindowManager.LayoutParams.FLAG_SECURE);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
    }

    @Override
    public void onResume() {
        super.onResume();
//        scheduleNotificationIfNeeded();
    }
    private void scheduleNotificationIfNeeded() {
        SharedPreferences preferences = this.getSharedPreferences("AppPreferences" , Context.MODE_PRIVATE);
        long lastOpenTime = preferences.getLong(PREF_LAST_OPEN_TIME , 0);
        long currentTime = System.currentTimeMillis();
        long timeDifference = currentTime - lastOpenTime;
        if (timeDifference >= 60 * 1000) {
//            scheduleNotification();
        }
    }

    private void scheduleNotification() {
        AlarmManager alarmManager = (AlarmManager) this.getSystemService(Context.ALARM_SERVICE);

        Intent notificationIntent = new Intent(this , NotificationBroadcastReceiver.class);
        PendingIntent pendingIntent = PendingIntent.getBroadcast(this , 0 , notificationIntent , PendingIntent.FLAG_UPDATE_CURRENT);
        long triggerTime = SystemClock.elapsedRealtime() + 24 * 60 * 60 * 1000;
        alarmManager.set(AlarmManager.ELAPSED_REALTIME_WAKEUP , triggerTime , pendingIntent);
    }
}