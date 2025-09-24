package com.example.bmi_project;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Recycler extends AppCompatActivity {
    RecyclerView recycler;

    ArrayList<model> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_recycler_view);

      recycler = findViewById(R.id.recyclerV);
      recycler.setLayoutManager(new LinearLayoutManager(this));
        recycler.setHasFixedSize(false);
      arrayList.add(new model(R.drawable.ic_launcher_background,"hasanhh","nawaz"));
      arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasannnhc","nawaz111"));
      arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasangbn","nawaz222"));
      arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasafhtytn","nawaz333"));
      arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasuuyiuan","nawaz66"));
      arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasnhyan","nawaz78"));
      arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasahgfn","nawazg"));
      arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasfgfan","nawazjjjj"));
      arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasfhhan","nawazjhjh"));
      arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasgfhhfhan","nawazjhj"));
      arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasafhfn","nawaztytyt"));
      arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasfan nawaz ","nawaz"));
      arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasafhfn","nawaz5545"));
      arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasafhkjn","nawaz445"));
      arrayList.add(new model(R.drawable.ic_launcher_foreground,"haskran","nawaz44"));
      arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasahhn","nawaz46546"));
      arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasahhn","nawaz46546"));
      arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasahhn","nawaz46546"));
      arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasahhn","nawaz46546"));
      arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasahhn","nawaz46546"));
      arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasahhn","nawaz46546"));
      arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasahhn","nawaz46546"));
      arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasahhn","nawaz46546"));
      arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasahhn","nawaz46546"));
      arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasahhn","nawaz46546"));
      arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasahhn","nawaz46546"));
      arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasahhn","nawaz46546"));
      arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasahhn","nawaz46546"));
      arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasahhn","nawaz46546"));
      arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasahhnjfdigjf jijgfof or orlmogf oggofkogkfog oogljo","nawaz46546"));
      arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasahhn","nawaz46546"));
      arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasahhnbfhdbfh hbfiudshfudsd fjhdbfd hf duf u 9s hfiif fbd","nawaz46546"));
      arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasahhn","nawaz46546"));
      arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasahhn","nawaz46546"));
      arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasahhn","nawaz46546"));
      arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasahhn","nawaz46546"));
      arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasahhn","nawaz46546"));
      arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasahhn","nawaz46546"));
      arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasahhn","nawaz46546"));
      arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasahhn","nawaz46546"));
      arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasahhn","nawaz46546"));
      arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasahhn","nawaz46546"));
      arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasahhn","nawaz46546"));
      arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasahhn","nawaz46546"));
      arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasahhn","nawaz46546"));
      arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasahhn","nawaz46546"));
      arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasahhn","nawaz46546"));
      arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasahhn","nawaz46546"));
      arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasahhn","nawaz46546"));
      arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasahhn","nawaz46546"));
      arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasahhn","nawaz46546"));
      arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasahhn","nawaz46546"));
      arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasahhn","nawaz46546"));
      arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasahhn","nawaz46546"));
      arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasahhn","nawaz46546"));
      arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasahhn","nawaz46546"));
      arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasahhn","nawaz46546"));
      arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasahhn","nawaz46546"));
      arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasahhn","nawaz46546"));
      arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasahhn","nawaz46546"));
      arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasahhn","nawaz46546"));
        arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasanhh","nawaz"));
        arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasannnhc","nawaz111"));
        arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasangbn","nawaz222"));
        arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasafhtytn","nawaz333"));
        arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasuuyiuan","nawaz66"));
        arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasnhyan","nawaz78"));
        arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasahgfn","nawazg"));
        arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasfgfan","nawazjjjj"));
        arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasfhhan","nawazjhjh"));
        arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasgfhhfhan","nawazjhj"));
        arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasafhfn","nawaztytyt"));
        arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasfan nawaz ","nawaz"));
        arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasafhfn","nawaz5545"));
        arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasafhkjn","nawaz445"));
        arrayList.add(new model(R.drawable.ic_launcher_foreground,"haskran","nawaz44"));
        arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasahhn","nawaz46546"));
        arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasahhn","nawaz46546"));
        arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasahhn","nawaz46546"));
        arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasahhn","nawaz46546"));
        arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasahhn","nawaz46546"));
        arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasahhn","nawaz46546"));
        arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasahhn","nawaz46546"));
        arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasahhn","nawaz46546"));
        arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasahhn","nawaz46546"));
        arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasahhn","nawaz46546"));
        arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasahhn","nawaz46546"));
        arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasahhn","nawaz46546"));
        arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasahhn","nawaz46546"));
        arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasahhn","nawaz46546"));
        arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasahhn","nawaz46546"));
        arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasahhn","nawaz46546"));
        arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasahhn","nawaz46546"));
        arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasahhn","nawaz46546"));
        arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasahhn","nawaz46546"));
        arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasahhn","nawaz46546"));
        arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasahhn","nawaz46546"));
        arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasahhn","nawaz46546"));
        arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasahhn","nawaz46546"));
        arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasahhn","nawaz46546"));
        arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasahhn","nawaz46546"));
        arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasahhn","nawaz46546"));
        arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasahhn","nawaz46546"));
        arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasahhn","nawaz46546"));
        arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasahhn","nawaz46546"));
        arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasahhn","nawaz46546"));
        arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasahhn","nawaz46546"));
        arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasahhn","nawaz46546"));
        arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasahhn","nawaz46546"));
        arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasahhn","nawaz46546"));
        arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasahhn","nawaz46546"));
        arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasahhn","nawaz46546"));
        arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasahhn","nawaz46546"));
        arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasahhn","nawaz46546"));
        arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasahhn","nawaz46546"));
        arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasahhn","nawaz46546"));
        arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasahhn","nawaz46546"));
        arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasahhn","nawaz46546"));
        arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasahhn","nawaz46546"));
        arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasahhn","nawaz46546"));
        arrayList.add(new model(R.drawable.ic_launcher_foreground,"hasahhn","nawaz46546"));

        ItemAdapter itemAdapter = new ItemAdapter(this,arrayList);


        recycler.setAdapter(itemAdapter);






    }
}