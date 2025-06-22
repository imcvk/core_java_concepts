package core_java.stringdemo;

import core_java.constructorDemo.Car;

public class Demo_ToString {


    public static void main(String[] args) {
        Car car = new Car(10, "Black", "Punch");
        System.out.println(car.toString());
    }
}
