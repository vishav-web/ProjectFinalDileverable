package com.example.finaldileverable3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class SighInActivity extends AppCompatActivity {
 Button Second;
ImageView main;
TextView login;
EditText editText;
EditText edi;
EditText strUserName;
    EditText strUserName1;
    EditText strUserName2;
    EditText strUserName3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sigh_in);
        final EditText etUserName = (EditText) findViewById(R.id.text1);
        final EditText etUserName1 = (EditText) findViewById(R.id.text2);
        final EditText etUserName2 = (EditText) findViewById(R.id.text3);
        final EditText etUserName3 = (EditText) findViewById(R.id.text4);

        final String strUserName = etUserName.getText().toString();
        String strUserName1 = etUserName1.getText().toString();
        String strUserName2= etUserName2.getText().toString();
        String strUserName3 = etUserName3.getText().toString();

        if(TextUtils.isEmpty(strUserName)&&TextUtils.isEmpty(strUserName1)&&TextUtils.isEmpty(strUserName2)&&TextUtils.isEmpty(strUserName3))
        {
            etUserName.setError("Must Enter User Name");
            etUserName1.setError("Must Enter Email");
            etUserName2.setError("Must Enter Institue Number");
            etUserName3.setError("Must Enter Student Id");

        }


        login = (TextView)findViewById(R.id.Log_in);

Second=(Button)findViewById(R.id.SignUp_button);

Second.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

        EnteringMenuActivity();



        Intent intent1 = new Intent(SighInActivity.this,SecondActivity.class);
        String name=etUserName.getText().toString();
        intent1.putExtra("profile_name",name);

        String email=etUserName1.getText().toString();

        intent1.putExtra("email",email);

        String phone=etUserName2.getText().toString();

        intent1.putExtra("phone",phone);

        String studentid=etUserName3.getText().toString();

        intent1.putExtra("student_id",studentid);

        startActivity(intent1);

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

    }

    public void EnteringMenuActivity() {
        Intent intent=new Intent(this,SecondActivity.class );
        startActivity(intent);


    }
}
