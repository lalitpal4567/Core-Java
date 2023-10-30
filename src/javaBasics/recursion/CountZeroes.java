package javaBasics.recursion;

public class CountZeroes {
    static int count = 0;
    public static void fun(int num){
        if(num / 10 == 0) return;
        if(num % 10 == 0) count++;
        fun(num / 10);
    }
    public static void main(String[] args) {
        fun(3204);
        System.out.println(count);
    }
}
