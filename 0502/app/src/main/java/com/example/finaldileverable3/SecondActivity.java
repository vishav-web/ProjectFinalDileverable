package com.example.finaldileverable3;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    String s1[] , s2[];
    int Images []= {R.drawable.mad1 ,R.drawable.mad3 , R.drawable.mad45 , R.drawable.mad432, R.drawable.mad5 , R.drawable.mad6} ;

    int s10;
    TextView s;
    Button btn;
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        recyclerView = findViewById(R.id.recyclerView);

        s1 = getResources().getStringArray(R.array.Title);
        s2 = getResources().getStringArray(R.array.price);

        back=(Button)findViewById(R.id.new_button);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startBackActivity();
            }
        });





        MyAdapter adapter = new MyAdapter(this, s1 , s2, Images);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));









        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                startActivity(new Intent(SecondActivity.this, Shopping_cart.class));
            }
        });
    }
public void startBackActivity(){
        Intent goingback=new Intent(this, MainActivity.class);
        startActivity(goingback);
        finish();
}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_layout, menu);
        return true;
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.profile) {
            Intent myintent = new Intent(SecondActivity.this, ProfileActivity.class);
            startActivity(myintent);
        }
        if (id == R.id.contact) {
            Intent myintent = new Intent(SecondActivity.this, ContactActivity.class);
            startActivity(myintent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}


