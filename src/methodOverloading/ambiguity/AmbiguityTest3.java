package methodOverloading.ambiguity;

public class AmbiguityTest3 {
//    public void fly(int[] lengths){};
//    public void fly(int... lengths){};      // compilation error, both methods have same signature.

    public static void main(String[] args) {
        AmbiguityTest3 obj = new AmbiguityTest3();
//        obj.fly(new int[]{5, 6, 2});
//        obj.fly(2, 6, 2);
    }
}
