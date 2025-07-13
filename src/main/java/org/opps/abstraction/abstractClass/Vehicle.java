package org.opps.abstraction.abstractClass;

public abstract class Vehicle {
    private int noOfTires;

    public int getNoOfTires() {
        return noOfTires;
    }

    public Vehicle(int noOfTires) {
        this.noOfTires = noOfTires;
    }

    public void setNoOfTires(int noOfTires) {
        this.noOfTires = noOfTires;
    }

    public void commute() {
        System.out.println("Vehicle commute");
    }

    abstract void run();
}
