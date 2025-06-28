package collections_and_generics.collections_library.map_interface;

import static collections_and_generics.collections_library.collection_utility.CollectionUtility.outputDivider;

import collections_and_generics.collections_library.collection_utility.CollectionUtility;
import net.datafaker.Faker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MapDemo {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        ArrayList<String> list = CollectionUtility.getNameList(ArrayList::new);
        map.put(1, "Sachin");
        map.put(2, "Ram");
        map.put(3, "Shyam");
        map.put(4, "Sam");
        map.put(5, "Suri");
        map.put(6, "Sami");
        map.put(7, "Marcus");

        System.out.println(map);
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        outputDivider();
        System.out.println("Check if Sachin is present in map:" + map.containsValue("Sachin"));
        System.out.println("Check if there is any element with key 1:" + map.containsKey(1));
        outputDivider();
        System.out.println("Get keyset from map:" + map.keySet());
        outputDivider();
        System.out.println("Get value set from map:" + map.values());
        outputDivider();
        System.out.println("Removing Sami:" + map.remove(6));
        outputDivider();
        map.put(null, "Test");
        System.out.println("Adding null value:" + map);
        outputDivider();
        System.out.println("Removed with object and key:" + map.remove(7, "Marcus"));

    }
}
