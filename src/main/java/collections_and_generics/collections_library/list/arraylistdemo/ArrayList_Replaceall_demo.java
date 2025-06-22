package collections_and_generics.collections_library.list.arraylistdemo;

import java.util.ArrayList;

public class ArrayList_Replaceall_demo {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("1");
        strings.add("2");
        strings.add("3");
        strings.add("4");
        strings.add("5");
        strings.add("6");
        strings.add("7");
        strings.add("8");
        strings.add("9");
        strings.add("10");
        strings.replaceAll(string -> Integer.parseInt(string) % 2 == 0 ? "even" : "odd");
        System.out.println(strings);
    }
}
