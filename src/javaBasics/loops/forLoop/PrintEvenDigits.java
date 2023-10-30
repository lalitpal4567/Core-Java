package javaBasics.loops.forLoop;

public class PrintEvenDigits {
    public static void evenNum(int range){  // type promotion
        for(int i = 0; i < range; i++){
            System.out.print(i++ + " ");
        }
    }

    public static void main(String[] args) {
        byte range = 20;
        evenNum(range);
    }
}
