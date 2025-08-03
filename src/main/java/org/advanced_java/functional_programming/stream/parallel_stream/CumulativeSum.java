package org.advanced_java.functional_programming.stream.parallel_stream;

import org.advanced_java.collections.learning.collection_utility.CollectionUtility;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class CumulativeSum {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5);
        AtomicInteger sum= new AtomicInteger(0);
        List<Integer> list = integers.parallelStream().map(sum::addAndGet).toList();
        System.out.println(integers);
        System.out.println(list);

        CollectionUtility.outputDivider();

        sum= new AtomicInteger(0);
        List<Integer> list1 = integers.stream().map(sum::addAndGet).toList();
        System.out.println(integers);
        System.out.println(list1);

    }
}
