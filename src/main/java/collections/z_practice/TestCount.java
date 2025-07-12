package collections.z_practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class TestCount {
    public static void main(String[] args) {
        ArrayList<String> strings=new ArrayList<>();
        strings.add("a");
        strings.add("a");
        strings.add("c");
        strings.add("d");
        strings.add("e");
        strings.add("f");
        strings.add("g");
        strings.add("g");
        strings.add("g");
        strings.add("g");
        strings.add("g");
        strings.add("f");
        strings.add("z");
        strings.add("c");
      Map<String,Integer> map=new HashMap<>();
      for(String s:strings){
          map.put(s, Collections.frequency(strings, s));
      }

      System.out.println(map);
    }
}
