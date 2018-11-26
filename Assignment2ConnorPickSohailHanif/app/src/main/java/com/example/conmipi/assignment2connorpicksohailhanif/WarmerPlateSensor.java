package com.example.conmipi.assignment2connorpicksohailhanif;

public class WarmerPlateSensor extends SensorSuperClass {

    boolean potAdded;

    public WarmerPlateSensor(){
        super();
        potAdded = false;
    }

    public boolean getWarmerPlateStatus(){

        if(potAdded){
            sensorsOkay = true;
        }
        else {
            System.out.println("The pot must be added");
            sensorsOkay = false;
        }

        return potAdded;

    }
    public void addPot(){
        potAdded = true;
    }

    public void startWarmerPlate(){

    }

    public void stopWarmerPlate(){

    }
}
