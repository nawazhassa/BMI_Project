package com.example.bmi_project.List;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.bmi_project.R;

import java.util.ArrayList;
import java.util.List;

public class ListTesting extends AppCompatActivity {

    ListView listView;
    List arrayList = new ArrayList();
    List arrayListS = new ArrayList();
    Spinner spinner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_list_testing);

        listView = findViewById(R.id.listView);
        spinner = findViewById(R.id.spinner);



        arrayList.add("Hasan");
        arrayList.add("Nawaz");
        arrayList.add("Muhammad");
        arrayList.add("Nawaz");
        arrayList.add("Hasa");
        arrayList.add("Hasan");
        arrayList.add("Hasabddghagdn");
        arrayList.add("Hasandsdddddddddddddddddddddddddd");
        arrayList.add("ddddddddddddddddddddHasan");
        arrayList.add("Hasaffffffffffffffffffffn");
        arrayList.add("dfdfdfdfdHasan");
        arrayList.add("Hasfdfdfdfdan");
        arrayList.add("Hasadfdfdfdn");
        arrayList.add("Hasadfdfdfdn");
        arrayList.add("Hasadfdfdfdn");
        arrayList.add("Hasadfdfdfdn");
        arrayList.add("Hasadfdfdfdn");
        arrayList.add("Hasadfdfdfdn");
        arrayList.add("Hasadfdfdfdn");
        arrayList.add("Hasadfdfdfdn");
        arrayList.add("Hasadfdfdfdn");
        arrayList.add("Hasadfdfdfdn");
        arrayList.add("Hasadfdfdfdn");
        arrayList.add("Hasadfdfdfdn");
        arrayList.add("Hasadfdfdfdn");
        arrayList.add("Hasadfdfdfdn");
        arrayList.add("Hasadfdfdfdn");
        arrayList.add("Hasadfdfdfdn");
        arrayList.add("Hasadfdfdfdn");
        arrayList.add("Hasadfdfdfdn");
        arrayList.add("Hasadfdfdfdn");
        arrayList.add("Hasadfdfdfdn");
        arrayList.add("Hasadfdfdfdn");
        arrayList.add("Hasadfdfdfdn");
        arrayList.add("Hasadfdfdfdn");
        arrayList.add("Hasadfdfdfdn");
        arrayList.add("Hasadfdfdfdn");
        arrayList.add("Hasadfdfdfdn");
        arrayList.add("Hasadfdfdfdn");
        arrayList.add("Hasadfdfdfdn");
        arrayList.add("Hasadfdfdfdn");
        arrayList.add("Hasadfdfdfdn");
        arrayList.add("Hasadfdfdfdn");
        arrayList.add("Hasadfdfdfdn");
        arrayList.add("Hasadfdfdfdn");
        arrayList.add("Hasadfdfdfdn");
        arrayList.add("Hasadfdfdfdn");
        arrayList.add("Hasadfdfdfdn");
        arrayList.add("Hasadfdfdfdn");
        arrayList.add("Hasadfdfdfdn");
        arrayList.add("Hasadfdfdfdn");
        arrayList.add("Hasandddddddddddgfgytgggggggggggggggggggggggggtyttttttttttttttt");




        arrayListS.add("Hasadfdfdfdn");
        arrayListS.add("Hasadfdfdfdn");
        arrayListS.add("Hasadfdfdfdn");
        arrayListS.add("Hasadfdfdfdn");
        arrayListS.add("Hafdn");
        arrayListS.add("fdn");
        arrayListS.add("cdfdsfsffgfffffffffffffffffffgfgfgggggggHasadfdfdfdn");
        arrayListS.add("Hasadfdfdfdn");
        arrayListS.add("Hasadfdfdfdn");













        ArrayAdapter <String> arrayAdapterS = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line,arrayListS);
        spinner.setAdapter(arrayAdapterS);







        ArrayAdapter <String>  arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,arrayList);

        listView.setAdapter(arrayAdapter);




    }
}