package generalPrograms.arraysProgram;

import java.util.Scanner;

//  Java program to count the frequency  of odd numbers
public class CountOddNum {

    public static void inputArr(int[] arr, int size) {
        System.out.println("Enter the elements");

        for(int index = 0; index < size; index++) {
            System.out.print("arr[" + index + "] = ");
            arr[index] = input.nextInt();
        }
    }

    public static int countOdd(int[] arr, int size) {
        int countOdd = 0;
        for(int index = 0; index < size; index++) {
            if(arr[index] % 2 != 0) {
                countOdd++;
            }
        }
        return countOdd;
    }

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = new int[50];
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();

        inputArr(arr, size);
        System.out.println("\nFrequency of odd numbers is: " + countOdd(arr, size));
    }
}

