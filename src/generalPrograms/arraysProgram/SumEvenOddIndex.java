package generalPrograms.arraysProgram;

import java.util.Scanner;

// Write a program to create a single dimensional array of 10 integers.
// Print array element in a single line with one space between each element.
// Also print sum of elements present at even indexes and sum of elements
// present at odd indexes in array.

public class SumEvenOddIndex {

    public static void inputArr(int[] arr) {
        System.out.println("Enter the elements");

        for(int index = 0; index < arr.length; index++) {
            System.out.print("arr[" + index + "] = ");
            arr[index] = input.nextInt();
        }
    }
    public static void sumEvenOddIndex(int[] arr) {
        int sumEvenIndex = 0;
        int sumOddIndex = 0;

        for(int index = 0; index < arr.length; index++) {
            if(index % 2 == 0) {
                sumEvenIndex+= arr[index];
            } else {
                sumOddIndex+= arr[index];
            }
        }
        System.out.println("Sum of numbers at even index is: " + sumEvenIndex);
        System.out.println("Sum of numbers at odd index is: " + sumOddIndex);
    }
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = new int[10];
        inputArr(arr);

        sumEvenOddIndex(arr);
    }
}

