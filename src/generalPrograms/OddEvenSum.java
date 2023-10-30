package generalPrograms;

import java.util.Scanner;

public class OddEvenSum {
    public static void oddEvenSum(int num) {
        int a = 0;
        int oddSum = 0;
        int evenSum = 0;

//      for(; a <= num ;)
        while(a <= num) {
            if(a % 2 == 0) {
                evenSum += a;
            } else {
                oddSum += a;
            }
            a++;
        }
        System.out.println("Even sum is: " + evenSum + "  " + "Odd sum is:  " + oddSum);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of num: ");
        int num = input.nextInt();
        oddEvenSum(num);
        input.close();
    }
}
