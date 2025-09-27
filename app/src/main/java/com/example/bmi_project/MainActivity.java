package com.example.bmi_project;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        EditText edtWeight, edtHeightFt, edtHeightIn;
        Button btnCalculateBmi;
        TextView txtResult;
        LinearLayout llColorChnage;

        edtWeight = findViewById(R.id.edtWeight);
        edtHeightFt = findViewById(R.id.edtHeightFt);
        edtHeightIn = findViewById(R.id.edtHeightIn);
        llColorChnage = findViewById(R.id.llColorChnage);
        btnCalculateBmi = findViewById(R.id.btnCalculateBmi);
        txtResult = findViewById(R.id.txtResult);


        btnCalculateBmi.setOnClickListener(v -> {
            int wT = Integer.parseInt(edtWeight.getText().toString().trim());
            int hFt = Integer.parseInt(edtHeightFt.getText().toString().trim());
            int hIn = Integer.parseInt(edtHeightIn.getText().toString().trim());


            int totalIn = hFt * 12 + hIn;
            double totalCm = totalIn * 2.53;
            double totalM = totalCm / 100;
            double totalBmi = wT / Math.pow(totalM, 2);


            if (totalBmi > 25) {
                txtResult.setText("You're Overweight!");
                llColorChnage.setBackgroundColor(getResources().getColor(R.color.Overweight));

            } else if (totalBmi < 18) {
                txtResult.setText("You're Underweight!");
                llColorChnage.setBackgroundColor(getResources().getColor(R.color.Underweight));

            } else {
                txtResult.setText("You're Healty!");
                llColorChnage.setBackgroundColor(getResources().getColor(R.color.Healty));

            }

        });



        final notesClickListner notesClickListner = new notesClickListner() {
            @Override
            public void onClick(int a) {

            }

            @Override
            public void onLongClick(int b) {

            }
        };

    }
}