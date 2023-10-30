package javaBasics.array.oneD.intArray;

import java.util.Arrays;

public class CloneMethod {
    public static void main(String[] args) {
        int[] arr = new int[]{20, 30, 40, 50, 60};
        int[] arr2 = arr.clone();

        System.out.println(Arrays.toString(arr2));  // [20, 30, 40, 50, 60]

        arr[4] = 100;
        System.out.println(Arrays.toString(arr));   // [20, 30, 40, 50, 100]
        System.out.println(Arrays.toString(arr2));  // [20, 30, 40, 50, 60]
    }
}
