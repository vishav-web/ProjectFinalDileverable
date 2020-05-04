package com.example.finaldileverable3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    Button gopro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        final EditText textlogin = (EditText) findViewById(R.id.text_loginname);
        final EditText textloginpass = (EditText) findViewById(R.id.text_loginpassword);

        String strUserName = textlogin.getText().toString();
        String strUserName1 = textloginpass.getText().toString();


        gopro=(Button)findViewById(R.id.Items_menu);
        gopro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startloginSecondActivity();
                String message2=textlogin.getText().toString();
                Intent intent = new Intent(LoginActivity.this,SecondActivity.class);
                intent.putExtra("name",message2);
                startActivity(intent);
            }
        });


    }

    public void startloginSecondActivity(){
        Intent wow= new Intent(this, SecondActivity.class);
        startActivity(wow);


    }
}
