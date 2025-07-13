package org.collections.collections_library.map_interface.HashMapDemo;

import java.util.HashMap;
import java.util.Map;

import static org.collections.collections_library.collection_utility.CollectionUtility.outputDivider;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<Integer, String>();
        hashMap.put(1, "one");
        hashMap.put(2, "two");
        hashMap.put(3, "three");
        hashMap.put(4, "four");
        hashMap.put(5, "five");
        hashMap.put(6, "six");
        hashMap.put(7, "seven");
        hashMap.put(8, "eight");
        hashMap.put(9, "nine");
        hashMap.put(10, "ten");
        System.out.println(hashMap);
        outputDivider();
        System.out.println("Get values from hashmap: " + hashMap.values());
        System.out.println("Get keys from hashmap: " + hashMap.keySet());
        outputDivider();
        System.out.println("Remove element from hashmap: " + hashMap.remove(2));
        System.out.println("Remove using key and object: " + hashMap.remove(1, "one"));
        outputDivider();
    }
}
