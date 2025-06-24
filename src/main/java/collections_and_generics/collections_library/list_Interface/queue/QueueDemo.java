package collections_and_generics.collections_library.list_Interface.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Hello");
        queue.add("World");
        queue.add("Java");
        queue.add("Python");
        System.out.println(queue);
    }
}
