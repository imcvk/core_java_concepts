package collections.collections_library.list_Interface.arraylistdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArraySorting {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list = Operations.addList(list);

        System.out.println(list);
        //collection sort
        System.out.println("Sorted list");
        Collections.sort(list);
        System.out.println(list);
        System.out.println("Shuffling list");
        Collections.shuffle(list);
        System.out.println(list);

        //custom sorting using lambda
        System.out.println("reverse sorting using lambda");
        list.sort(Comparator.reverseOrder());
        System.out.println(list);
    }
}
