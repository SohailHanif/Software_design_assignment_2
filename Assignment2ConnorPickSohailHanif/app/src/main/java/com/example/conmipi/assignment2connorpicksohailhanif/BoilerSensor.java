package com.example.conmipi.assignment2connorpicksohailhanif;

public class BoilerSensor extends SensorSuperClass {

    boolean waterAdded;

    public BoilerSensor(){
        super();
        waterAdded = false;
    }

    public boolean getBoilerStatus() {
        if(waterAdded){
            sensorsOkay = true;
        }
        else {
            sensorsOkay = false;
        }

        return waterAdded;
    }
}
