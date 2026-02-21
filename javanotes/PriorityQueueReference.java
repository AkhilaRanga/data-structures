package javanotes;

import java.util.PriorityQueue;

public class PriorityQueueReference {
    public static void main(String[] args) {
        // Min heap (default)
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.offer(3);
        minHeap.offer(1);
        minHeap.add(2);
        System.out.println(minHeap);
        System.out.println(minHeap.poll()); // poll smallest

        // Max heap
        PriorityQueue<Integer> maxHeap =
                new PriorityQueue<>((a, b) -> b - a);
        maxHeap.offer(3);
        maxHeap.offer(1);
        minHeap.add(2);
        System.out.println(maxHeap.poll());

        System.out.println(maxHeap.isEmpty());
    }
}
