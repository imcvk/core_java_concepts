package org.advanced_java.functional_programming.functional_interfaces_with_Bi;

import java.util.function.BiConsumer;

public class BiConsumerDemo {
    public static void main(String[] args) {
        String s1 = "Sachin";
        String s2 = "Tendulkar";
        BiConsumer<String, String> mergeIt = (x, y) -> {
            System.out.println(s1 + s2);
        };
        mergeIt.accept(s1, s2);
    }
}
