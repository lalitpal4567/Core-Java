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
 */

public class



SortMethod2 {
    public static void sortElement(char[] ch){
        System.out.println("before sorting...");
        System.out.println(Arrays.toString(ch));

        System.out.println("after sorting...");
        Arrays.sort(ch);
        System.out.println(Arrays.toString(ch) + "\n");
    }

    public static void main(String[] args) {
        char[] ch = {'5', '4', '3', '2', '1'};
        char[] ch2 = {'a', 'b', 'c', 'A', 'B', 'C'};
        char[] ch3 = {'D', 'E', 'F', '4', '7', 'z'};

        sortElement(ch);    // [1, 2, 3, 4, 5]
        sortElement(ch2);   // [A, B, C, a, b, c]
        sortElement(ch3);   // [4, 7, D, E, F, z]
    }
}
