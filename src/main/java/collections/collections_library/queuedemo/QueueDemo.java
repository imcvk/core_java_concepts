package collections.collections_library.queuedemo;

import collections.collections_library.collection_utility.CollectionUtility;
import collections.collections_library.collection_utility.HardcodedCollectionFactory;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.CopyOnWriteArrayList;

import static collections.collections_library.collection_utility.CollectionUtility.*;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue = HardcodedCollectionFactory.getQueueWithNames();
        printIt(queue);
        printIt("size():" + queue.size());
        CollectionUtility.outputDivider();
        printIt("peek(): " + queue.peek());
        printIt(queue);
        outputDivider();
        printIt("poll():" + queue.poll());
        printIt(queue);
        outputDivider();
/*        Retrieves and removes the head of this queue, or returns null if this queue is empty.
                Returns:the head of this queue, or null if this queue is empty
*/

        outputDivider();
        printIt("remove():" + queue.remove());
        Queue<Integer> queue2 = HardcodedCollectionFactory.getQueueWithValues();
        printIt(queue2);
        Queue<Integer> integers = queue2;
        integers.removeIf(i -> i % 2 == 0);
        printIt(integers);



    }
}
