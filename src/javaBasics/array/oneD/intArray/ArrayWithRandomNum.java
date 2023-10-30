package javaBasics.array.oneD.intArray;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayWithRandomNum {
    static int[] arr = new int[100];
    int size;
    static int MIN = 1;
    static int MAX = 100;
    public static int generateRandom(){
        int random = (int)(Math.random() * (MAX - MIN) + 1) + MIN;
        return random;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size < 100: ");
        int size = input.nextInt();
        for(int index = 0; index < size; index++){
            arr[index] = generateRandom();
        }

        System.out.println(arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
