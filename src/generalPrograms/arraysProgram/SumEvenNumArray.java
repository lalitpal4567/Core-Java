package generalPrograms.arraysProgram;

import java.util.Scanner;

// Sum of all even numbers of array
public class SumEvenNumArray {
    public static void inputArr(int[] arr, int size) {
        System.out.println("Enter the elements: ");

            for(int index = 0; index < size; index++) {
                System.out.print("arr[" + index + "] = ");
                arr[index] = input.nextInt();
            }
    }
    public static int sumEven(int[] arr, int size) {
        int evenSum = 0;

        for(int value : arr) {
            if(value % 2 == 0) {
                evenSum += value;
            }
        }
        return evenSum;
    }
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = new int[50];
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();

        inputArr(arr,size);
        System.out.println("Sum of all even numbers is: " + sumEven(arr,size));
    }
}

