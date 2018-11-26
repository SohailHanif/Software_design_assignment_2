package com.example.conmipi.assignment2connorpicksohailhanif;

public class Boiler {
    public void startBoiling(){
        WaterTank waterTank = new WaterTank();
        waterTank.drawWater();

        WarmerPlate warmerPlate = new WarmerPlate();
        warmerPlate.heatWarmerPlate();
    }
}
