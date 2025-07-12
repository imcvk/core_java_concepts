package collections.collections_library.set_interface;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(12);
        set.add(42);
        set.add(15);
        set.add(22);
        set.add(23);
        set.add(112);
        set.add(77);
        set.add(97);
        for (Integer i : set) {
            System.out.println(i);
        }
    }
}
