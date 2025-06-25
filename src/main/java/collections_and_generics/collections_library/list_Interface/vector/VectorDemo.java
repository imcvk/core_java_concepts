package collections_and_generics.collections_library.list_Interface.vector;

import collections_and_generics.collections_library.collection_utility.CollectionUtility;

import java.util.Arrays;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<String> s;
        s = CollectionUtility.getNameList(Vector::new);
        System.out.println(s);

        System.out.println(s.capacity());
        s.add("asdasd");
        System.out.println(s.capacity());

        Vector<String> s2 = new Vector<>(s);
        System.out.println(s2);
        System.out.println("Copy into-");
        String[] temp= new String[s.size()];
        s.copyInto(temp);
        Arrays.stream(temp).forEach(System.out::println);
    }
}
