package javaBasics.array.arraysClass;

import java.util.Arrays;

/*
Overloading of sort method

(1) public static void sort(int[] a)
(2) public static void sort(short[] a)
(3) public static void sort(byte[] a)
(4) public static void sort(long[] a)
(5) public static void sort(float[] a)
(6) public static void sort(double[] a)
(7) public static void sort(char[] a)

(8) public static void sort(int[] a, int fromIndex, int toIndex)
(9) public static void sort(short[] a, int fromIndex, int toIndex)
(10) public static void sort(byte[] a, int fromIndex, int toIndex)
(11) public static void sort(long[] a, int fromIndex, int toIndex)
(12) public static void sort(float[] a, int fromIndex, int toIndex)
(13) public static void sort(double[] a, int fromIndex, int toIndex)
(14) public static void sort(char[] a, int fromIndex, int toIndex)

(15) public static void sort(Object[] a)
(16) public static void sort(Object[] a, int fromIndex, int toIndex)
(17) public static void sort(T[] a, Comparator<? super T> c)
(18) public static void sort(T[] a, int fromIndex, int toIndex, Comparator<? super T> c)

 */

public class SortMethod {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 8, 1, 2, 4};
        int[] arr2 = {1, 2, 5, 6, 8, 12, 17};
        int[] arr3 = {};
        int[] arr4 = new int[7];
        int[] arr5;

        System.out.println("before sorting");
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));
//        System.out.println(Arrays.toString(arr5));      // compilation error, must be initialized before use

        System.out.println("\nafter sorting");
        Arrays.sort(arr);
        Arrays.sort(arr2);
        Arrays.sort(arr3);
        Arrays.sort(arr4);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));
    }
}
