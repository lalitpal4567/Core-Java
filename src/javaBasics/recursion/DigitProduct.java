package javaBasics.recursion;

public class DigitProduct {
    public static int product(int num){
        if(num % 10 == num){
            return num;
        }
        return (num % 10) * product(num / 10);
    }

    public static void main(String[] args) {
        int result = product(7321);
        System.out.println(result);
    }
}
