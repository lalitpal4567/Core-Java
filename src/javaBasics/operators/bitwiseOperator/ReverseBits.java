package javaBasics.operators.bitwiseOperator;

public class ReverseBits {
    public static void bitConvert(int num){
        int rem;
        while(num != 0){
            rem = num % 2;
            System.out.print(rem);
            num /= 2;
        }
    }
    public static void main(String[] args) {
        int n = 9;
        bitConvert(9);
    }
}
