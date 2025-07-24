package org.advanced_java.functional_programming.predicate_demo;

import org.advanced_java.collections.learning.collection_utility.CollectionUtility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class CombinePredicate {
    public static void main(String[] args) {
        ArrayList<Integer> ageList = new ArrayList<>();
        ageList.addAll(Arrays.asList(14, 41, 21, 20, 8, 35, 44, 85, 10, 48));
        System.out.println(ageList);
        Predicate<Integer> isEven = n -> n % 2 == 0;
        Predicate<Integer> isWorkableAge = n -> n >= 18 && n <= 65;
        Predicate<Integer> ageCondition = isEven.and(isWorkableAge);
        ageList.stream().filter(ageCondition).forEach(System.out::println);
    }
}
