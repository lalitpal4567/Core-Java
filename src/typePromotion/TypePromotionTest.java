package typePromotion;

public class TypePromotionTest {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;
        byte num3 = 15;
        short num4 = 20;
        long num5 = 25;
        float num6 = 30;
        double num7 = 35;
        char num8 = 40;

//        num1 + num2 // int
//        num1 + num3 // int
//        num1 + num4 // int
//        num1 + num5 // long
//        num1 + num6 // float
//        num1 + num7 // double
//        num1 + num8 // int

        Object o = num1 + num2;
        System.out.println(o.getClass().getSimpleName());                           // Integer
        System.out.println(((Object)(num1 + num2)).getClass().getSimpleName());     // Integer
        System.out.println(((Object)(num1 + num3)).getClass().getSimpleName());     // Integer
        System.out.println(((Object)(num1 + num4)).getClass().getSimpleName());     // Integer
        System.out.println(((Object)(num1 + num5)).getClass().getSimpleName());     // Long
        System.out.println(((Object)(num1 + num6)).getClass().getSimpleName());     // Float
        System.out.println(((Object)(num1 + num7)).getClass().getSimpleName());     // Double
        System.out.println(((Object)(num1 + num8)).getClass().getSimpleName());     // Integer
    }
}

