package javaBasics.recursion;

public class SumNNum {
    public static int sumNum(int num){
        if(num == 0){
            return 0;
        }
        return num + sumNum(num - 1);

    }

    public static void main(String[] args) {
        int result = sumNum(5);
        System.out.println(result);
    }
}
