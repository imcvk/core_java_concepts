package org.core_java.opps.polymorphism.overloading;

public class MethodOverloadingDemo {
    int sum(int a, int b) {
        System.out.println("addition of integers");
        return a + b;
    }

    float sum(float a, float b) {
        System.out.println("addition of floats");
        return a + b;
    }

    double sum(double a, double b) {
        System.out.println("addition of doubles");
        return a + b;
    }

    long sum(long a, long b) {
        System.out.println("addition of longs");
        return a + b;
    }
}
