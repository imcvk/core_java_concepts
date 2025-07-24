package org.advanced_java.functional_programming.predicate_demo;

import org.advanced_java.collections.learning.collection_utility.CollectionUtility;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PalindromeString {
    public static void main(String[] args) {
        Predicate<String> isStringPalindrome = s -> {
            String cleaned = s.toLowerCase();
            return new StringBuilder(cleaned).toString().equalsIgnoreCase(s);
        };
        List<String> nameList = CollectionUtility.getNameList(ArrayList::new);
        nameList.add("nitin");
        for (String name : nameList) {
            System.out.println(name + " is palindrome " + isStringPalindrome.test(name));
        }
    }
}
