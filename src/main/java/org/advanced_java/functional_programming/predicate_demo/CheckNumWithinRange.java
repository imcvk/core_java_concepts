package org.advanced_java.functional_programming.predicate_demo;

import org.advanced_java.collections.learning.collection_utility.CollectionUtility;

import java.util.ArrayList;
import java.util.function.Predicate;

public class CheckNumWithinRange {
    public static void main(String[] args) {
        ArrayList<Integer> nums = CollectionUtility.getAgeList(ArrayList::new);
        System.out.println(nums);
        Predicate<Integer> rangePredicate = num -> num >= 50 && num <= 65;
        nums.stream().filter(rangePredicate).forEach(
                System.out::println
        );
    }
}
