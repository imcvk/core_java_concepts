package opps.polymorphism.superKeyword;

public class Vehicle {
    private int noOfTires;

    public Vehicle() {
        this.noOfTires = 0;
    }

    public Vehicle(int noOfTires) {
        this.noOfTires = noOfTires;
    }

    public int getNoOfTires() {
        return noOfTires;
    }

    public void start(){
        System.out.println("Starting the vehicle");
    }
}
