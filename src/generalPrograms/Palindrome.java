package generalPrograms;

import java.util.Scanner;

public class Palindrome {
    public static boolean checkPalindrome(int num) {
        int temp = num;
        int rem;
        int sum = 0;

        while(temp != 0) {
            sum = sum * 10 + temp % 10;
            temp /= 10;
        }

        return num == sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        String message = checkPalindrome(num) ? " is palindrome." : " is not palindrome";
//        System.out.println(checkPalindrome(num) ? " is palindrome." : " is not palindrome");
        System.out.println(num + message);

        input.close();
    }
}
