package org.core_java.opps.polymorphism.overriding;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.sound();
        animal = new Cat();
        animal.sound();
    }
}
