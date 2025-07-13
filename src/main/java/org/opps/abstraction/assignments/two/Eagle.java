package org.opps.abstraction.assignments.two;

public class Eagle extends Bird {
    public Eagle() {

    }

    @Override
    public void fly() {
        System.out.println("Eagle fly");
    }

    public static void main(String[] args) {
        Eagle eagle = new Eagle();
        eagle.fly();
    }
}
