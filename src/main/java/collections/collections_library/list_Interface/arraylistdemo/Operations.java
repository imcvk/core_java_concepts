package collections.collections_library.list_Interface.arraylistdemo;

import java.util.ArrayList;
import java.util.Arrays;

public class Operations {

    public static ArrayList<String> addList(ArrayList<String> list) {
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        list.add("g");
        list.add("h");
        list.add("i");
        list.add("j");
        list.add("k");
        return list;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list = addList(list);
        for (String s : list)
            System.out.println(s);

//set
        list.set(0, "d");
        System.out.println(list);
//remove
        list.remove(0);
        System.out.println(list);
//remove by object
        list.remove("b");
        list.set(0, "a");
        list.add(1, "b");
        System.out.println(list);
//is empty
        System.out.println(list.isEmpty());

//contains
        System.out.println(list.contains("a"));

        System.out.println(list.retainAll(Arrays.asList("a", "b")));
        System.out.println(list);
        Arrays.stream(list.toArray()).forEach(System.out::println);
    }
}
