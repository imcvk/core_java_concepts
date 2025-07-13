package org.collections.collections_library.set_interface;

import parent_package.AllParent;

import java.util.HashSet;
import java.util.Set;


public class HashSetDemo extends AllParent {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("D");
        set.add("A");
        set.add("E");
        set.add("B");
        set.add("C");
        set.add("F");
        System.out.println(set.size());
        outputDivider();
        System.out.println(set);
        outputDivider();
    }
}
