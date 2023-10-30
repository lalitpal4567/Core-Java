package generalPrograms;

import java.util.Scanner;

public class PrintTable {
    public static void printTable(int num) {
        for(int i = 1; i <= 10; i++) {
            for(int j = 1; j <= num; j++) {
                System.out.print("\t" + j * i);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the range of a table: ");
        int num = input.nextInt();
        printTable(num);
        input.close();
    }
}
