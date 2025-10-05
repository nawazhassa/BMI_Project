package com.example.bmi_project.Notification;

import android.Manifest;
import android.annotation.SuppressLint;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.bmi_project.R;

public class No_ extends AppCompatActivity {

    private static final String Channal_ID = "Channal";
    private static final String Channal_Name = "Notification Channal";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_no);
        createNotificationChannal();
        showNotification();

    }


    private void createNotificationChannal() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel Channal = new NotificationChannel(
                    Channal_ID,
                    Channal_Name,
                    NotificationManager.IMPORTANCE_HIGH);
            NotificationManagerCompat manager = NotificationManagerCompat.from(this);
            manager.createNotificationChannel(Channal);
        }
    }


    private void showNotification() {


        /*Drawable drawable = ResourcesCompat.getDrawable(getResources(), R.drawable.large_icon, null);
        BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
        Bitmap largeIcon = bitmapDrawable.getBitmap();*/


        Bitmap largeIcon = BitmapFactory.decodeResource(
                getResources(),
                R.drawable.large_icon
        );


        NotificationCompat.Builder notification = new NotificationCompat.Builder(this, Channal_ID)
                .setSmallIcon(R.drawable.large_icon)
                .setLargeIcon(largeIcon)
                .setContentTitle("Notification")
                .setContentText("This is a heads-up notification")
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setDefaults(NotificationCompat.DEFAULT_ALL)
                .setAutoCancel(false)
                .setCategory(NotificationCompat.CATEGORY_MESSAGE);

        NotificationManagerCompat manager = NotificationManagerCompat.from(this);

//        manager.notify(1, notification.build());
//        manager.notify(2, notification.build());


    }


}