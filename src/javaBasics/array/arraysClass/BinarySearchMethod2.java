package javaBasics.array.arraysClass;

import java.util.Arrays;

public class BinarySearchMethod2 {
    public static void binarySearch(char[] ch, char key){
        System.out.println(Arrays.binarySearch(ch,key));
    }

    public static void main(String[] args) {
        char[] alphabets = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
        char[] alphabets2 = {'c', 'b', 'a', 'g', 'h', 'e', 'd', 'f'};   // unexpected output, must be sorted according to ASCII value
        char[] alphabets3 = {'A', 'B', 'C', 'a', 'b', 'c'};
        char[] alphabets4 = {'a', 'b', 'c', 'A', 'B', 'C'}; // unexpected output, must be sorted in ASCII order
        char[] alphabets5 = {'2','5', '7', 'F', 'g', 'h'};

        binarySearch(alphabets, 'e');   // 4
        binarySearch(alphabets2,'h');   // -9
        binarySearch(alphabets3,'C');   // 2
        binarySearch(alphabets4,'A');   // -1
        binarySearch(alphabets5, '7');  // 2
    }
}
