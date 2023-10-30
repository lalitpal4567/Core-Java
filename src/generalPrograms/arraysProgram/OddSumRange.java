package generalPrograms.arraysProgram;

import java.util.Scanner;

// Write a Java program that creates integer array of 10 elements,
// accepts values of arrays and Find sum of all numbers below 18,
// between 18 and 60 and above.

public class OddSumRange {

    public static void inputArr(int[] arr) {
        System.out.println("Enter the elements");

        for(int index = 0; index < arr.length; index++) {
            System.out.print("arr[" + index + "] = ");
            arr[index] = input.nextInt();
        }
    }
    public static void sumAllOdd(int[] arr) {
        int below18 = 0;
        int bet18ween60 = 0;
        int above60 = 0;

        for (int i : arr) {
            if (i < 18) {
                below18 += i;
            } else if (i >= 18 && i <= 60) {
                bet18ween60 += i;
            } else {
                above60 += i;
            }
        }

        System.out.println("Sum of numbers below 18 is: " + below18);
        System.out.println("Sum of numbers between 18 and 60 is: " + bet18ween60);
        System.out.println("Sum of numbers above 60 is: " + above60);
    }
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = new int[10];
        inputArr(arr);
        sumAllOdd(arr);
    }
}

