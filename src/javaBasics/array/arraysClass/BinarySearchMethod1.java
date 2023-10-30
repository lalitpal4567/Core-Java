package javaBasics.array.arraysClass;

import java.util.Arrays;

/*
Overloading of binarySearch method
(1) public static int binarySearch(int[] a, int key)
(2) public static int binarySearch(short[] a, short key)
(3) public static int binarySearch(byte[] a, byte key)
(4) public static int binarySearch(long[] a, long key)
(5) public static int binarySearch(float[] a, float key)
(6) public static int binarySearch(char[] a, char key)
(7) public static int binarySearch(double[] a, double key)

(8) public static int binarySearch(int[] a, int fromIndex, int toIndex, int key)
(9) public static int binarySearch(short[] a, int fromIndex, int toIndex, short key)
(18) public static int binarySearch(byte[] a, int fromIndex, int toIndex, byte key)
(11) public static int binarySearch(long[] a, int fromIndex, int toIndex, long key)
(12) public static int binarySearch(float[] a, int fromIndex, int toIndex, float key)
(13) public static int binarySearch(char[] a, int fromIndex, int toIndex, char key)
(14) public static int binarySearch(double[] a, int fromIndex, int toIndex, double key)

(15 public static int binarySearch(Object[] a, Object key)
(16) public static int binarySearch(Object[] a, int toIndex, int fromIndex, Object key)
(17) public static int binarySearch(T[] a, int key, Comparator<? super T> c)
(18) public static int binarySearch(T[] a, int fromIndex, int toIndex, T key, Comparator? super T> c)

 */

public class BinarySearchMethod1 {
    public static void binarySearch(int[] numbers){
        System.out.println(Arrays.binarySearch(numbers, 2));    // 0
        System.out.println(Arrays.binarySearch(numbers, 4));    // 1
        System.out.println(Arrays.binarySearch(numbers, 1));    // -1
        System.out.println(Arrays.binarySearch(numbers, 3));    // -2
        System.out.println(Arrays.binarySearch(numbers, 9));    // -5
    }

    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8};   // array must be sorted in increasing order
        int[] numbers2 = {8, 6, 4, 2};  // won't work, unexpected result
        binarySearch(numbers);
    }
}
