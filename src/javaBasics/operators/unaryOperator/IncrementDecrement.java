package javaBasics.operators.unaryOperator;

public class IncrementDecrement {
    public static void main(String[] args) {
        byte a = 5;
        short b = 10;
//
//       short c = a + b;    // compilation error (return type is integer)

//        a = a + 1;        // compilation error
//        b = b + 1;        // compilation error

        a = (byte)(a + 1);  // explicit typecasting
        b = (byte)(b + 1);  // explicit typecasting

//        a++;                // implicit typecasting
//        --a;                // implicit typecasting
    }
}
