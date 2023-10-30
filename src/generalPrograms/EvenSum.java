package generalPrograms;

import java.util.Scanner;

// sum of even numbers within a range
public class EvenSum {
    public static int evenSum(int num) {
        int i = 0;
        int sum = 0;

        while(i <= num) {
            if(i % 2 == 0) {
                sum += i;
            }
            i++;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of num: ");
        int num = input.nextInt();
        System.out.println("Sum of even no. is: " + evenSum(num));
        input.close();
    }
}
