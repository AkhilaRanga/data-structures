package javanotes;

import java.util.HashMap;
import java.util.Map;

public class HashMapReference {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        // Get, Put, Contains
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        System.out.println(map);

        System.out.println(map.get("A"));
        System.out.println(map.getOrDefault("C", 0));
        System.out.println(map.containsKey("B"));
        map.remove("A");

        // Iterate through keys, keys and values
        for (String key : map.keySet()) {
            System.out.println("Key: " + key);
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
