package generalPrograms;

import java.util.Scanner;

// largest number given by user without array
public class LargestOfNNum {
    static Scanner input = new Scanner(System.in);
    public static int findLargest(int num) {
        int largest = 0;
        int value;

        for(int i = 0; i < num; i++) {
            value = input.nextInt();

            if(largest < value) largest = value;
        }
        return largest;
    }

    public static void main(String[] args) {
        System.out.print("Enter the value of num: ");
        int num = input.nextInt();
        System.out.println("Largest number is: " + findLargest(num));
        input.close();
    }
}
