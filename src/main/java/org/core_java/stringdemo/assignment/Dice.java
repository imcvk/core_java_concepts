package org.core_java.stringdemo.assignment;

public class Dice {
    public static int roll() {
        double roll = Math.random() * 6;
        return (int) Math.round(roll);
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            System.out.println(roll());

        }
    }
}
