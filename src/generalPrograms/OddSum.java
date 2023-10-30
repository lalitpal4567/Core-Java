package generalPrograms;

import java.util.Scanner;

// sum of odd digits within a range
public class OddSum {
    public static int oddSum(int num) {
        int i = 0;
        int sum = 0;

        while(i <= num) {
            if(i % 2 != 0) {
                sum += i;
            }
            i++;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.print("Enter the value of num: ");
        int num = input.nextInt();
        System.out.println("Sum of odd no. is: " + oddSum(num));
        input.close();
    }
}
