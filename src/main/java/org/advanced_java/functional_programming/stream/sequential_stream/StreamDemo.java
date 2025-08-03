package org.advanced_java.functional_programming.stream.sequential_stream;

import java.util.Arrays;
import java.util.List;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 36, 5, 8, 9, 65, 7, 5, 4);
        long c = nums.stream().filter(x -> x % 2 == 0).count();
        System.out.println(c);
        nums.stream().filter(x -> x % 2 == 0).forEach(System.out::println);
    }
}
