package com.example.finaldileverable3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class SighInActivity extends AppCompatActivity {
 Button Second;
ImageView main;
TextView login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sigh_in);

        main = (ImageView)findViewById(R.id.MainActivity);
login = (TextView)findViewById(R.id.Log_in);

Second=(Button)findViewById(R.id.SignUp_button);

Second.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        EnteringMenuActivity();
    }
});

    }

    public void previousActivity(View view) {

        Intent google = new Intent(this, MainActivity.class);
        startActivity(google);
        finish();
    }

    public void LoginActivity(View view) {

        Intent Login = new Intent(this ,LoginActivity.class);
        startActivity(Login);
        finish();
    }

    public void EnteringMenuActivity() {
        Intent intent=new Intent(this,SecondActivity.class );
        startActivity(intent);
        finish();

    }
}
