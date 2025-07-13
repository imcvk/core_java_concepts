package org.collections.collections_library.map_interface.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        Map<String, String> names = new LinkedHashMap<>();
        names.put("Sachin", "BAT");
        names.put("Rahul", "BAT,VC,WKT");
        names.put("VVS", "BAT");
        names.put("Sourav", "BAT,C");
        names.put("Virendra", "BAT");
        for (Map.Entry<String, String> entry : names.entrySet()) {
            System.out.println(entry.getKey() + "," + entry.getValue());
        }
        System.out.println(names.get("Sachin"));
        for (Map.Entry<String, String> entry : names.entrySet()) {
            System.out.println(entry.getKey() + "," + entry.getValue());
        }

    }
}
