package generalPrograms.arraysProgram;

import java.util.Scanner;

public class SumAllNumArray {
    public static void inputArr(int[] arr, int size) {
        System.out.println("Enter the elements: ");

        for(int index = 0; index < size; index++) {
            System.out.print("arr[" + index+ "] = ");
            arr[index] = input.nextInt();
        }
    }

    public static int sumAllNum(int[] arr, int size) {
        int sum = 0;
        for(int value : arr) {
            sum += value;
        }
        return sum;
    }
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = new int[50];
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();

        inputArr(arr,size);
        System.out.println("Sum of all numbers is: "+sumAllNum(arr,size));
    }
}

