package org.advanced_java.functional_programming.stream.parallel_stream;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class CumulativeSum1 {
    public static void main(String[] args) {
        List<Integer> listNumbers = List.of(1, 2, 3, 4, 5);
        AtomicInteger sum = new AtomicInteger(0);
        listNumbers.parallelStream().map(sum::addAndGet).toList();
        System.out.println(listNumbers.stream().map(sum::addAndGet).toList());
    }
}
