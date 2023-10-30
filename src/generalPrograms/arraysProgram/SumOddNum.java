package generalPrograms.arraysProgram;

import java.util.Scanner;

// sum of odd numbers in an array
public class SumOddNum {

    public static void inputArr(int[] arr, int size) {
        System.out.println("Enter the elements");

        for(int index = 0; index < size; index++) {
            System.out.print("arr[" + index + "] = ");
            arr[index] = input.nextInt();
        }
    }

    public static int oddSum(int[] arr, int size) {
        int sum = 0;
        for(int index = 0; index< size; index++) {
            if(arr[index] % 2 != 0) {
                sum += arr[index];
            }
        }
        return sum;
    }
    static Scanner input  = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = new int[50];
        System.out.print("Enter the size of the array: ");
        int size  = input.nextInt();

        inputArr(arr,size);
        System.out.println("Sum of all odd numbers is: " + oddSum(arr,size));
    }
}

