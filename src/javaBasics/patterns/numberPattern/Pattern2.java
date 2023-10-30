package javaBasics.patterns.numberPattern;

public class Pattern2 {
    public static void pattern(int num){
        int sum = 0;
        for(int row = 1; row <= num; row++){
            for(int space = num; space > row + 1; space--){
                System.out.print("  ");
            }

            for(int col = 1; col < row * 2; col++){
                System.out.print(col + " ");
                sum+= col;
            }
            System.out.println();
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int num = 5;
        pattern(num);
    }
}
