package wrapperClass.integerClass;

public class test1 {
    public static void main(String[] args) {
        int a = 10;
        Integer j = Integer.valueOf(a);        // boxing explicitly, int -> Integer
        Integer x = Integer.valueOf(50);    // boxing explicitly, int -> Integer

        Integer y = 20;     // autoboxing, int -> Integer
        Integer z = a;      // autoboxing, int -> Integer

        System.out.println(j + "  " + x + "  " + y + "  " + z);
        System.out.println("j: " + j);  // 10
        System.out.println("x: " + x);  // 50
        System.out.println("y: " + y);  // 20
        System.out.println("z: " + z);  // 10
    }
}
