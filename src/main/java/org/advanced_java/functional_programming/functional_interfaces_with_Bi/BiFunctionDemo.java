package org.advanced_java.functional_programming.functional_interfaces_with_Bi;



import org.advanced_java.collections.learning.collection_utility.CollectionUtility;

import java.util.ArrayList;
import java.util.function.BiFunction;

public class BiFunctionDemo {
    public static void main(String[] args) {
        BiFunction<String, String, String> mergeIt = (x, y) -> {
            return x +" "+ y;
        };
        ArrayList name = CollectionUtility.getNameList(ArrayList::new);
        ArrayList name2 = CollectionUtility.getNameList(ArrayList::new);
        for (int i = 0; i < name.size(); i++) {
            System.out.println(mergeIt.apply(name.get(i).toString(), name2.get(i).toString()));
        }
    }
}
