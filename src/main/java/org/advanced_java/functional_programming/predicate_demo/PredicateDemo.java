package org.advanced_java.functional_programming.predicate_demo;

import org.advanced_java.collections.learning.collection_utility.CollectionUtility;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
    /**
     * Demonstrates the use of Predicate functional interface in filtering elements of a list using lambda expressions.
     */
    public static void main(String[] args) {

        // Create a raw ArrayList to store integers
        ArrayList list = new ArrayList();

        // Populate the list with integers from 0 to 9
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        /**
         * Predicate to check if a number is even.
         * i -> i % 2 == 0 evaluates to true if the number is divisible by 2.
         */
        Predicate<Integer> isEven = i -> i % 2 == 0;
        /**
         * Filters the original list using the 'isEven' predicate and prints the results.
         * Expected output: 0, 2, 4, 6, 8
         */
        list.stream().filter(isEven).forEach(System.out::println);

        /**
         * Predicate to check if a number is odd.
         * i -> i % 2 != 0 evaluates to true for odd numbers.
         */
        Predicate<Integer> isOdd = i -> i % 2 != 0;

        /**
         * Predicate to check if a number is between 1 and 5 inclusive.
         * i -> i >= 1 && i <= 5 evaluates to true for 1, 2, 3, 4, 5
         */
        Predicate<Integer> inBet_10_50 = i -> i >= 1 && i <= 5;

        /**
         * Filters the list using the 'isOdd' predicate and prints the results.
         * Expected output: 1, 3, 5, 7, 9
         */
        list.stream().filter(isOdd).forEach(System.out::println);

        // Custom utility method call to print a divider between outputs
        CollectionUtility.outputDivider();

        /**
         * Filters the list for numbers between 1 and 5 and prints them.
         * Expected output: 1, 2, 3, 4, 5
         */
        list.stream().filter(inBet_10_50).forEach(System.out::println);

        /**
         * Combines 'isOdd' and 'inBet_10_50' using 'and'.
         * Filters numbers that are odd and between 1 and 5.
         * Expected output: 1, 3, 5
         */
        Predicate<Integer> myFilterOdd = isOdd.and(inBet_10_50);
        list.stream().filter(myFilterOdd).forEach(System.out::println);

        /**
         * Combines 'isOdd' and 'inBet_10_50' using 'or'.
         * Filters numbers that are either odd or between 1 and 5.
         * Expected output: 1, 2, 3, 4, 5, 7, 9
         */
        Predicate<Integer> myFilterOdd2 = isOdd.or(inBet_10_50);
        list.stream().filter(myFilterOdd2).forEach(System.out::println);

        /**
         * Uses the 'negate' method to reverse the 'isOdd' predicate.
         * Filters out all odd numbers (i.e., returns even numbers).
         * Expected output: 0, 2, 4, 6, 8
         */
        list.stream().filter(isOdd.negate()).forEach(System.out::println);

    }
}
