package PatternVariable;

public class NumberVariable{
    static void compareIntegers(Number number) {
//        if(number instanceof Integer) {
//            Integer data = (Integer)number;
//            System.out.println(data.compareTo(5));
//        }

        // pattern matching variable
        if(number instanceof Integer data) {
            System.out.println(data.compareTo(5));
        }
        // The variable data in this example is referred to as the pattern variable.

        if(number instanceof final Integer data) {
//            data = 10;  // compilation error
        }
    }

    public static void main(String[] args) {
        int num1 = 5;
        Integer num2 = 10;
        Long num3 = 20L;

        compareIntegers(num1);  // 0
        compareIntegers(num2);  // 1
        compareIntegers(num3);
    }
}
