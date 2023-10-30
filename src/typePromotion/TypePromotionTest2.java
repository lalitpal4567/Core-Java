package typePromotion;

public class TypePromotionTest2 {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;
        byte num3 = 20;
        short num4 = 30;
        long num5 =  40;
        float num6 = 50;
        double num7 = 60;

        int result1 = num1 * num2;

//        byte result2 = num1 * num3; // compilation error

        // type promotion of num3 -> int
        int result2 = num1 * num3;

        // type promotion of num4 -> int
        int result3 = num1 * num4;

        // type promotion of num1 -> long
//        int result4 = num1 * num5;  // compilation error
        long result4 = num1 * num5;

        // type promotion of num1 -> float
//        int result5 = num1 * num6;  // compilation error
        float result5 = num1 * num6;

        // type promotion of num1 -> double
//        float result6 = num1 * num7;    // compilation error
        double result6 = num1 * num7;


        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);

        double result7 = (((num1 + num2) * num3) / (num4 - num5)) + (num6 * num7);
        System.out.println(result7);
    }
}
