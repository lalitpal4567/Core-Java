package javaBasics.patterns.starPattern;

public class Pattern4 {
    public static void pattern(int num){
        for(int row = 1; row <= num; row++){
            for(int space = num; space > row; space-- ){
                System.out.print("  ");
            }
            for(int col = 1; col < row * 2; col++){
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
