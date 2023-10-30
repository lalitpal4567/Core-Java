package javaBasics.recursion;

public class FibonacciSeries {
    public static int fibonacci(int num){
        if(num == 0) return 0;
        else if (num == 1) return 1;
        else return (fibonacci(num - 1) + fibonacci(num - 2));
    }

    public static void main(String[] args) {
        int num = 8;
        for(int i = 0; i < num; i++){
            System.out.print(fibonacci(i) + " ");
        }
    }
}
