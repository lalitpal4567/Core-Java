package generalPrograms;

import java.util.Scanner;

public class PrimeFactors {
    public static void findFactors(int num) {
        int m = num / 2;

        for(int i = 2; i <= m; i++) {
            if(num % i == 0) System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int num = input.nextInt();
        findFactors(num);
        System.out.println("Prime factors are: ");
        input.close();
    }
}
