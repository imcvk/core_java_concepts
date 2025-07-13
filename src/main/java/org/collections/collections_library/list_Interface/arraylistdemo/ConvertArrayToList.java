package org.collections.collections_library.list_Interface.arraylistdemo;

import java.util.Arrays;
import java.util.List;

public class ConvertArrayToList {
    public static void main(String[] args) {
        String[] temp = {"dfsdf", "sdfsdf", "sdfsdfrtert"};
        List<String> strings = Arrays.asList(temp);
        System.out.println(strings);

//converting list back to array
        String[] temp2 = new String[strings.size()];
        strings.toArray(temp2);
        Arrays.stream(temp2).forEach(System.out::println);
    }
}
