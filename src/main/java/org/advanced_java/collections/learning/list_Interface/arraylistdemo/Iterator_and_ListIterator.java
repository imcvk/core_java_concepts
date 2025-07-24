package org.advanced_java.collections.learning.list_Interface.arraylistdemo;

import org.advanced_java.collections.learning.collection_utility.CollectionUtility;

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
