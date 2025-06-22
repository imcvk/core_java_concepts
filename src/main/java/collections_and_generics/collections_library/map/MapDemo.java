package collections_and_generics.collections_library.map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("1", "1");
        map.put("2", "2");
        map.put("3", "3");
        map.put("4", "4");
        map.put("5", "5");
        for (Map.Entry<String,String> e:map.entrySet()) {
            System.out.println(e.getKey()+" "+e.getValue());
        }
        System.out.println("---------------------");
        map.replace("1","10");
        map.remove("2");
        System.out.println(map.size());
        System.out.println(map.containsKey("2"));
        System.out.println(map.containsValue("10"));
        System.out.println(map.remove("2"));
        for (Map.Entry<String,String> e:map.entrySet()) {
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
}
