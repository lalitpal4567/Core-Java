package javaBasics.loops.forLoop;

public class PrintEvenDigits3 {
    public static void evenNum(int range){  // type promotion
        for(int i = 0; i < range;){
            System.out.print((i += 2) + " ");
        }
    }

    public static void main(String[] args) {
        byte range = 20;
        evenNum(range);
    }
}
