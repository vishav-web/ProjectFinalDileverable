package com.example.finaldileverable3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.Toolbar;

import static android.widget.Toast.LENGTH_SHORT;

public class settingActivity extends AppCompatActivity {
private Toolbar toolbar;
Switch switch1;
Switch switch2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        switch1 = (Switch)findViewById(R.id.Preference1);

        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true){
                    Toast.makeText(getBaseContext(), "Wifi is on", LENGTH_SHORT).show();
                }
                else Toast.makeText(getBaseContext(),"Wifi is off" , LENGTH_SHORT).show();
            }
        });
        switch2 = (Switch)findViewById(R.id.Preference2);

        switch2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true){
                    Toast.makeText(getBaseContext(), "Dark theme is on", LENGTH_SHORT).show();
                }
                else Toast.makeText(getBaseContext(),"Dark theme is off" , LENGTH_SHORT).show();
            }
        });

    }
}
