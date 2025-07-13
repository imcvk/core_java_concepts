package org.collections.collections_library.map_interface;

import org.collections.collections_library.collection_utility.CollectionUtility;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapDemo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
        map.put("key4", "value4");
        map.put("key5", "value5");
        map.put("key6", "value6");
        Map<String, String> map2 = Collections.unmodifiableMap(map);
        System.out.println(map2);
        Map<String, String> keys = Map.of("key1", "value1", "key2", "value2", "key3", "value3", "key4", "value4");
        CollectionUtility.outputDivider();
        System.out.println(keys
        );
        Map<String, String> kvMap = Map.ofEntries(Map.entry("Ram", "ewrwer"),
                Map.entry("Sachin", "Bat"));
        System.out.println(kvMap);
    }
}
