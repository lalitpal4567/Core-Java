package javaBasics.patterns.starPattern;

/*
        *
        * *
        * * *
        * * * *
        * * * * *
        * * * *
        * * *
        * *
        *
 */

public class HalfRightDiamond {
    public static void pattern(int num){
        for(int row = 0; row < 2 * num; row++){
            int totalCols = row > num ? 2 * num - row : row;
            for(int col = 0; col < totalCols; col++){
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
