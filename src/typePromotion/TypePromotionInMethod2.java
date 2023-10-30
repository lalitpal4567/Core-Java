package typePromotion;

public class TypePromotionInMethod2 {
    public static void fun(int a) {
        System.out.println(a);
    }
    public static void fun(double a) {
        System.out.println(a);
    }

    public static void main(String[] args) {
        fun('c');  // promoted to int from char
        fun(1.4F); // promoted to double from float
    }
}
