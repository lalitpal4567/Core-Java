package javaBasics.patterns.starPattern;


/*
        *
        * *
        * * *
        * * * *
        * * * * *
 */

public class Pattern1 {
    public static void pattern(int num){
        for(int row = 1; row <= num; row++){
            for(int col = 1; col <= row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int num = 5;
        pattern(num);
    }
}
