package generalPrograms.arraysProgram;

import java.util.Scanner;

// Java program to print armstrong number

public class CheckArmstrongEachNum {
    public static void inputArr(int[] arr, int size) {
        System.out.println("Enter the elements");

        for(int index = 0; index < size; index++) {
            System.out.print("arr[" + index + "] = ");
            arr[index] = input.nextInt();
        }
    }

    public static void checkArm(int[] arr, int size) {
        int rem;
        int sum;
        int temp;

        System.out.print("\n[");
        for(int index = 0; index < size; index++) {
            sum = 0;
            temp = arr[index];

            while(temp != 0) {
                rem = temp % 10;
                sum += (int)Math.pow(rem, 3);
                temp /= 10;
            }
            if(arr[index] == sum) {
                System.out.print(arr[index] + ", ");
            }
        }
        System.out.println("]");
    }

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = new int[50];
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();

        inputArr(arr, size);
        checkArm(arr, size);
    }
}
