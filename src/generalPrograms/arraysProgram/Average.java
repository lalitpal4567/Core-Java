package generalPrograms.arraysProgram;

import java.util.Scanner;

public class Average {
    public static void inputArr(int[] arr, int size){
        System.out.println("Enter the elements");

        for(int index = 0; index < size; index++) {
            System.out.print("arr[" + index + "] = ");
            arr[index] = input.nextInt();
        }
    }
    public static float findAverage(int[] arr, int size) {
        float average;
        int sum = 0;

        for(int index = 0; index < size; index++) {
            sum += arr[index];
        }
        average =  (float)sum / size;
        return average;
    }

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = new int[50];
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();

        inputArr(arr, size);
        System.out.println("Average of all numbers is: " + findAverage(arr, size));
    }
}

