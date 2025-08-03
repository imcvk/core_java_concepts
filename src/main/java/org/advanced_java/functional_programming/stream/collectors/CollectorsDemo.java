package org.advanced_java.functional_programming.stream.collectors;

import org.advanced_java.collections.learning.collection_utility.CollectionUtility;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static void main(String[] args) {
        // Creating a list of names
        List<String> list = List.of("Ram", "Ashish", "Sachin", "Suresh", "Vijay", "Mahesh", "Rahul", "Amod", "Sumedh");

        // Filter names with length > 3 and collect them into a list
        System.out.println(list.stream()
                .filter(x -> x.length() > 3)
                .collect(Collectors.toList()));

        // Divider line for output readability
        CollectionUtility.outputDivider();

        // Filter names starting with 'A' and collect into a list
        System.out.println(list.stream()
                .filter(x -> x.startsWith("A"))
                .collect(Collectors.toList()));

        // Filter names starting with 'B' and collect into an ArrayDeque
        ArrayDeque<String> b = list.stream()
                .filter(x -> x.startsWith("B"))
                .collect(Collectors.toCollection(() -> new ArrayDeque<>()));

        // Divider line
        CollectionUtility.outputDivider();

        // Print the names starting with 'B' (likely empty in this case)
        System.out.println(b);

        // Join all names using comma delimiter and print the result
        String concatinatedString = list.stream()
                .collect(Collectors.joining(","));
        System.out.println(concatinatedString);

        // Divider line
        CollectionUtility.outputDivider();

        // Create a list of integers
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6);

        // Generate summary statistics for the integer list (sum, avg, min, max, count)
        IntSummaryStatistics collect = integers.stream()
                .collect(Collectors.summarizingInt(x -> x));

        // Print statistical values
        System.out.println(collect.getAverage());
        System.out.println(collect.getCount());
        System.out.println(collect.getMax());
        System.out.println(collect.getMin());
        System.out.println(collect.getSum());

        // Divider line
        CollectionUtility.outputDivider();

        // Group names by their length into a map
        System.out.println(list.stream()
                .collect(Collectors.groupingBy(x -> x.length())));

        // Group names by length and count how many names fall into each group
        System.out.println(list.stream()
                .collect(Collectors.groupingBy(String::length, Collectors.counting())));

        // Group names by length and concatenate names in each group using commas
        System.out.println(list.stream()
                .collect(Collectors.groupingBy(String::length, Collectors.joining(","))));

        // Group names by length using TreeMap and count names in each group
        TreeMap<Integer, Long> collect1 = list.stream()
                .collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.counting()));
        System.out.println(collect1);

        // Partition names into two groups based on whether length > 3
        Map<Boolean, List<String>> collect2 = list.stream()
                .collect(Collectors.partitioningBy(x -> x.length() > 3));
        System.out.println(collect2);

        // Convert all names to uppercase and collect into a list
        System.out.println(list.stream()
                .collect(Collectors.mapping(String::toUpperCase, Collectors.toList())));
    }
}
