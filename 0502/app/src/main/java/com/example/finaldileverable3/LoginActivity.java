package com.example.finaldileverable3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    Button gopro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        gopro=(Button)findViewById(R.id.Items_menu);
        gopro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startloginSecondActivity();
            }
        });


    }

    public void startloginSecondActivity(){
        Intent wow= new Intent(this, SecondActivity.class);
        startActivity(wow);
        finish();
    }
}
