package javaBasics.array.arraysClass;

import java.util.Arrays;

// Overloading of binarySearch method
// (8) public static int binarySearch(int[] a, int fromIndex, int toIndex, int key)
// (9) public static int binarySearch(short[] a, int fromIndex, int toIndex, short key)
// (10) public static int binarySearch(byte[] a, int fromIndex, int toIndex, byte key)
// (11) public static int binarySearch(long[] a, int fromIndex, int toIndex, long key)
// (12) public static int binarySearch(float[] a, int fromIndex, int toIndex, float key)
// (13) public static int binarySearch(char[] a, int fromIndex, int toIndex, char key)
// (14) public static int binarySearch(double[] a, int fromIndex, int toIndex, double key)

/*
fromIndex - the index of the first element (inclusive) to be searched
toIndex - the index of the last element (exclusive) to be searched
 */

public class BinarySearchMethod3 {
    public static void binarySearch(byte[] age, int fromIndex, int toIndex, byte key){
        System.out.println(Arrays.binarySearch(age, fromIndex, toIndex, key ));
    }

    public static void main(String[] args) {
        byte[] age = {10, 15, 17, 19, 22, 24, 27, 35, 50, 60};

        binarySearch(age, 3,7, (byte) 24);   // 5    explicit type casting
        binarySearch(age, 1, 4, (byte)24);   // -5   unexpected result
//        binarySearch(age, 2, 11, (byte)60);  // ArrayIndexOutOfBoundsException
        binarySearch(age, 0, 9, (byte)33);   // -8
    }
}
