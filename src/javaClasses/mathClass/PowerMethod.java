package javaClasses.mathClass;

public class PowerMethod {
    public static void main(String[] args) {
        int n = 1000;
        long num = (long)Math.pow(2, n %= 100000);
        System.out.println(num);

    }
}
