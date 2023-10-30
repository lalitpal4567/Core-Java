package javaBasics.operators.relationalOperator;

// < or > operator can't be used on boolean type

public class LessthanGreaterthanOperator {
    public static void main(String[] args) {
        System.out.println(10 < 20);    // true
        System.out.println(10 < 'a');;  // true
        System.out.println(10 > 10.5f); // false
//        System.out.println(true > true);      // compilation error
        System.out.println('a' > 'c');  // false
//        System.out.println('a' > "a");        // compilation error
//        System.out.println("hi" < "hello");   // compilation error    (reference type)
        System.out.println((byte)5 > (short)5);     // false

        // reference type
        String name1 = new String("Aman");
        String name2 = new String("Aman");
//        System.out.println(name1 < name2);      // compilation error


        Integer a1 = 5;
        Integer b2 = 10;
        System.out.println(a1 < b2);    // true

    }
}
