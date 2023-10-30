package typeCasting;

public class TypeCastingTest1 {
    public static void main(String[] args) {
        // byte
        byte a = 10;
        byte b = 20;

        byte sum1 = (byte)(a + b);  // explicit typecasting
        System.out.println(sum1);   // 30

//        --------------------------------------------------------

        // short
        short a1 = 20;
        short b1 = 30;

        byte sum2 = (byte)(a1 + b1);    // explicit typecasting
        short sum3 = (short)(a1 + b1);  // explicit typecasting

        System.out.println(sum2);   // 50
        System.out.println(sum3);   // 50

//        --------------------------------------------------------

        // int
        int a2 = 30;
        int b2 = 40;

        byte sum4 = (byte)(a2 + b2);    // explicit typecasting
        short sum5 = (short)(a2 + b2);  // explicit typecasting
        int sum6 = a2 + b2;

        System.out.println(sum4);   // 70
        System.out.println(sum5);   // 70
        System.out.println(sum6);   // 70
    }
}
