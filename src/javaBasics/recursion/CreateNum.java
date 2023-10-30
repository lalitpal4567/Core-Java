package javaBasics.recursion;

public class CreateNum {
    public static void printNum(int num){
        if(num == 6) return;
        System.out.println(num);    // 1 2 3 4 5
        printNum(num + 1);
        System.out.println(num);    // 5 4 3 2 1
    }

    public static void main(String[] args) {
        printNum(1);
    }
}
