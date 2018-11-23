package com.example.conmipi.assignment2connorpicksohailhanif;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button brewButton,addWaterButton,addPotButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        brewButton = (Button) findViewById(R.id.brew_button);
        addWaterButton = (Button) findViewById(R.id.add_water_button);
        addPotButton = (Button) findViewById(R.id.add_pot_button);
    }

    private void setupButton(){
        brewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SensorSuperClass s = new SensorSuperClass();
            }
        });
        addWaterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        addPotButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }


}
