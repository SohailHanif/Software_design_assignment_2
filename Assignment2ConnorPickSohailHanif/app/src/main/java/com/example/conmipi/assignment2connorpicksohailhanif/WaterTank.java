package com.example.conmipi.assignment2connorpicksohailhanif;

public class WaterTank {
    private boolean hasWater = false;
    private PressureValve pressureValve = new PressureValve();

    public void addWater(){
        hasWater = true;
    }

    public void drawWater(){
        hasWater=false;
        pressureValve.openValve();
    }


}
