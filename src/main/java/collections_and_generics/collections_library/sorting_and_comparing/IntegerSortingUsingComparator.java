package collections_and_generics.collections_library.sorting_and_comparing;

import collections_and_generics.collections_library.collection_utility.CollectionUtility;
import org.apache.commons.collections4.comparators.ReverseComparator;

import java.util.ArrayList;
import java.util.Comparator;

class DescendingOrder implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
}

class Ascending implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o1 - o2;
    }
}


public class IntegerSortingUsingComparator {
    public static void main(String[] args) {
        ArrayList<Integer> integers = CollectionUtility.getAgeList(ArrayList::new);
        System.out.println(integers);
//        Collections.sort(integers);
//        System.out.println(integers);
//        integers.sort(null);
//        System.out.println(integers);
//        integers.sort(Integer::compareTo);

        System.out.println("Sorting elements in reverse order: ");
        integers.sort(new ReverseComparator<>());
        System.out.println(integers);
        System.out.println("Sorting elements in ascending order: ");
        integers.sort(new Ascending());
        System.out.println(integers);
    }
}
