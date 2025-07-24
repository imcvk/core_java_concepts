package org.advanced_java.functional_programming.predicate_demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FilterStrings {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "", null, "Predicate", "  ", "Stream");
        Predicate<String> isValid = str -> str != null && !str.trim().isEmpty();
        words.stream()
                .filter(isValid)
                .forEach(System.out::println);
    }
}
