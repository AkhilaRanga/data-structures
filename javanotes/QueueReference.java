package javanotes;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueReference {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>(); // new LinkedList<>();

        // Offer
        queue.offer(1);
        queue.offer(2);
        System.out.println(queue);

        // Peek, Poll
        System.out.println(queue.peek());
        queue.poll();
        System.out.println(queue);
        System.out.println(queue.isEmpty());
    }
}
