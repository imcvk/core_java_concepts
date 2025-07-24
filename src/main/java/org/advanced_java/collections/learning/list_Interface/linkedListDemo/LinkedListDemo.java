package org.advanced_java.collections.learning.list_Interface.linkedListDemo;

import org.advanced_java.collections.learning.collection_utility.CollectionUtility;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list = CollectionUtility.getNameList(LinkedList::new);
        System.out.println(list);
//        System.out.println(list.remove("D"));
//        System.out.print("Removed D: " + list);
//        list.addFirst("D");
//        list.addLast("E");
//        System.out.println("Added D: " + list);

//get
        System.out.println("Get element:" + list.get(5));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
//offer
        list.offerFirst("other offer first");
        System.out.println(list);
        list.offerLast("other offer last");
        System.out.println(list);

        list.offer("other offer");
        System.out.println(list);
//poll
        System.out.println(list.poll());
        System.out.println("After list.pollFirst(): " + list.pollFirst());
        System.out.println("after list.pollLast(): " + list.pollLast());
        //peek
        System.out.println("Peek : " + list.peek());
        System.out.println("Peek first: " + list.peekFirst());
        System.out.println("Peek last: " + list.peekLast());
        int a = Collections.frequency(list, "Ellis");
        System.out.println(list);
        System.out.println(a);
    }
}
