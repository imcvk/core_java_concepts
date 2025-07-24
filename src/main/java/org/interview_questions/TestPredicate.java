package org.interview_questions;

import org.advanced_java.collections.learning.collection_utility.HardcodedCollectionFactory;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TestPredicate {
    public static void main(String[] args) {
//        get the vowels and consonants from given string
        String temp = "Predicate testing";
        List<String> stringList = Arrays.asList(temp.split(""));
        Predicate<String> testPredicate = "aeiouAEIOU"::contains;
        Map<String, String> map = new HashMap<>();
        for (String string : stringList) {
            if (!(string.equals("") || string.equals(" ") || string == null))
                map.put(string, testPredicate.test(string) ? "Vowels" : "Consonants");
        }
        System.out.println(map);
        System.out.println(map.values().stream().collect(Collectors.filtering(s -> s.equals("Vowels"), Collectors.counting())));
    }

    public void isEvenPredicate() {
        Predicate<Integer> isEven = x -> x % 2 == 0;
        List<Integer> list;
        list = HardcodedCollectionFactory.getListWithValues();
        list.forEach(x -> System.out.println(x + " is even? :" + isEven.test(x)));
    }


}
