package javaBasics.recursion;

// nth fibonacci number
public class Fibonacci2 {
    public static int fib(int n){
        if(n < 2) return n;
        return fib(n - 1) + fib(n - 2);
    }
    public static void main(String[] args) {
        int result = fib(5);
        System.out.println(result);
    }
}

