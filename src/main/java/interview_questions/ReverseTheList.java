package interview_questions;

import java.util.ArrayList;
import java.util.LinkedList;

public class ReverseTheList {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");
        list.add("G");
        ArrayList l2 = new ArrayList();
        for (int i = list.size()-1; i >= 0; i--) {
            l2.add(list.get(i));
        }
        System.out.println(list);
        System.out.println(l2);
        System.out.println("Linked list---------------------");
        LinkedList<String> llist = new LinkedList<>();
        llist.add("A");
        llist.add("B");
        llist.add("C");
        llist.add("D");
        llist.add("E");
        llist.add("F");
        llist.add("G");
        LinkedList llist2 = new LinkedList();
        llist.descendingIterator().forEachRemaining(l -> llist2.add(l));
        System.out.println(llist);
        System.out.println(llist2);
    }
}
