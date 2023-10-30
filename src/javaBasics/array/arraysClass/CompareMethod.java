package javaBasics.array.arraysClass;

import java.util.Arrays;

/*
Overloading of compare method

(1) public static int compare(int[] a, int[] b)
(2) public static int compare(short[] a, short[] b)
(3) public static int compare(byte[] a, byte[] b)
(4) public static int compare(long[] a, long[] b)
(5) public static int compare(char[] a, char[] b)
(6) public static int compare(float[] a, float[] b)
(7) public static int compare(double[] a, double[] b)
(8) public static int compare(boolean[] a, boolean[] b)

(9) public static int compare(int[] a, int aFromIndex, int aToIndex, int[] b, int bFromIndex, int bToIndex)
(10) public static int compare(short[] a, int aFromIndex, int aToIndex, short[] b, int bFromIndex, int bToIndex)
(11) public static int compare(byte[] a, int aFromIndex, int aToIndex, byte[] b, int bFromIndex, int bToIndex)
(12) public static int compare(long[] a, int aFromIndex, int aToIndex, long[] b, int bFromIndex, int bToIndex)
(13) public static int compare(char[] a, int aFromIndex, int aToIndex, char[] b, int bFromIndex, int bToIndex)
(14) public static int compare(float[] a, int aFromIndex, int aToIndex, float[] b, int bFromIndex, int bToIndex)
(15) public static int compare(double[] a, int aFromIndex, int aToIndex, double[] b, int bFromIndex, int bToIndex)
(16) public static int compare(boolean[] a, int aFromIndex, int aToIndex, boolean[] b, int bFromIndex, int bToIndex)

(17) public static <T> int compare(T[] a, T[] b, Comparator<? super T> cmp)
(18) public static <T> int compare(T[] a, int aFromIndex, int aToIndex, T[] b, int bFromIndex, int bToIndex,Comparator<? super T> cmp)

(19) public static <T extends Comparable<? super T>> int compare(T[] a, T[] b )
(20) public static <T extends Comparable<? super T>> int compare(T[] a, int aFromIndex, int aToIndex, T[] b, int bFromIndex, int bToIndex)

 */

/**
 * If both arrays are the same length and have the same values in each spot in the same order, return zero.
 * If all the elements are the same but the second array has extra elements at the end, return a negative number.
 * If all the elements are the same, but the first array has extra element at the end, return a positive number.
 * If the first element that differs is smaller in the first array, return a negative number.
 * if the first element that differs is large in the first array, return a positive number.
 */

public class CompareMethod {
    public static void main(String[] args) {
        int[] arr1 = {1};
        int[] arr2 = {1};
        int[] arr3 = {1, 2};
        int[] arr4 = {2, 1};
        int[] arr5 = {1, 1};
        int[] arr6 = {1, 2, 3};
        int[] arr7 = {1, 2, 3, 4};
        int[] arr8 = {1, 2, 4, 3};

        System.out.println(Arrays.compare(arr1, arr2));     // 0    arr1 == arr2
        System.out.println(Arrays.compare(arr1, arr3));     // -1   arr1 < arr3
        System.out.println(Arrays.compare(arr3, arr4));     // -1   arr3 < arr4
        System.out.println(Arrays.compare(arr4, arr3));     // 1    arr4 > arr3
        System.out.println(Arrays.compare(arr4, arr5));     // 1    arr4 > arr5
        System.out.println(Arrays.compare(arr4, arr6));     // 1    arr4 > arr6
        System.out.println(Arrays.compare(arr4, arr7));     // 1    arr4 > arr7
        System.out.println(Arrays.compare(arr8, arr7));     // 1    arr8 > arr7
        System.out.println(Arrays.compare(arr6, arr7));     // -1   arr6 < arr7

    }
}
