package collections.collections_library.map_interface.ConcurrentHashMapDemo;

import java.util.HashMap;
import java.util.Map;

public class ConcurrentHashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> concurrentHashMap = new HashMap<>();
        concurrentHashMap.put(1, "a");
        concurrentHashMap.put(2, "b");
        concurrentHashMap.put(3, "c");
        concurrentHashMap.put(4, "d");
        concurrentHashMap.put(5, "e");
        for (Map.Entry<Integer, String> entry : concurrentHashMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
