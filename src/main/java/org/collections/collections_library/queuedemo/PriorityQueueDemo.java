package org.collections.collections_library.queuedemo;

import org.collections.collections_library.collection_utility.HardcodedCollectionFactory;

import java.util.PriorityQueue;
import java.util.Queue;

import static org.collections.collections_library.collection_utility.CollectionUtility.outputDivider;
import static org.collections.collections_library.collection_utility.CollectionUtility.printIt;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.addAll(HardcodedCollectionFactory.getQueueWithValues());
        printIt(queue);
        outputDivider();
        printIt(queue);
//Retrieves and removes the head of this queue, or returns null if this queue is empty.
        printIt("Poll method in queue: " + queue.poll());
//Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
        printIt("Peek in queue: " + queue.peek());
//Retrieves, but does not remove, the head of this queue. This method differs from peek only in that it throws an exception if this queue is empty.
        printIt("Queue element():" + queue.element());
//Retrieves and removes the head of this queue. This method differs from poll() only in that it throws an exception if this queue is empty.
        printIt("Remove from queue:" + queue.remove());
//Inserts the specified element into this queue if it is possible to do so immediately without violating capacity restrictions.
//When using a capacity-restricted queue, this method is generally preferable to add, which can fail to insert an element only by throwing an exception.
        printIt("Offer method: " + queue.offer(888));
//Inserts the specified element into this queue if it is possible to do so immediately without violating capacity restrictions,
//returning true upon success and throwing an IllegalStateException if no space is currently available.
        printIt("Add method queue: " + queue.add(999));
        printIt("Queue after removing all: " + queue);
        while (!queue.isEmpty()) {
            queue.remove();
        }
        outputDivider();
    }
}
