package javaBasics.patterns.starPattern;

/*
        * * * * *
        * * * *
        * * *
        * *
        *
 */

public class Pattern2 {
    public static void pattern(int num){
        for(int row = 1; row <= num; row++){
            for(int col = row; col <= num; col++){
                System.out.print("* ");
            }
//            for(int col = 1; col <= num - row + 1; col++){
//                System.out.print("* ");
//            }

            // if row = 0;
//            for(int col = 0; col <= num - row; col++){
//                System.out.print("* ");
//            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int num = 5;
        pattern(num);
    }
}
