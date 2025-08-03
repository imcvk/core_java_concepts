package org.advanced_java.functional_programming.stream.sequential_stream;

import org.advanced_java.collections.learning.collection_utility.CollectionUtility;

import java.util.List;
import java.util.stream.Collectors;

public class Practice_Code {
    public static void main(String[] args) {
//      print only odd numbers from the list
        List<Integer> integers = List.of(1, 8, 9, 6, 5, 8, 5, 2, 3, 74);
        List<Integer> list = integers.stream().filter(x -> x % 2 == 0).toList();
        System.out.println(list);
        CollectionUtility.outputDivider();

//      Print All Courses individually
        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
        courses.stream().forEach(System.out::println);
        CollectionUtility.outputDivider();

        //     Print Courses Containing the word "Spring"
        courses.stream().filter(x -> x.contains("Spring")).toList().forEach(System.out::println);
        CollectionUtility.outputDivider();

        //     Print Courses Whose Name has at least 4 letters
        System.out.println(courses.stream().filter(x -> x.length() >= 4).collect(Collectors.joining(",")));
        CollectionUtility.outputDivider();

        //Print the cubes of odd numbers
        List<Integer> collect = integers.stream().filter(x -> !(x % 2 == 0)).toList().stream().map(x -> (x * x * x)).collect(Collectors.toList());
        System.out.println(collect);
        CollectionUtility.outputDivider();
        //        Print the number of characters in each course name
        System.out.println(courses.stream().map(String::length).toList().stream().map(String::valueOf).toList());
        CollectionUtility.outputDivider();
        //Square every number in a list and find the sum of squares
        System.out.println(integers.stream().map(x -> x * x).reduce(Integer::sum).get());
        CollectionUtility.outputDivider();
        //Cube every number in a list and find the sum of cubes
        System.out.println(integers.stream().map(x -> (x * x * x)).reduce(Integer::sum).get());
        CollectionUtility.outputDivider();
        //Find Sum of Odd Numbers in a list
        System.out.println(integers.stream().filter(n -> n % 2 != 0)
                .mapToInt(Integer::intValue)
                .sum());
        CollectionUtility.outputDivider();
        //Create a List with lengths of all course titles.
        System.out.println(courses.stream().map(x -> x.length() + "").collect(Collectors.joining(",")));
        CollectionUtility.outputDivider();
    }
}