package javaBasics.enumeration;

public class EnumTest1 {
    enum Direction {};

    public static void main(String[] args) {
//        Direction dir = Direction.values(); // compilation error

        Direction[] dir1 = Direction.values();  // no error
    }
}
