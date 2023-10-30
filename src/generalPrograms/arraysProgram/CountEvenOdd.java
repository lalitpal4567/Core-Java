package generalPrograms.arraysProgram;

import java.util.Scanner;

// Java program to count the frequency of both even and odd numbers

public class CountEvenOdd {
    public static int[] countEvenOdd(int[] arr, int size) {
        int evenCount = 0;
        int oddCount = 0;
        int[] countArr = new int[2];

        for(int index = 0; index < size; index++) {
            if(arr[index] % 2 == 0) {
                evenCount++;
            }
//            else{
//                oddCount++;
//            }
            if(arr[index] % 2 != 0) {
                oddCount++;
            }
        }

        countArr[0] = evenCount;
        countArr[1] = oddCount;
        return countArr;
    }

    public static void inputArr(int[] arr, int size){
        System.out.println("Enter the elements");

        for(int index = 0; index < size; index++) {
            System.out.print("arr[" + index + "] = ");
            arr[index] = input.nextInt();
        }
    }
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = new int[50];
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();

        inputArr(arr, size);
        int[] count = countEvenOdd(arr, size);

        System.out.println("\nFrequency of even numbers is: " + count[0]);
        System.out.println("Frequency of odd numbers is: " + count[1]);
    }
}

