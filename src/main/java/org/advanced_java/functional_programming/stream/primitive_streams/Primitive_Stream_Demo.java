package org.advanced_java.functional_programming.stream.primitive_streams;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Primitive_Stream_Demo {
    public static void main(String[] args) {
        int[] nums = {1, 3, 56, 9, 8, 5, 4};
        IntStream intStream = Arrays.stream(nums);
        System.out.println(intStream.sum());

        intStream = Arrays.stream(nums);
        System.out.println(intStream.count());
        intStream = Arrays.stream(nums);
        System.out.println(intStream.boxed().map(x -> x % 2 == 0).toList());
        intStream= Arrays.stream(nums);

    }
}
