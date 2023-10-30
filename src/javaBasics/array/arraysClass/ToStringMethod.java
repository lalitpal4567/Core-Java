package javaBasics.array.arraysClass;

import java.util.Arrays;

public class ToStringMethod {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for(int[] oneD : arr){
            System.out.println(Arrays.toString(oneD));
        }

        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));
    }
}
