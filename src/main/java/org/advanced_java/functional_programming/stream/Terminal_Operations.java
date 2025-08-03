package org.advanced_java.functional_programming.stream;

import org.advanced_java.collections.learning.collection_utility.CollectionUtility;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Terminal_Operations {
    public static void main(String[] args) {

        // Example list of integers
        List<Integer> integers = List.of(1, 2, 3, 58, 7, 9);

        // Skip the first element and print the rest
        System.out.println(integers.stream().skip(1).toList());

        // Print divider line from CollectionUtility
        CollectionUtility.outputDivider();

        // Print each element using forEach (terminal operation)
        integers.stream().forEach(System.out::println);

        CollectionUtility.outputDivider();

        // Use reduce() to compute the sum of all integers using a lambda
        Integer sum = integers.stream().reduce((x, y) -> x + y).get();

        // Alternative way using built-in sum method reference
        Optional<Integer> reduce = integers.stream().reduce(Integer::sum);

        System.out.println(sum);
        System.out.println(reduce.get());

        // Reduce with custom operation: multiplying all values together
        System.out.println(integers.stream().reduce((x, y) -> ((x * y) / 1)).get());

        // Match operations: check for conditions in the stream

        // anyMatch(): check if any number is even
        boolean b = integers.stream().anyMatch(x -> x % 2 == 0);
        System.out.println(b);

        // allMatch(): check if all numbers are greater than 0
        System.out.println(integers.stream().allMatch(x -> x > 0));

        // noneMatch(): check if none of the numbers are negative
        System.out.println(integers.stream().noneMatch(x -> x < 0));

        // findFirst(): returns the first element (Optional)
        System.out.println(integers.stream().findFirst().get());

        // findAny(): returns any element (useful in parallel streams)
        System.out.println(integers.stream().findAny().get());

        // peek() is used for debugging or intermediate operations (non-terminal)
        // Here, it prints values as they're generated
        Stream.iterate(1, x -> x + 1)
                .limit(10)
                .peek(System.out::println) // nothing is printed since there's no terminal operation
                .toList(); // now it triggers the stream execution

        // List of names
        List<String> names = List.of("anna", "bob", "charlie", "david", "joe", "donald");

        // Filter names with length > 4 and collect to a new list
        List<String> filteredList = names.stream()
                .filter(x -> x.length() > 4)
                .toList();
        System.out.println(filteredList);

        // Squaring each number and sorting the result
        List<Integer> numbers = List.of(7, 8, 5, 23, 6, 9, 5, 5, 4, 8, 5);
        List<Integer> squaredSorted = numbers.stream()
                .map(x -> x * x)
                .sorted()
                .toList();
        System.out.println(squaredSorted);

        // Summing all numbers using reduce
        System.out.println(numbers.stream().reduce(Integer::sum));

        // Count the number of times 'i' appears in the string
        String temp = "This is functional programming";
        long count = temp.chars() // returns IntStream of Unicode values
                .filter(x -> x == 'i')
                .count();
        System.out.println(count);

        // Demonstrate stream is not reusable after a terminal operation
        Stream<String> stream = names.stream();
        stream.forEach(System.out::println);
        // The following would throw an exception if uncommented:
        // stream.forEach(System.out::println);

        // Parallel stream demonstration

        // forEach() with parallel stream – order not guaranteed
        numbers.parallelStream().forEach(System.out::println);

        CollectionUtility.outputDivider();

        // forEachOrdered() ensures order is preserved even in parallel stream
        numbers.parallelStream().forEachOrdered(System.out::println);
    }
}
