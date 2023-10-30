package generalPrograms;

import java.util.Scanner;

// Check whether a given number is even or odd.

public class CheckEvenOdd {
    public static boolean checkOddEven(int num)
    {
        return num % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int num = input.nextInt();

        if(checkOddEven(num)) {
            System.out.println(num+" is even.");
        } else {
            System.out.println(num+" is odd.");
        }
        input.close();
    }
}
