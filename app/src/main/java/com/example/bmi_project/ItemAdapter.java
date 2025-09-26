package com.example.bmi_project;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.media.RouteListingPreference;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {

    private Context context;
    private ArrayList<model> itemList;

    public ItemAdapter(Context context, ArrayList<model> itemList) {
        this.context = context;
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycler_content, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        model item = itemList.get(position);
        holder.text1.setText(item.getTitle());
        holder.text2.setText(item.getDiscription());
        holder.img.setImageResource(item.getImg());

        holder.linearL.setOnClickListener(new View.OnClickListener() {

            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                Dialog dialog = new Dialog(context);
                dialog.setContentView(R.layout.dialog);
                dialog.show();

                if (dialog.getWindow() != null) {
                    dialog.getWindow().setLayout(
                            ViewGroup.LayoutParams.MATCH_PARENT,
                            ViewGroup.LayoutParams.WRAP_CONTENT
                    );
                }


                TextView textView = dialog.findViewById(R.id.txtid);
                TextView txtName = dialog.findViewById(R.id.txtName);
                TextView txtEmail = dialog.findViewById(R.id.txtEmail);
                Button btnAdd = dialog.findViewById(R.id.btnAdd);

                textView.setText("Update Content");
                btnAdd.setText("Update");


                txtName.setText(item.Title);
                txtEmail.setText(item.Discription);


                btnAdd.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        String name = txtName.getText().toString();
                        String email = txtEmail.getText().toString();


                        if (name.isEmpty() || email.isEmpty()) {
                            Toast.makeText(context, "Enter the Name and Email First! ", Toast.LENGTH_SHORT).show();

                        } else {
                            itemList.set(position, new model(name, email));
                            notifyItemChanged(position);
                            dialog.dismiss();


                        }


                    }
                });


            }
        });


    }

    @Override
    public int getItemCount() {
        return itemList.toArray().length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView text1, text2;
        ImageView img;
        LinearLayout linearL;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.img);
            text1 = itemView.findViewById(R.id.text1);
            text2 = itemView.findViewById(R.id.text2);
            linearL = itemView.findViewById(R.id.linearL);

        }
    }
}
