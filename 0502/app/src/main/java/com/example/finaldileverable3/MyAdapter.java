package com.example.finaldileverable3;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    String Vishav1[], Vishav2[];
    int Images[];
    Context context;
    int item1_total;
    int item2_total = 0;
    int item3_total = 0;
    int item4_total = 0;
    int item5_total = 0;
    int item6_total = 0;




    public MyAdapter (Context ct , String s1[] , String s2 [] , int img[]){
        context = ct;
        Vishav1 = s1;
        Vishav2 = s2;
        Images = img;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater =LayoutInflater.from(context);
        View view= inflater.inflate(R.layout.recycler_view,parent, false);
        return new MyViewHolder(view);

        }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.jain1.setText(Vishav1[position]);
        holder.jain2.setText(Vishav2[position]);
        holder.jainImage.setImageResource(Images[position]);


    }

    @Override
    public int getItemCount() {
        return Images.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView jain1, jain2;
        ImageView jainImage;
        TextView total;

        Button Discription;
        Button plus;
        Button minus;

        TextView quantity;


        int totaltotal = 100;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            jain1 = itemView.findViewById(R.id.myTextView1);
            jain2 = itemView.findViewById(R.id.myTextView2);
            jainImage = itemView.findViewById(R.id.myImageView);

            plus = (Button) itemView.findViewById(R.id.item_plus);
            minus = (Button) itemView.findViewById(R.id.item_minus);
            quantity = (TextView) itemView.findViewById(R.id.quantity_TextView);
            Discription = (Button) itemView.findViewById(R.id.more_information);


            plus.setOnClickListener(this);
            minus.setOnClickListener(this);
            Discription.setOnClickListener(this);


        }

        @Override
        public void onClick(View v) {

            if (v.getId() == plus.getId()) {
                if (getAdapterPosition() == 0) {
                    item1_total++;
                    quantity.setText(Integer.toString(item1_total));


                } else if (getAdapterPosition() == 1) {
                    item2_total++;
                    quantity.setText(Integer.toString(item2_total));
                } else if (getAdapterPosition() == 2) {
                    item3_total++;
                    quantity.setText(Integer.toString(item3_total));
                } else if (getAdapterPosition() == 3) {
                    item4_total++;
                    quantity.setText(Integer.toString(item4_total));
                } else if (getAdapterPosition() == 4) {
                    item5_total++;
                    quantity.setText(Integer.toString(item5_total));
                } else if (getAdapterPosition() == 5) {
                    item6_total++;
                    quantity.setText(Integer.toString(item6_total));

                }


            } else if (v.getId() == minus.getId()) {
                if (getAdapterPosition() == 0) {
                    if (item1_total > 0)
                        item1_total--;
                    quantity.setText(Integer.toString(item1_total));
                    return;
                } else if (getAdapterPosition() == 1) {
                    if (item2_total > 0)
                        item2_total--;
                    quantity.setText(Integer.toString(item2_total));

                } else if (getAdapterPosition() == 2) {
                    if (item3_total > 0)
                        item3_total--;
                    quantity.setText(Integer.toString(item3_total));
                } else if (getAdapterPosition() == 3) {
                    if (item4_total > 0)
                        item4_total--;
                    quantity.setText(Integer.toString(item4_total));
                } else if (getAdapterPosition() == 4) {
                    if (item5_total > 0)
                        item5_total--;
                    quantity.setText(Integer.toString(item5_total));
                } else if (getAdapterPosition() == 5) {
                    if (item6_total > 0)
                        item6_total--;
                    quantity.setText(Integer.toString(item6_total));

                }

            } else if (v.getId() == Discription.getId()) {
                if (getAdapterPosition() == 0) {
                    Intent item1 = new Intent(context, item1.class);
                    context.startActivity(item1);
                } else if (getAdapterPosition() == 1) {
                    Intent item2 = new Intent(context, item2.class);
                    context.startActivity(item2);

                } else if (getAdapterPosition() == 2) {
                    Intent item3 = new Intent(context, item3.class);
                    context.startActivity(item3);

                } else if (getAdapterPosition() == 3) {
                    Intent item4 = new Intent(context, item4.class);
                    context.startActivity(item4);

                } else if (getAdapterPosition() == 4) {
                    Intent item5 = new Intent(context, item5.class);
                    context.startActivity(item5);

                } else if (getAdapterPosition() == 5) {
                    Intent item6 = new Intent(context, item6.class);
                    context.startActivity(item6);


                }

            }

        }


    }}






