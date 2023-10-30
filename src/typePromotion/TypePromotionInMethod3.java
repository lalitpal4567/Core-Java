package typePromotion;

public class TypePromotionInMethod3 {
    public void mul(int a, long b) {
        System.out.println(a*b);
    }
    public void mul(long a, int b) {
        System.out.println(a*b);
    }

    public static void main(String[] args) {
        TypePromotionInMethod3 obj = new TypePromotionInMethod3();
//        obj.mul(2, 5);  // ambiguity
    }
}