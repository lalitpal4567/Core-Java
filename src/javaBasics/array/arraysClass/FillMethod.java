package javaBasics.array.arraysClass;

import java.util.Arrays;

public class FillMethod {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 20, 50, 80, 70, 30};
        int[] arr2 = new int[5];
        int[] arr3 = new int[]{};

        System.out.println(Arrays.toString(arr));   // [10, 20, 50, 80, 70, 30]
        Arrays.fill(arr, 60);
        System.out.println(Arrays.toString(arr));   // [60, 60, 60, 60, 60, 60]

        System.out.println(Arrays.toString(arr2));  // [0, 0, 0, 0, 0]
        Arrays.fill(arr2, 1);
        System.out.println(Arrays.toString(arr2));  // [1, 1, 1, 1, 1]

        System.out.println(Arrays.toString(arr3));  // []
        Arrays.fill(arr3, 1);
        System.out.println(Arrays.toString(arr3));  // []

    }
}
