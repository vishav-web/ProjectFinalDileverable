package com.example.finaldileverable3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.example.finaldileverable3.R.layout.activity_thank;

public class ThankActivity extends AppCompatActivity {
private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_thank);


        btn = (Button) findViewById(R.id.new_button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startNextActivity();
            }
        });
    }
    public void startNextActivity(){
        Intent intent = new Intent(this,SecondActivity.class);
        startActivity(intent);
    }
}


