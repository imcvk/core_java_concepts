package org.advanced_java.collections.learning.map_interface.navigablemapdemo;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapDemo {
    public static void main(String[] args) {
        NavigableMap<Integer, String> map = new TreeMap<Integer, String>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println(map.firstEntry());
        System.out.println(map.lastEntry());
        System.out.println(map.headMap(3, true));
        System.out.println(map.tailMap(3, true));
    }
}
