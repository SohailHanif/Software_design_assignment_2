package com.example.conmipi.assignment2connorpicksohailhanif;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button brewButton,addWaterButton,addPotButton;
    TextView txtBrewStatus, txtWaterStatus, txtPotStatus;
    BoilerSensor boilerSensor;
    WarmerPlateSensor w;
    WaterTank waterTank;
    Boiler boiler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        brewButton = (Button) findViewById(R.id.brew_button);
        addWaterButton = (Button) findViewById(R.id.add_water_button);
        addPotButton = (Button) findViewById(R.id.add_pot_button);

        txtBrewStatus = (TextView) findViewById(R.id.txtBrewStatus);
        txtWaterStatus = (TextView) findViewById(R.id.txtWaterStatus);
        txtPotStatus = (TextView) findViewById(R.id.txtPotStatus);

        boilerSensor = new BoilerSensor();
        w = new WarmerPlateSensor();
        waterTank = new WaterTank();
        boiler = new Boiler();
    }

    public void onClick(){
        brewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!boilerSensor.getBoilerStatus()){
                    txtWaterStatus.setText("Water tank is empty");
                }
                else if (!w.getWarmerPlateStatus()){
                    txtPotStatus.setText("Pot is not on the warmer plate");
                }
                else{
                    boiler.startBoiling();
                }
            }
        });
        addWaterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                waterTank.addWater();
                txtWaterStatus.setText("Added water");
            }
        });
        addPotButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                w.addPot();
                txtPotStatus.setText("Added pot");
            }
        });
    }


}
