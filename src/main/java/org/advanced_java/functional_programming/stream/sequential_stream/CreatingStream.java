package org.advanced_java.functional_programming.stream.sequential_stream;

import java.util.stream.Stream;

public class CreatingStream {
    public static void main(String[] args) {
//        List<Integer> streamDemo = CollectionUtility.getAgeList(ArrayList::new);
//        Stream<Integer> stream = streamDemo.stream();
//        //
//        Integer[] streamArray = {132, 3, 4, 5, 6, 7, 8, 45, 3, 2, 2};
//        Stream<Integer> stream2 = Arrays.stream(streamArray);
//        //
//        Stream<Integer> stream3 = Stream.of(1, 2, 4, 5, 6, 7, 8, 9);

        //Stream.generate(()->1).limit(10).forEach(System.out::println);
        Stream.iterate(0,x->x+1).limit(10).forEach(System.out::println);
    }
}
