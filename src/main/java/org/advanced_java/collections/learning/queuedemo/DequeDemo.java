package org.advanced_java.collections.learning.queuedemo;

import org.advanced_java.collections.learning.collection_utility.HardcodedCollectionFactory;

import java.util.ArrayDeque;
import java.util.Deque;

import static org.advanced_java.collections.learning.collection_utility.CollectionUtility.outputDivider;
import static org.advanced_java.collections.learning.collection_utility.CollectionUtility.printIt;

public class DequeDemo {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque = (Deque<Integer>) HardcodedCollectionFactory.getQueueWithValues();
        printIt(deque);
        outputDivider();
        /**
         * Inserts the specified element into the queue represented by this deque
         * (in other words, at the tail of this deque) if it is possible to do so immediately without violating capacity restrictions,
         * returning true upon success and false if no space is currently available. When using a capacity-restricted deque,
         * this method is generally preferable to the add method,
         * which can fail to insert an element only by throwing an exception.
         *
         * */
        deque.offer(1000);
        deque.offer(2000);
        printIt(deque);
        outputDivider();
        /**
         * Inserts the specified element at the front of this deque if it is possible to do so immediately without violating capacity restrictions,
         * throwing an IllegalStateException if no space is currently available.
         * When using a capacity-restricted deque, it is generally preferable to use method
         *
         * */
        deque.addFirst(56564);
        /**
         * Inserts the specified element at the front of this deque if it is possible to do so immediately without violating capacity restrictions,
         * throwing an IllegalStateException if no space is currently available.
         * When using a capacity-restricted deque, it is generally preferable to use method
         *
         * */
        deque.addLast(56787); // Adds element 56787 to the end of the deque
        printIt(deque);       // Prints current contents of the deque
        outputDivider();      // Prints a visual divider (likely for output separation)

        printIt(deque.element()); // Retrieves (but does not remove) the head of the deque; throws exception if empty
        outputDivider();

        printIt(deque.pollFirst()); // Retrieves and removes the first element; returns null if deque is empty
        printIt(deque.pollLast());  // Retrieves and removes the last element; returns null if deque is empty

        printIt(deque.getFirst());  // Retrieves the first element without removing it; throws exception if empty
        printIt(deque.getLast());   // Retrieves the last element without removing it; throws exception if empty

        printIt(deque.peekFirst()); // Retrieves (non-destructively) the first element; returns null if empty
        printIt(deque.peekLast());  // Retrieves (non-destructively) the last element; returns null if empty

        printIt(deque.offerFirst(56564)); // Inserts 56564 at the front; returns true if successful
        printIt(deque.offerLast(56787));  // Inserts 56787 at the back; returns true if successful

        printIt(deque.pop());             // Pops an element from the front of the deque (same as removeFirst); throws exception if empty

        printIt(deque.removeFirst());     // Removes and returns the first element; throws exception if empty
        printIt(deque.removeLast());      // Removes and returns the last element; throws exception if empty

        printIt(deque.removeIf(i -> i % 2 == 0)); // Removes all elements that match the condition: even numbers in this case

        printIt(deque.removeLast());             // Removes and returns the last element again
        printIt(deque.removeFirstOccurrence(56564)); // Removes the first occurrence of 56564 if present

        printIt(deque.removeLastOccurrence(56787)); // Removes the last occurrence of 56787 if present

    }
}
