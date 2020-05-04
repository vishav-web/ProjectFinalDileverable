package com.example.finaldileverable3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    String name;
    String email;
    String phone;
    String id;
    TextView textview;
    TextView tet;
    TextView text;
    TextView studentId;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
                textview =findViewById(R.id.name_pro);

                name=getIntent().getExtras().getString("profile_name");
                textview.setText(name);

        tet =findViewById(R.id.profile_email);

        email=getIntent().getExtras().getString("email");
        textview.setText(email);

        text =findViewById(R.id.profile_phone);

        phone=getIntent().getExtras().getString("phone");
        textview.setText(phone);

        studentId =findViewById(R.id.profile_id);

        id=getIntent().getExtras().getString("student_id");
        textview.setText(id);

            }




    }

