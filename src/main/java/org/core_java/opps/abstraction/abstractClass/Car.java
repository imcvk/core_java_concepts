package org.core_java.opps.abstraction.abstractClass;

public class Car extends Vehicle {
    public Car() {
        super(4);
    }

    private int noOfDoors;

    public int getNoOfDoors() {
        return noOfDoors;
    }

    public void setNoOfDoors(int noOfDoors) {
        this.noOfDoors = noOfDoors;
    }

    @Override
    void run() {
        System.out.println("Car run");
    }
}
