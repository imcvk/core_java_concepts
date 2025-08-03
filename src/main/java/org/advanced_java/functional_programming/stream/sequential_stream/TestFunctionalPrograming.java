package org.advanced_java.functional_programming.stream.sequential_stream;

import org.advanced_java.collections.learning.collection_utility.CollectionUtility;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class TestFunctionalPrograming {
    public static void main(String[] args) {
        //Predicate-
        Predicate<Integer> isEven = i -> i % 2 == 0;
        List<Integer> ageList = CollectionUtility.getAgeList(ArrayList::new);
        for (Integer age : ageList)
            System.out.println(age + " : " + isEven.test(age));

        //Consumer
        CollectionUtility.outputDivider();
        Consumer<String> consumer = s -> {
            System.out.println(s.toUpperCase());
        };
        List<String> strings = CollectionUtility.getCityList(ArrayList::new);
        for (String city : strings)
            consumer.accept(city);
        CollectionUtility.outputDivider();
        //function
        Function<String, String> function = s -> new StringBuilder(s).reverse().toString();
        for (String city : strings)
            System.out.println(function.apply(city));
    }
}
