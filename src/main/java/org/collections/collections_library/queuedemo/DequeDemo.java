package org.collections.collections_library.queuedemo;

import org.collections.collections_library.collection_utility.HardcodedCollectionFactory;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;

import static org.collections.collections_library.collection_utility.CollectionUtility.outputDivider;
import static org.collections.collections_library.collection_utility.CollectionUtility.printIt;

public class DequeDemo {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque = (Deque<Integer>) HardcodedCollectionFactory.getQueueWithValues();
        printIt(deque);
        outputDivider();
        deque.offer(1000);
        deque.offer(2000);
        printIt(deque);
        outputDivider();
        deque.addFirst(56564);
        deque.addLast(56787);
        printIt(deque);
        outputDivider();
        deque.contains(56564);
        System.out.println("frequency of 56564 : "+Collections.frequency(deque, 56564));
    }
}
