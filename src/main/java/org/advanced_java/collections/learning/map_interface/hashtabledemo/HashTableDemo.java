package org.advanced_java.collections.learning.map_interface.hashtabledemo;

import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<Integer, String> hashtable = new Hashtable();
        hashtable.put(1, "one");
        hashtable.put(2, "two");
        hashtable.put(3, "three");
        hashtable.put(4, "four");
        hashtable.put(5, "five");
        for (Map.Entry<Integer, String> entry : hashtable.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
