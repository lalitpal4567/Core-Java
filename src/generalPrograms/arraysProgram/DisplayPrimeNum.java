package generalPrograms.arraysProgram;

import java.util.Scanner;

public class DisplayPrimeNum {
    public static void inputArr(int[] arr, int size) {
        System.out.println("Enter the elements");

        for(int index = 0; index < size; index++) {
            System.out.print("arr[" + index + "] = ");
            arr[index] = input.nextInt();
        }
    }
    public static void printPrime(int[] arr, int size) {
        System.out.println("\nDisplay Prime numbers");
        boolean flag;
        int value;

        System.out.print("[");
        for(int index = 0; index < size; index++) {
            value = arr[index] / 2;
            flag = false;

            for(int itr = 2; itr <= value; itr ++) {
                if(arr[index] % itr == 0) {
                    flag = true;
                    break;
                }
            }
            if(!flag) System.out.print(arr[index] + ",");
        }
        System.out.println("]");
    }
    static Scanner input  = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = new int[50];
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();

        inputArr(arr, size);
        printPrime(arr, size);
    }
}

