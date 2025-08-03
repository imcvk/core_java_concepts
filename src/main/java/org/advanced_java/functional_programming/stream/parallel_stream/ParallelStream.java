package org.advanced_java.functional_programming.stream.parallel_stream;

import org.advanced_java.collections.learning.collection_utility.CollectionUtility;

import java.util.List;
import java.util.stream.Stream;

public class ParallelStream {
    public static void main(String[] args) {
        List<Integer> list = Stream.iterate(1, x -> x + 1).limit(20000).toList();

        long startTime, stopTime;
        startTime = System.currentTimeMillis();
        list.stream().map(ParallelStream::getFactorial).toList();
        stopTime=System.currentTimeMillis();;
        System.out.println(STR."Total time taken: \{stopTime - startTime}");

        CollectionUtility.outputDivider();

        startTime = System.currentTimeMillis();
        //sequential() - Returns an equivalent stream that is sequential. May return itself,
        // either because the stream was already sequential,
        // or because the underlying stream state was modified to be sequential.
        list.parallelStream().map(ParallelStream::getFactorial).toList();
        stopTime=System.currentTimeMillis();;
        System.out.println(STR."Total time taken: \{stopTime - startTime}");
    }

    static long getFactorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        } else {
            return n * getFactorial(n - 1);
        }
    }
}
