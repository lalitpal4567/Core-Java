package generalPrograms;

import java.util.Scanner;

public class PrintPrimeNum {
    public static void displayPrimeNum(int range) {
        boolean status;

        for(int i = 2; i <= range; i++) {
            status = false;
            for(int j = 2; j <= i / 2; j++) {
                if(i % j == 0) {
                    status = true;
                    break;
                }
            }
            if(!status) System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int range = input.nextInt();
        displayPrimeNum(range);
        input.close();
    }
}
