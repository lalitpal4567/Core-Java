package javaBasics.patterns.numberPattern;

/*
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
 */

public class Pattern1 {
    public static void pattern(int num){
        for(int row = 1; row <= num; row++){
            for(int col = 1; col <= row; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int num = 5;
        pattern(num);
    }
}
