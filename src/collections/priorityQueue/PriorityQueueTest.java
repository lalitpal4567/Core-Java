package collections.priorityQueue;

import java.util.Arrays;
import java.util.PriorityQueue;

public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(4);
        queue.add(3);
        queue.add(2);
        queue.add(1);
        queue.add(5);
        System.out.println(queue);
    }
}
