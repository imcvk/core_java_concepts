package org.core_java.opps.accessmodifires.coding_challenge.com.example.util;

import org.core_java.opps.accessmodifires.coding_challenge.com.example.geometry.Circle;
import org.core_java.opps.accessmodifires.coding_challenge.com.example.geometry.Rectangle;

public class Calculator {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        Rectangle rectangle = new Rectangle(10, 20);
        double circleArea = (Math.PI * Math.pow(circle.radius, 2));
        double rectArea = rectangle.breadth * rectangle.length;
        System.out.println("Areas of circle: " + circleArea);
        System.out.println("Area of rectangle: " + rectArea);
    }
}
