package org.collections.collections_library.map_interface.identityHashMap;

import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapDemo {
    public static void main(String[] args) {

//        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map1 = new IdentityHashMap<>();
        String key1 = new String("key1");
        String key2 = new String("key1");
        System.out.println(System.identityHashCode(key1));
        System.out.println(System.identityHashCode(key2));

        map1.put(key1, 1);
        map1.put(key2, 2);
        System.out.println(map1);
    }
}
