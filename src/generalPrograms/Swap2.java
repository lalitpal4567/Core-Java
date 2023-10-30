package generalPrograms;

public class Swap2{
    public static void swapNum(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping");
        System.out.println("a: " + a + " b: " + b);
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Before swapping");
        System.out.println("a: " + a + " b: " + b);
        swapNum(a,b);
    }
}
