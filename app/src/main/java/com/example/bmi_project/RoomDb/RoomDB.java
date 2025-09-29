package com.example.bmi_project.RoomDb;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.room.Room;

import com.example.bmi_project.R;

public class RoomDB extends AppCompatActivity {

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_room_db);

        new mainThread().start();
        // Toolbar setup
        Toolbar toolbar = findViewById(R.id.toolbarr);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.getNavigationIcon().setTint(ContextCompat.getColor(this, R.color.white));
        getSupportActionBar().setTitle("adkjnfugd");
        getSupportActionBar().setSubtitle("adv");


        // Enable back button (arrow)
        getWindow().setStatusBarColor(
                ContextCompat.getColor(this, R.color.color_primary)
        );
    }

    // Inflate menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    // Handle menu clicks
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            // Back button clicked
            Toast.makeText(this, "Back clicked", Toast.LENGTH_SHORT).show();
            finish(); // close activity
            return true;
        } else if (item.getItemId() == R.id.action_settings) {
            // Settings clicked
            Toast.makeText(this, "Settings clicked", Toast.LENGTH_SHORT).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }




      /*  if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setNavigationBarColor(
                    ContextCompat.getColor(this, R.color.color_primary)
            );
        }*/


private class mainThread extends Thread {
    public void run() {
        super.run();
        AppDatabase db = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class, "database-name").build();
        UserDao userDao = db.userDao();
        userDao.deleteAll();
        userDao.insertAll(new User("Hasan", "Nawaz"), new User("Hasan", "Nawaz"), new User("Hasan", "Nawaz"));
//            userDao.deleteById(1);


    }

}

}

