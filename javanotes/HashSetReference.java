package javanotes;

import java.util.HashSet;
import java.util.Set;

public class HashSetReference {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        // Add, Remove
        set.add(1);
        set.add(2);
        set.add(1); // no duplicates
        System.out.println(set);
        set.remove(1);
        System.out.println(set);

        // Contains, Size, Empty
        System.out.println(set.contains(2));
        System.out.println(set.size());
        System.out.println(set.isEmpty());

        for (Integer s : set) {
            System.out.println(s);
        }
    }
}
