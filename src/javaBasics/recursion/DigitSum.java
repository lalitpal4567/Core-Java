package javaBasics.recursion;

public class DigitSum {
    public static int sum(int num){
        if(num == 0) return 0;
        return (num % 10) + sum(num / 10);
    }
    public static void main(String[] args) {
        int result = sum(7321);
        System.out.println(result);
    }
}
