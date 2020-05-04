package com.example.finaldileverable3;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;

public class DeliveryDateActivity extends AppCompatActivity implements DatePickerDialog.OnDateSetListener {
    private TextView dateText;
    private Button button;
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery_date);

        dateText = findViewById(R.id.date_text);
        btn = (Button) findViewById(R.id.confirm_button2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startNextActivity();
            }
        });
        button=(Button)findViewById(R.id.show_dialog);
        findViewById(R.id.show_dialog).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDatePickerDailog();

            }

        });
    }

    private void showDatePickerDailog(){
        DatePickerDialog datePickerDialog=new DatePickerDialog(
                this,this, Calendar.getInstance().get(Calendar.YEAR),
                Calendar.getInstance().get(Calendar.MONTH),
                Calendar.getInstance().get(Calendar.DAY_OF_MONTH)
        );
        datePickerDialog.show();
        datePickerDialog.getButton(DatePickerDialog.BUTTON_NEGATIVE).setTextColor(Color.GREEN);
        datePickerDialog.getButton(DatePickerDialog.BUTTON_POSITIVE).setTextColor(Color.GREEN);
        datePickerDialog.getButton(DatePickerDialog.BUTTON_NEUTRAL).setTextColor(Color.GREEN);
    }
    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        String date="month/day/year:"+ month+"/"+dayOfMonth+"/"+year;
        dateText.setText(date);
    }
    public void startNextActivity(){
        Intent intent = new Intent(this,ThankActivity.class);
        startActivity(intent);
    }
}
