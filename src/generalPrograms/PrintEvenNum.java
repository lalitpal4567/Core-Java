package generalPrograms;

import java.util.Scanner;

public class PrintEvenNum {
    public static void evenNum(int range) {
        for(int i = 0; i <= range; i++) {
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the range:  ");
        int range = input.nextInt();
        evenNum(range);
        input.close();
    }
}
