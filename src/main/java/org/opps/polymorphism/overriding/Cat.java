package org.opps.polymorphism.overriding;

public class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("cat sound");
    }
}
