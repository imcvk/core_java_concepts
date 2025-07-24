package org.advanced_java.collections.learning.list_Interface.Enum;

public class EnumDemo {
    public static void main(String[] args) {
        TrafficLight color = TrafficLight.BLUE;
        for (TrafficLight c : TrafficLight.values()) {
            System.out.println(c);
        }
    }
}


