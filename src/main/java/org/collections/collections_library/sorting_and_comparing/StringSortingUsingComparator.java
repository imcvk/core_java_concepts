package org.collections.collections_library.sorting_and_comparing;

import org.collections.collections_library.collection_utility.CollectionUtility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StringListInAscendingOrder implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }
}

class StringListInDescendingOrder implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o2.length() - o1.length();
    }
}

public class StringSortingUsingComparator {
    public static void main(String[] args) {
        List<String> list = CollectionUtility.getNameList(ArrayList::new);
        System.out.println(list);

        System.out.println("List of names in Ascending order based on names:");
        list.sort(new StringListInAscendingOrder());
        System.out.println(list);

        System.out.println("Reversing the list of names using comparator:");
        list.sort(new StringListInDescendingOrder());
        System.out.println(list);
        ArrayList<String> strings = CollectionUtility.getNameList(ArrayList::new);
        System.out.println("List before sorting using default comparator:" + strings);
        Collections.sort(strings);
        System.out.println("String sorting using default comparator:" + strings);
        Collections.reverse(strings);
        System.out.println("Reverse sorting of list of Strings using default comparator:" + strings);
    }
}
