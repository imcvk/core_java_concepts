package collections.collections_library.list_Interface.arraylistdemo;

import java.util.ArrayList;
import java.util.Iterator;

public class Iteration {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        System.out.println("Using for loop-");
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%s ", list.get(i));
        }
        System.out.println("\nUsing foreach loop-");
        for (String s : list) {
            System.out.printf("%s ", s);
        }
        System.out.println("\nUsing iterator-");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.printf("%s ", iterator.next());
        }
    }
}
