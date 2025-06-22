package collections_and_generics.collections_library.list.comparator;

import collections_and_generics.collections_library.CollectionUtility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class CustomCompare implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
}

public class ComparatorDemo2 {
    public static void main(String[] args) {
        ArrayList<Integer> integers = CollectionUtility.getAgeList(ArrayList::new);
        System.out.println(integers);
//        Collections.sort(integers);
//        System.out.println(integers);
//        integers.sort(null);
//        System.out.println(integers);
//    integers.sort(Integer::compareTo);
        integers.sort(new CustomCompare());
        System.out.println(integers);
    }
}
