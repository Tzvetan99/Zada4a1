package com.company;

public abstract class Vehicle {
    private boolean isActive;

    public Vehicle() {
        this.isActive = true;
    }
    public boolean getIsActive(){
        return isActive;
    }
    public void setIsActive(boolean isActive){
        this.isActive = isActive;
    }
    public abstract void drive();

}
