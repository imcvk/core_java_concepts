package collections.collections_library.map_interface.sortedMap;

import collections.collections_library.collection_utility.CollectionUtility;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {
    public static void main(String[] args) {
        SortedMap<Integer, String> sortedMap = new TreeMap<Integer, String>();
        sortedMap.put(1, "one");

        sortedMap.put(6, "six");
        sortedMap.put(4, "four");
        sortedMap.put(5, "five");
        sortedMap.put(3, "three");
        sortedMap.put(2, "two");
        sortedMap.forEach((k, v) -> System.out.println(k + " " + v));
        CollectionUtility.outputDivider();
        System.out.println("head map- this will give element with key less that given key: " + sortedMap.headMap(3));
        System.out.println("return Sub map from to to key: " + sortedMap.subMap(4, 6));
//        sortedMap.putLast(7, "Seven");
        CollectionUtility.outputDivider();
        sortedMap.forEach((k, v) -> System.out.println(k + " " + v));
    }
}
