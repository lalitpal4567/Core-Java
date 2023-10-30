package javaBasics.recursion;

public class PrintPattern1 {
    public static void pattern(int row, int col){
        if(row == 0) return;
        if(col < row) {
            System.out.print("* ");
            pattern(row, ++col);

        }else{
            System.out.println();
            pattern(--row, 0);
        }
    }
    public static void main(String[] args) {
        int num = 5;
        pattern(num, 0);
    }
}
