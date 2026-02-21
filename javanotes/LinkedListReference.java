package javanotes;

import java.util.*;

public class LinkedListReference {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        // Add
        list.addFirst(1);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.add(1, 2); // Add at index
        System.out.println(list);

        // Remove
        list.removeFirst();
        list.removeLast();
        System.out.println(list);

        // Get
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
    }
}
