package collections.collections_library.map_interface.sortedMap;

import collections.collections_library.collection_utility.CollectionUtility;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);
        map.put("seven", 7);
        map.put("eight", 8);
        map.put("nine", 9);
        map.put("ten", 10);
        CollectionUtility.outputDivider();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        CollectionUtility.outputDivider();
        System.out.println("a view of the portion of this map whose keys are strictly less than toKey");
        for (Map.Entry<String, Integer> entry : map.headMap("seven").entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        CollectionUtility.outputDivider();
        System.out.println("a view of the portion of this map whose keys range from fromKey, inclusive, to toKey, exclusive");
        for (Map.Entry<String, Integer> entry : map.subMap("seven", "three").entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        CollectionUtility.outputDivider();
        System.out.println(map.ceilingEntry("one"));
        System.out.println(map.floorEntry("one"));

    }
}
