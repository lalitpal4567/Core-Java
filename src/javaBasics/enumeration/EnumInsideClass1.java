package javaBasics.enumeration;

public class EnumInsideClass1 {
    enum Season {WINTER, SPRING, SUMMER, FALL;}   // (;) is optional

    public static void main(String[] args) {
        Season s = Season.WINTER;
        Season s1 = Season.SUMMER;

        System.out.println(s);
        System.out.println(s1);
    }
}
