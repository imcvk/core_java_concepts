package org.advanced_java.collections.recap;

import org.advanced_java.collections.learning.collection_utility.CollectionUtility;

import java.util.*;

public class IteratorDemo {
    public static void main(String[] args) {
        String[] names= CollectionUtility.getNameList(ArrayList::new).toArray(new String[0]);
        Iterator<String> iterator = Arrays.asList(names).iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
       CollectionUtility.outputDivider();
        ListIterator<String> listIterator = Arrays.asList(names).listIterator();
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}
