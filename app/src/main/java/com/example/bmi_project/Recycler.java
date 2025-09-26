package com.example.bmi_project;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class Recycler extends AppCompatActivity {
    RecyclerView recycler;
   FloatingActionButton btnFloat;

    ArrayList<model> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_recycler_view);


        recycler = findViewById(R.id.recyclerV);
        recycler.setLayoutManager(new LinearLayoutManager(this));
        btnFloat = findViewById(R.id.btnFloat);

        btnFloat.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Dialog dialog = new Dialog(Recycler.this);
                dialog.setContentView(R.layout.dialog);
                dialog.show();

                if (dialog.getWindow() != null) {
                    dialog.getWindow().setLayout(
                            ViewGroup.LayoutParams.MATCH_PARENT,   // full width
                            ViewGroup.LayoutParams.WRAP_CONTENT    // height content ke according
                    );
                }

                TextView txtName = dialog.findViewById(R.id.txtName);
                TextView txtEmail = dialog.findViewById(R.id.txtEmail);
                Button btnAdd = dialog.findViewById(R.id.btnAdd);


                btnAdd.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String name = txtName.getText().toString();
                        String email = txtName.getText().toString();


                        if (name.isEmpty() || email.isEmpty()){
                            Toast.makeText(Recycler.this, "Enter the Name and Email First! ", Toast.LENGTH_SHORT).show();

                        }


                        model model = new model(name ,email);
                        arrayList.add(model);










                        /*Toast.makeText(Recycler.this, "" +
                                "Name " + name, Toast.LENGTH_SHORT).show();*/
                    }
                });









            }

        });






//      recycler.setLayoutManager(new GridLayoutManager(this, 2));
//      recycler.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));





        recycler.setHasFixedSize(false);
        arrayList.add(new model(R.drawable.ic_launcher_background, "hasanhh", "nawaz"));
        arrayList.add(new model(R.drawable.ic_launcher_foreground, "hasannnhc", "nawaz111"));
        arrayList.add(new model(R.drawable.ic_launcher_foreground, "hasangbn", "nawaz222"));
        arrayList.add(new model(R.drawable.ic_launcher_foreground, "hasafhtytn", "nawaz333"));
        arrayList.add(new model(R.drawable.ic_launcher_foreground, "hasuuyiuan", "nawaz66"));
        arrayList.add(new model(R.drawable.ic_launcher_foreground, "hasnhyan", "nawaz78"));
        arrayList.add(new model(R.drawable.ic_launcher_foreground, "hasahgfn", "nawazg"));
        arrayList.add(new model(R.drawable.ic_launcher_foreground, "hasfgfan", "nawazjjjj"));
        arrayList.add(new model(R.drawable.ic_launcher_foreground, "hasfhhan", "nawazjhjh"));
        arrayList.add(new model(R.drawable.ic_launcher_foreground, "hasgfhhfhan", "nawazjhj"));
        arrayList.add(new model(R.drawable.ic_launcher_foreground, "hasafhfn", "nawaztytyt"));
        arrayList.add(new model(R.drawable.ic_launcher_foreground, "hasfan nawaz ", "nawaz"));
        arrayList.add(new model(R.drawable.ic_launcher_foreground, "hasafhfn", "nawaz5545"));
        arrayList.add(new model(R.drawable.ic_launcher_foreground, "hasafhkjn", "nawaz445"));
        arrayList.add(new model(R.drawable.ic_launcher_foreground, "haskran", "nawaz44"));
        arrayList.add(new model(R.drawable.ic_launcher_foreground, "hasahhn", "nawaz46546"));
        arrayList.add(new model(R.drawable.ic_launcher_foreground, "hasahhn", "nawaz46546"));
        arrayList.add(new model(R.drawable.ic_launcher_foreground, "hasahhn", "nawaz46546"));
        arrayList.add(new model(R.drawable.ic_launcher_foreground, "hasahhn", "nawaz46546"));
        arrayList.add(new model(R.drawable.ic_launcher_foreground, "hasahhn", "nawaz46546"));
        arrayList.add(new model(R.drawable.ic_launcher_foreground, "hasahhn", "nawaz46546"));
        arrayList.add(new model(R.drawable.ic_launcher_foreground, "hasahhn", "nawaz46546"));
        arrayList.add(new model(R.drawable.ic_launcher_foreground, "hasahhn", "nawaz46546"));
        arrayList.add(new model(R.drawable.ic_launcher_foreground, "hasahhn", "nawaz46546"));
        arrayList.add(new model(R.drawable.ic_launcher_foreground, "hasahhn", "nawaz46546"));
        arrayList.add(new model(R.drawable.ic_launcher_foreground, "hasahhn", "nawaz46546"));
        arrayList.add(new model(R.drawable.ic_launcher_foreground, "hasahhn", "nawaz46546"));
        arrayList.add(new model(R.drawable.ic_launcher_foreground, "hasahhn", "nawaz46546"));
        arrayList.add(new model(R.drawable.ic_launcher_foreground, "hasahhn", "nawaz46546"));
        arrayList.add(new model(R.drawable.ic_launcher_foreground, "hasahhnjfdigjf jijgfof or orlmogf oggofkogkfog oogljo", "nawaz46546"));
        arrayList.add(new model(R.drawable.ic_launcher_foreground, "hasahhn", "nawaz46546"));
        arrayList.add(new model(R.drawable.ic_launcher_foreground, "hasahhnbfhdbfh hbfiudshfudsd fjhdbfd hf duf u 9s hfiif fbd", "nawaz46546"));


        ItemAdapter itemAdapter = new ItemAdapter(this, arrayList);


        recycler.setAdapter(itemAdapter);


    }
}