package com.example.finaldileverable3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Shopping_cart extends AppCompatActivity {
    Button button;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping_cart);

        textView=(TextView)findViewById(R.id.textView63);
        button = (Button) findViewById(R.id.button_shop);

     button.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             startNextActivity();
         }
     });
        };

    public void startNextActivity(){
        Intent intent = new Intent(this,ShippingActivity.class);
        startActivity(intent);

    }
}
