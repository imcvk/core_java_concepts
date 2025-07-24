package org.advanced_java.functional_programming.predicate_demo;

import org.advanced_java.collections.learning.collection_utility.CollectionUtility;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo2 {
    public static void main(String[] args) {
        List<Integer> numbers = CollectionUtility.getAgeList(ArrayList::new);

        Predicate<Integer> isPositive = x -> x > 0;
        Predicate<Integer> isEven = x -> x % 2 == 0;
        for (Integer i : numbers) {
            System.out.println(i + " is positive?-> " + isPositive.test(i));
        }
        CollectionUtility.outputDivider();

        for (Integer i : numbers) {
            System.out.println(i + " is even?-> " + isEven.test(i));
        }
        System.out.println("Combination of both");
        Predicate<Integer> isPositiveAndEven = isPositive.and(isEven);
        for (Integer i : numbers) {
            System.out.println(i + " is even and positive?-> " + isPositiveAndEven.test(i));
        }
        CollectionUtility.outputDivider();
        //Or
        System.out.println("Combination of both using or");
        Predicate<Integer> isPositiveOrEven = isPositive.or(isEven);
        for (Integer i : numbers) {
            System.out.println(i + " is even and positive?-> " + isPositiveOrEven.test(i));
        }
    }
}
