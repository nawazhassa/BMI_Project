package com.example.bmi_project.Intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.bmi_project.R;

public class FromActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_from);


        Button btn;


        btn = findViewById(R.id.btn);
        btn.setOnClickListener(v -> {

            Intent intent = new Intent(FromActivity.this, ToActivity.class);
            intent.putExtra("Activity" , "HomePage");
            intent.putExtra("Name" , "Hasan");
            intent.putExtra("Title" , "Intent Filter");
            intent.putExtra("id" , 1);

            startActivity(intent);
        });


    }
}