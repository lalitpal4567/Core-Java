package javaBasics.recursion;

public class ReverseCounting {
    public static void reverseCounting(int counter){
        if(counter == 0) return;
        else{
            System.out.print(counter + " ");
            reverseCounting(--counter);
            System.out.print(counter + " ");
        }
    }
    public static void main(String[] args) {
        reverseCounting(10);
    }
}
