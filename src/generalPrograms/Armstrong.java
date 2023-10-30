package generalPrograms;

import java.util.Scanner;

public class Armstrong {
    public static boolean findArmstrong(int num) {
        int rem;
        int sum = 0;
        int temp = num;

        while(temp != 0) {
            rem = temp % 10;
            sum += rem * rem * rem;
            temp /= 10;
        }

        return num == sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a 3-digit number: ");
        int num = input.nextInt();

        if(findArmstrong(num)) {
            System.out.println(num + " is Armstrong.");
        } else {
            System.out.println(num + " is not Armstrong.");
        }
        input.close();
    }
}
