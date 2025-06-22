package opps.polymorphism.referance_object;

public class Car extends Vehicle{
int numberOfDoors;

    public Car() {
        this.numberOfDoors = 4; // Default number of doors
    }

    public Car(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void start() {
        System.out.println("Starting the car with " + numberOfDoors + " doors");
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}
