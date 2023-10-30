package typePromotion;

public class TypePromotionInMethod {
    // public void show(int a){
    //     System.out.println(a);
    // }
    public void show(double a){  // promoted to double from int
        System.out.println(a);
    }

    public static void main(String[] args) {
        TypePromotionInMethod obj = new TypePromotionInMethod();
        obj.show(5);
    }
}
