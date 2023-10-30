package javaBasics.patterns.starPattern;

/*
        * * * * *
        * * * * *
        * * * * *
        * * * * *
        * * * * *
 */

public class SquarePattern {
    public static void pattern(int num){
        for(int row = 1; row <= num; row++){
            for(int col = 1; col <= num; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int num = 5;
        pattern(num);
    }
}
