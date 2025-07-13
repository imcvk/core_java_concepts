package org.collections.collections_library.list_Interface.copyOnWriteArrayList;

import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<String>();
//        ArrayList<String> list = new ArrayList<>();
        list.add("Milk");
        list.add("Butter");
        list.add("eggs");
        list.add("Cheese");

        System.out.println(list);
        try {
            for (String s : list) {
                System.out.println(s);
                if (s.equals("eggs")) {
                    list.add("Salt");

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(list);
    }
}
