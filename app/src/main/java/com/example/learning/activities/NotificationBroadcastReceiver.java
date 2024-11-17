package com.example.learning.activities;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

import androidx.core.app.NotificationCompat;

import com.example.learning.R;

public class NotificationBroadcastReceiver extends BroadcastReceiver {

    private static final String CHANNEL_ID = "channel_id";
    private static final String CHANNEL_NAME = "My Channel";

    @Override
    public void onReceive(Context context , Intent intent) {
        // Create notification
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context , CHANNEL_ID)
                .setSmallIcon(R.drawable.bell)
                .setContentTitle("Don't forget to learn new courses!")
                .setContentText("You haven't opened the app for a while.")
                .setPriority(NotificationCompat.PRIORITY_DEFAULT);

        NotificationManager notificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        // Check if Android version is Oreo or higher, then create a notification channel
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel channel = new NotificationChannel(CHANNEL_ID , CHANNEL_NAME , NotificationManager.IMPORTANCE_DEFAULT);
            notificationManager.createNotificationChannel(channel);
        }
        // Show notification
        notificationManager.notify(0 , builder.build());
    }
}

