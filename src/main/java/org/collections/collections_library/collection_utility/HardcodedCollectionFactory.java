package org.collections.collections_library.collection_utility;

import net.datafaker.Faker;

import java.util.*;

public class HardcodedCollectionFactory {

    // Returns a List<Integer> with 10 hardcoded values
    public static List<Integer> getListWithValues() {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
        return list;
    }

    // Returns a Set<Integer> with 10 hardcoded values
    public static Set<Integer> getSetWithValues() {
        Set<Integer> set = new HashSet<>();
        for (int i = 1; i <= 10; i++) {
            set.add(i);
        }
        return set;
    }

    // Returns a Queue<Integer> with 10 hardcoded values
    public static Queue<Integer> getQueueWithValues() {
        Faker  faker = new Faker();
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 99; i <= 120; i++) {
            queue.add(i);
        }
        return queue;
    }

    // Returns a Map<String, Integer> with 10 hardcoded entries
    public static Map<String, Integer> getMapWithValues() {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 1; i <= 10; i++) {
            map.put("Key" + i, i * 10);
        }
        return map;
    }

    // Returns a List<String> with 10 hardcoded names
    public static List<String> getListWithNames() {
        List<String> list = new ArrayList<>();
        list.add("Alice");
        list.add("Bob");
        list.add("Charlie");
        list.add("Diana");
        list.add("Ethan");
        list.add("Fiona");
        list.add("George");
        list.add("Hannah");
        list.add("Ivan");
        list.add("Julia");
        return list;
    }

    // Returns a Set<String> with 10 hardcoded names
    public static Set<String> getSetWithNames() {
        Set<String> set = new HashSet<>();
        set.add("Alice");
        set.add("Bob");
        set.add("Charlie");
        set.add("Diana");
        set.add("Ethan");
        set.add("Fiona");
        set.add("George");
        set.add("Hannah");
        set.add("Ivan");
        set.add("Julia");
        return set;
    }

    // Returns a Queue<String> with 10 hardcoded names
    public static Queue<String> getQueueWithNames() {
        Queue<String> queue = new LinkedList<>();
        queue.add("Alice");
        queue.add("Bob");
        queue.add("Charlie");
        queue.add("Diana");
        queue.add("Ethan");
        queue.add("Fiona");
        queue.add("George");
        queue.add("Hannah");
        queue.add("Ivan");
        queue.add("Julia");
        return queue;
    }

    // Returns a Map<String, String> with 10 hardcoded name pairs (first name as key, last name as value)
    public static Map<String, String> getMapWithNames() {
        Map<String, String> map = new HashMap<>();
        map.put("Alice", "Smith");
        map.put("Bob", "Johnson");
        map.put("Charlie", "Williams");
        map.put("Diana", "Brown");
        map.put("Ethan", "Jones");
        map.put("Fiona", "Garcia");
        map.put("George", "Miller");
        map.put("Hannah", "Davis");
        map.put("Ivan", "Martinez");
        map.put("Julia", "Wilson");
        return map;
    }
}
