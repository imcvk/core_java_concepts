package org.opps.polymorphism.overriding;

public class Dog extends Animal {
    @Override
    void sound() {
        super.sound();
        System.out.println("Dog sound");
    }
}
