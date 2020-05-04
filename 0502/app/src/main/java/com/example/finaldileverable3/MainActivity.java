
package com.example.finaldileverable3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button SignUp;

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.button_firstPage);

        SignUp = (Button)findViewById(R.id.login_button);



        SignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startNextActivity();
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startMenuActivity();
            }
        });


    }
    public void startMenuActivity(){
        Intent intent= new Intent(this, SecondActivity.class);
        startActivity(intent);
        finish();
    }

    public  void startNextActivity(){
        Intent Next = new Intent(this, SighInActivity.class);
        startActivity(Next);
        finish();
    }
}
