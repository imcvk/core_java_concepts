package collections_and_generics.collections_library.list_Interface.arraylistdemo;

import collections_and_generics.collections_library.CollectionUtility;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Iterator_and_ListIterator {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        list = CollectionUtility.getNameList(ArrayList::new);
        System.out.println(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (it.next() == "a")
                it.remove();
        }
        list.iterator().forEachRemaining(System.out::println);

        list = Operations.addList(list);
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (listIterator.next() == "a")
                listIterator.set("asdasdas");
        }
        listIterator.forEachRemaining(System.out::println);

    }
}
