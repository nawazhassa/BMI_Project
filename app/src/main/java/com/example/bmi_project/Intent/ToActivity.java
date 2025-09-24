package com.example.bmi_project.Intent;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.bmi_project.R;

public class ToActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_to);


        String title = getIntent().getStringExtra("Title");
        int id = getIntent().getIntExtra("id", 0);
        String name = getIntent().getStringExtra("Name");
        String Activity = getIntent().getStringExtra("Activity");

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(Activity);

        TextView txtV;

        txtV = findViewById(R.id.txtV);

        txtV.setText(title + id + name);
            getSupportActionBar().setTitle(Activity);


    }
}