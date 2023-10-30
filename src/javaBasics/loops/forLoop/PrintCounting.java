package javaBasics.loops.forLoop;

public class PrintCounting {
    public static void forLoop(int range){
        for(int count = 0; count < range; count++){
            System.out.print(count + "\t");
        }
    }
    public static void main(String[] args) {
        int range = 15;
        forLoop(range);
    }
}
