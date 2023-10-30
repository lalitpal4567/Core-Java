package javaBasics.recursion;

public class PrintNum {
    public static void recursiveFun(int count){
        count++;
        if(count <= 5){
            System.out.println("hello " + count);
            recursiveFun(count);
        }
    }
    public static void main(String[] args) {
        int count = 0;
        recursiveFun(count);
    }
}
