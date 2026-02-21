package javanotes;

import java.util.*;

public class ArraysReference {
    public static void main(String[] args) {
        int[] nums = {5, 2, 8, 1};

        // Length
        System.out.println(nums.length);

        // Sort
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        // Fill
        Arrays.fill(nums, 0);

        // Copy
        int[] nums2 = {5, 2, 8, 1};
        int[] copy = Arrays.copyOf(nums2, nums2.length);
        System.out.println(Arrays.toString(copy));

        // Sum, Max with streams
        System.out.println(Arrays.stream(copy).sum());
        System.out.println(Arrays.stream(copy).max().getAsInt());

        // 2D Array
        int[][] grid = new int[3][4];
        System.out.println(grid.length);      // rows
        System.out.println(grid[0].length);   // cols

        // Looping
        String[] cars = new String[4];
        cars[0] = "Volvo";
        cars[1] = "BMW";
        cars[2] = "Ford";
        cars[3] = "Mazda";
        for (int i = 0; i < cars.length; i++) {
            System.out.println(i + ": " + cars[i]);
        }
        for (String car : cars) {
            System.out.println(car);
        }
    }
}
