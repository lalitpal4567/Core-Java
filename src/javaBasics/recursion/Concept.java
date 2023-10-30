package javaBasics.recursion;

// --num == num = num - 1
public class Concept {
    public static void fun(int num){
        if(num == 0) return;
        System.out.println(num);
//        fun(num--);   // stack overflow
        fun(num = num - 1);     // no stack overflow
//        fun(--num);
    }
    public static void main(String[] args) {
        fun(5);
    }
}
