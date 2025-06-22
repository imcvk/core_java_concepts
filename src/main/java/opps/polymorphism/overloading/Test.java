package opps.polymorphism.overloading;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        MethodOverloadingDemo methodOverloadingDemo = new MethodOverloadingDemo();
        System.out.println(methodOverloadingDemo.sum(1,2));
        System.out.println(methodOverloadingDemo.sum(10f,2f));
        System.out.println(methodOverloadingDemo.sum(1000.00,22122));
        System.out.println(methodOverloadingDemo.sum(14500045l,2121212l));
    }
}

