package org.advanced_java.functional_programming.functional_interfaces_with_Bi;

import java.util.function.BiPredicate;

public class BiPredicateDemo {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> iseven = (x, y) -> (x + y) % 2 == 0;
        for (int i = 0; i < 200; i++) {
            System.out.println(i + "," + (i + 1) + "=" + iseven.test(i, i + 1));
        }
    }
}
