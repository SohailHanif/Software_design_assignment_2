package com.example.conmipi.assignment2connorpicksohailhanif;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button brewButton,addWaterButton,addPotButton;
    BoilerSensor b;
    WarmerPlateSensor w;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        brewButton = (Button) findViewById(R.id.brew_button);
        addWaterButton = (Button) findViewById(R.id.add_water_button);
        addPotButton = (Button) findViewById(R.id.add_pot_button);
        b = new BoilerSensor();
        w = new WarmerPlateSensor();
    }

    private void setupButton(){
        brewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b.getBoilerStatus() && w.getWarmerPlateStatus()){
                    b.startBoiling();
                }
            }
        });
        addWaterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b.addWater();
            }
        });
        addPotButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                w.addPot();
            }
        });
    }


}
