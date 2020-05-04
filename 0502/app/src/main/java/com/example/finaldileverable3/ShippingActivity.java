package com.example.finaldileverable3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ShippingActivity extends AppCompatActivity {

    private EditText nameEditText,phoneEditText, addressEditText,cityEditText,emailEditText;
    private Button confirmOrderBtn;
private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shipping);

        confirmOrderBtn=(Button)findViewById(R.id.confirm_button);
        nameEditText=(EditText)findViewById(R.id.shipping_name);
        phoneEditText=(EditText)findViewById(R.id.shipping_phone_number);
        addressEditText=(EditText)findViewById(R.id.shipping_address);
        cityEditText=(EditText)findViewById(R.id.shipping_city);
        emailEditText=(EditText)findViewById(R.id.shipping_email);


        button = (Button) findViewById(R.id.confirm_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startNextActivity();
            }
        });
    }
    public void startNextActivity(){
        Intent intent = new Intent(this,ThankActivity.class);
        startActivity(intent);
    }
}

