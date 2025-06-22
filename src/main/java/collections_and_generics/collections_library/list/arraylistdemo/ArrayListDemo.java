package collections_and_generics.collections_library.list.arraylistdemo;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
//        list.add("A");
//        list.add("B");
//        list.add("C");
//        list.add("D");
//        list.add("E");

        for (String s : list) {
            System.out.println(s);
        }
        list.add("test");
        list.add(7,"werwer");
        System.out.println("list contains: "+list.contains("werwer"));
        System.out.println(list.indexOf("werwer"));
        System.out.println(list);
        list.remove(7);
        System.out.println(list);
        System.out.println(Collections.frequency(list, "A"));
        Collections.sort(list);


    }
}
