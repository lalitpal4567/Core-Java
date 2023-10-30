package javaBasics.array.arraysClass;

import java.util.Arrays;

/*
(8) public static void sort(int[] a, int fromIndex, int toIndex)
(9) public static void sort(short[] a, int fromIndex, int toIndex)
(10) public static void sort(byte[] a, int fromIndex, int toIndex)
(11) public static void sort(long[] a, int fromIndex, int toIndex)
(12) public static void sort(float[] a, int fromIndex, int toIndex)
(13) public static void sort(double[] a, int fromIndex, int toIndex)
(14) public static void sort(char[] a, int fromIndex, int toIndex)

fromIndex - the index of the first element, inclusive, to be sorted
toIndex - the index of the last element, exclusive, to be sorted
 */

public class
SortMethod3 {
    public static void sortElements(int[] hours, int fromIndex, int toIndex){
        System.out.println("before sorting...");
        System.out.println(Arrays.toString(hours));

        System.out.println("after sorting...");
        Arrays.sort(hours, fromIndex, toIndex);
        System.out.println(Arrays.toString(hours) + "\n");


    }

    public static void main(String[] args) {
        int[] hours = {8, 6, 4, 2, 1, 9, 10, 11, 12};
        int[] hours2 = {5, 2, 18, 8, 7, 12, 4, 3, 1, 15};

        sortElements(hours, 0, 4);     // [2, 4, 6, 8, 1, 9, 10, 11, 12]
        sortElements(hours, 0, 5);     // [1, 2, 4, 6, 8, 9, 10, 11, 12]
        sortElements(hours2, 4, 8);    // [5, 2, 18, 8, 3, 4, 7, 12, 1, 15]
    }                                                                // 4      // 7  8
}
