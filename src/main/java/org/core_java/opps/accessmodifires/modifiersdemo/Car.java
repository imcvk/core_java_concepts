package org.core_java.opps.accessmodifires.modifiersdemo;

public class Car {
    public String model;
    public String color;
    private String fuelLevel;
    private long cost;

    Car() {
    }

    Car(String model, String color, String fuelLevel, long cost) {
        this.model = model;
        this.color = color;
        this.fuelLevel = fuelLevel;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", fuelLevel='" + fuelLevel + '\'' +
                ", cost=" + cost +
                '}';
    }
}
