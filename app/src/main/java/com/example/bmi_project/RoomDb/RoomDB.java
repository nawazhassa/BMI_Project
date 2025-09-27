package com.example.bmi_project.RoomDb;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.room.Room;

import com.example.bmi_project.R;

public class RoomDB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_room_db);

        new mainThread().start();


    }

    private class mainThread extends Thread {
        public void run() {
            super.run();
            AppDatabase db = Room.databaseBuilder(getApplicationContext(),
                    AppDatabase.class, "database-name").build();
            UserDao userDao = db.userDao();
            userDao.deleteAll();
            userDao.insertAll(new User("Hasan", "Nawaz"),new User("Hasan", "Nawaz"),new User("Hasan", "Nawaz"));
//            userDao.deleteById(1);



        }

    }


}