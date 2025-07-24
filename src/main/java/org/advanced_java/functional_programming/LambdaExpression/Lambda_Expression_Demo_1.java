package org.advanced_java.functional_programming.LambdaExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Lambda_Expression_Demo_1 {
    public static void main(String[] args) {
//        List<String> names = HardcodedCollectionFactory.getListWithNames();
//        printIt(names);
//        names.stream()
//                .filter(name -> name.startsWith("A"))
//                .forEach(System.out::println);
//        // lambda function can be stored in variable.
//
//        Consumer<String> printName = name -> System.out.println(name.toUpperCase());
//        names.forEach(printName);
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
//        check if number is even or odd using lambda expression
        Consumer<Integer> printNumber = number -> {
            if (number % 2 == 0) {
                System.out.println(number + " is even");
            } else {
                System.out.println(number + " is odd");
            }
        };
        numbers.forEach(printNumber);
    }

}
