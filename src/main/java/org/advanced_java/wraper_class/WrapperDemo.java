package org.advanced_java.wraper_class;

public class WrapperDemo {
    public static void main(String[] args) {
        Integer first = 55;
        System.out.println(first);
        first = Integer.valueOf("234");
        System.out.println(first);
        int i = 74;
        Integer integer = i;
    }
}
