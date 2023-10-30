package javaBasics.loops.forLoop;

public class ReverseCounting {
    public static void displayCounting(int range){
        for(int count = range; count > 0; count--){
            System.out.print(count + "\t");
        }
    }

    public static void main(String[] args) {
        int range = 10;
        displayCounting(range);
    }
}
