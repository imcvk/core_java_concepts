package org.advanced_java.functional_programming.function_demo;

import java.util.function.Function;

public class Functions_demo {
    public static void main(String[] args) {
//        Function<Integer,Integer> doubleIt= x->x*2;
//        int i=10;
//        System.out.println(doubleIt.apply(i));
//        CollectionUtility.outputDivider();

//        ArrayList<Integer> integers= CollectionUtility.getAgeList(ArrayList::new);
//        System.out.println(integers);
//        Function<ArrayList,Integer> findSum= arrayList -> {
//            Integer sum= 0;
//            for (Object num:arrayList){
//                sum+=(Integer) num;
//            }
//            return sum;
//        };
//        System.out.println(findSum.apply(integers));

//        Function<Integer, Integer> doubleIt = x -> x * 2;
//        System.out.println(doubleIt.apply(2));
//
//        Function<Integer, Integer> tripleIt = x -> x * 3;
//        System.out.println(tripleIt.apply(3));
//        //andThen
//        System.out.println(doubleIt.andThen(tripleIt).apply(1));
//        //compose
//        System.out.println(doubleIt.compose(tripleIt).apply(1));
        Function<Integer, Integer> f1 = x -> x + 3;
        Function<Integer, Integer> f2 = x -> x * 2;
        System.out.println(f1.andThen(f2).apply(5));
        System.out.println(f1.compose(f2).apply(5));
        //
//        Function<Integer, Integer> identity = Function.identity();
//        System.out.println(identity.apply(2));

    }
}
