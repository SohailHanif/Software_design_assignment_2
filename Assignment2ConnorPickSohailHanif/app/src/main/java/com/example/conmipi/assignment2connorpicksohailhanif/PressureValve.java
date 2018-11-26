package com.example.conmipi.assignment2connorpicksohailhanif;

public class PressureValve {
    private Boolean isOpen = false;
    Pot pot = new Pot();

    public void openValve(){
        isOpen = true;
        pot.fillPot();
    }
}
