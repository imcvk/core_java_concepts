package opps.accessmodifires.modifiersdemo;

public class TestAccessModifiers {
    public static void main(String[] args) {
        Car c = new Car();
        c.color="Red";
        c.model="Swift";
        Car newCar = new Car("back","bmw","1",5000);
        System.out.println(newCar);
    }
}
