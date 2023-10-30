package javaBasics.loops.forLoop;

public class PrintEvenDigits2 {
    public static void evenNum(int range){  // type promotion
        for(int i = 0; i < range; i += 2){
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        byte range = 20;
        evenNum(range);
    }
}
