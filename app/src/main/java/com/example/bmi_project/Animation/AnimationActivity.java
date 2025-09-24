package com.example.bmi_project.Animation;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.bmi_project.R;

public class AnimationActivity extends AppCompatActivity {
    TextView txtV;
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_animation);

         txtV = findViewById(R.id.txtV);
         btn1 = findViewById(R.id.btn1);


         btn1.setOnClickListener(v -> {
             Animation fade = AnimationUtils.loadAnimation(this,R.anim.translate);
             txtV.startAnimation(fade);
         });



    }
}