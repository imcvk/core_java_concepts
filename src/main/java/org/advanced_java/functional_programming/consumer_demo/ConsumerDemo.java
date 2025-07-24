package org.advanced_java.functional_programming.consumer_demo;

import org.advanced_java.collections.learning.collection_utility.CollectionUtility;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = CollectionUtility.getCityList(ArrayList::new);
        System.out.println(arrayList);
        Consumer<String> convertCase = x -> {
            x=x.toLowerCase().replace("a","@")
                    .replace("e","E");
            System.out.println(x);
        };
        for (String s : arrayList)
            convertCase.accept(s);
    }
}
