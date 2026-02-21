package javanotes;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeReference {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>(); // new LinkedList<>();

        // Add, Offer
        dq.addFirst(1);
        dq.addLast(2);
        dq.offerFirst(3); // offers are safer for capacity-restricted deques
        dq.offerLast(4);
        dq.addLast(5);
        System.out.println(dq);

        // Remove, Poll
        dq.removeFirst();
        dq.removeLast();
        dq.pollFirst(); // polls are safer if the deque might be empty
        dq.pollLast();
        System.out.println(dq);

        System.out.println(dq.getFirst());
        System.out.println(dq.peekLast()); // returns null if empty
    }
}
