package org.advanced_java.collections.learning.queuedemo;

import org.advanced_java.collections.learning.collection_utility.HardcodedCollectionFactory;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import static org.advanced_java.collections.learning.collection_utility.CollectionUtility.printIt;

public class BlockingQueueDemo {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(100);
        queue.addAll(HardcodedCollectionFactory.getQueueWithValues());


        // Adds element 455 to the queue (throws exception if full)
        printIt("Trying to add 455 to the queue using add(): " + queue.add(455));

// Removes element 55 if it exists (based on equals())+ returns true if successful
        printIt("Attempting to remove 55 from the queue using remove(object): " + queue.remove(55));

// Removes and returns the head of the queue+ throws exception if empty
        printIt("Removing the head using remove(): " + queue.remove());

// Retrieves but does NOT remove the head+ returns null if queue is empty
        printIt("Peeking the head using peek(): " + queue.peek());

// Removes and returns the head+ returns null if empty
        printIt("Polling the head using poll(): " + queue.poll());

// Offers 45 to the queue+ returns true if added+ false if full
        printIt("Offering 45 using offer(): " + queue.offer(45));

// Returns remaining capacity before blocking happens
        printIt("Checking remaining capacity using remainingCapacity(): " + queue.remainingCapacity());

// Counts the total number of elements using stream
        printIt("Counting elements with stream().count(): " + queue.stream().count());

// Retrieves head but throws exception if empty
        printIt("Getting head element using element(): " + queue.element());

// Checks if all elements are greater than 100
        printIt("Checking if all elements > 100 using allMatch(): " + queue.stream().allMatch(x -> x > 100));

// Checks if any element is greater than 100
        printIt("Checking if any element > 100 using anyMatch(): " + queue.stream().anyMatch(x -> x > 100));

// Checks if no elements are greater than 100
        printIt("Checking if no elements > 100 using noneMatch(): " + queue.stream().noneMatch(x -> x > 100));

// Counts unique elements using distinct()
        printIt("Counting distinct elements using distinct().count(): " + queue.stream().distinct().count());

// Drops elements > 100 and limits next 10 elements
        //printIt("Dropping while x > 100 and limiting to 10 using dropWhile().limit(): " + ((Object) queue.stream()).dropWhile(x -> x > 100).limit(10));

// Gets any element from the queue (non-deterministic)
        printIt("Finding any element using findAny(): " + queue.stream().findAny());


    }
}
