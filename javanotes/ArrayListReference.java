package javanotes;

import java.util.*;

public class ArrayListReference {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        // Add, Remove
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.remove(Integer.valueOf(1)); // remove by value
        list.remove(0); // remove by index
        System.out.println(list);

        // Set, Get, Size
        System.out.println(list.get(0));
        list.set(0, 6);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.contains(6));

        // Array -> List
        List<Integer> fixedArr = Arrays.asList(1, 2, 3);
        System.out.println(fixedArr);

        // List -> Array
        Integer[] arr = list.toArray(new Integer[0]);
        System.out.println(Arrays.toString(arr));
    }
}
