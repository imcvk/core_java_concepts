package core_java.constructorDemo;

public class Car {
    int speed_limit;
    String color;
    String name;

    public Car() {

    }

    @Override
    public String toString() {
        return "Car [speed_limit=" + speed_limit
                + ", color=" + color + ", name=" + name + "]";
    }

    public void printDetails() {
        System.out.println("Speed: " + speed_limit);
        System.out.println("Color: " + color);
        System.out.println("Name: " + name);
    }

    public Car(int speed_limit, String color, String name) {
        this.speed_limit = speed_limit;
        this.color = color;
        this.name = name;
    }

    public void drive() {
        System.out.println("Car driving");
    }

    public void startCar() {
        System.out.println("Car starting");
    }

    public void stopCar() {
        System.out.println("Car stopping");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.startCar();
        car.drive();
        car = new Car(10, "Black", "Punch");
        car.printDetails();
    }
}
