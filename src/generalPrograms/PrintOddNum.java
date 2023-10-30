package generalPrograms;

import java.util.Scanner;

public class PrintOddNum {
    public static void oddNum(int range) {
        for(int i = 0; i <= range; i++) {
            if(i % 2 != 0) System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int range = input.nextInt();
        oddNum(range);
        input.close();
    }
}
