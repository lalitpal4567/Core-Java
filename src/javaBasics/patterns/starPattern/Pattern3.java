package javaBasics.patterns.starPattern;

public class Pattern3 {
    public static void pattern(int num){
        for(int row = 0; row < num; row++){
            for(int space = row; space < num - 1; space++){
                System.out.print(" ");
            }
            for(int col = 0; col <= row; col++){
                System.out.print("m");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int num = 5;
        pattern(num);
    }
}
