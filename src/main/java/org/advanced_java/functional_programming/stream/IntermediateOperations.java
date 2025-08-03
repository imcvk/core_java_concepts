package org.advanced_java.functional_programming.stream;

import org.advanced_java.collections.learning.collection_utility.CollectionUtility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateOperations {
    public static void main(String[] args) {

        List<String> list = List.of("Ram", "Ashish", "Sachin", "Suresh", "Vijay", "Mahesh", "Rahul", "Amod", "Sumedh");

        // filter(): keeps only elements with length > 2
        List<String> filtered = list.stream()
                .filter(s -> s.length() > 2)
                .collect(Collectors.toList());
        System.out.println(filtered);

        // map(): converts each name to uppercase
        String upperCased = list.stream()
                .map(s -> s.toUpperCase())
                .collect(Collectors.joining(","));
        System.out.println(upperCased);

        // map() with transformation: uppercase and reverse each string
        String reversedUpper = list.stream()
                .map(s -> new StringBuilder(s.toUpperCase()).reverse())
                .collect(Collectors.joining(","));
        System.out.println(reversedUpper);

        // sorted(): natural sorting (alphabetical)
        System.out.println("Original list: " + list);
        String naturallySorted = list.stream()
                .sorted()
                .collect(Collectors.joining(","));
        System.out.println("Alphabetically sorted: " + naturallySorted);

        // sorted(): custom comparator based on string length
        String lengthSorted = list.stream()
                .sorted((a, b) -> a.length() - b.length())
                .collect(Collectors.joining(","));
        System.out.println("Sorted by length: " + lengthSorted);

        // distinct(): count names starting with 's' (case-insensitive), only unique entries
        long countS = list.stream()
                .filter(s -> s.toLowerCase().startsWith("s"))
                .distinct()
                .count();
        System.out.println("Count of unique names starting with 's': " + countS);

        // Stream pipeline with iterate(): generate even numbers up to 100
        List<Integer> evenNumbers = Stream.iterate(1, x -> x + 1)
                .limit(100)
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Even numbers (1 to 100): " + evenNumbers);

        // skip(): skip the first 5 elements of a 10-element sequence
        List<Integer> skipped = Stream.iterate(1, x -> x + 1)
                .limit(10)
                .skip(5)
                .toList();
        System.out.println("Skipped first 5 numbers: " + skipped);

        // sorted(): natural order sort on numeric stream
        List<Integer> naturalSorted = Stream.of(9, 7, 85, 4, 5, 6, 2, 1, 2)
                .sorted()
                .toList();
        System.out.println("Naturally sorted numbers: " + naturalSorted);

        // sorted() with Comparator: same as naturalOrder()
        List<Integer> comparatorSorted = Stream.of(9, 7, 85, 4, 5, 6, 2, 1, 2)
                .sorted(Comparator.naturalOrder())
                .toList();
        System.out.println("Comparator sorted numbers: " + comparatorSorted);

        // Sorting a list of city names based on length (descending)
        ArrayList<String> namesCity = new ArrayList<>(Arrays.asList(
                "Lake Russelville",
                "Pfefferport",
                "Beulaport",
                "South Rubentown",
                "New Florentino",
                "South Delbertborough",
                "Ismaelmouth",
                "Auertown",
                "Emardshire",
                "East Faustinafurt"
        ));
        System.out.println("Original city names: " + namesCity);

        List<String> sortedCitiesByLength = namesCity.stream()
                .sorted((o1, o2) -> o2.length() - o1.length())
                .toList();
        System.out.println("Cities sorted by length (desc): " + sortedCitiesByLength);

        // flatMap(): flattening a list of lists into a single list
        List<ArrayList<String>> l1 = Arrays.asList(
                CollectionUtility.getCityList(ArrayList::new),
                CollectionUtility.getCityList(ArrayList::new),
                CollectionUtility.getCityList(ArrayList::new)
        );
        System.out.println("Nested city lists: " + l1);

        CollectionUtility.outputDivider();

        // Flattening nested list using flatMap
        List<String> flatList = l1.stream()
                .flatMap(x -> x.stream())
                .toList();
        System.out.println("Flattened city list: " + flatList);

        CollectionUtility.outputDivider();

        // Splitting city names by space, uppercasing each word
        List<String> wordsUpperCased = flatList.stream()
                .flatMap(x -> Arrays.stream(x.split(" ")))
                .map(x -> x.toUpperCase())
                .toList();
        System.out.println("Uppercased words from city names: " + wordsUpperCased);
    }
}
