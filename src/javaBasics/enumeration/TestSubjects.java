package javaBasics.enumeration;

enum Subjects {
    MATH, ENGLISH, HISTORY, HINDI, BIO;
    Subjects() {
        System.out.println("This is enum constructor.");
    }
}

public class TestSubjects {
    public static void main(String[] args) {
        Subjects s = Subjects.MATH;
        System.out.println(s);
        System.out.println(Subjects.MATH);
    }
}
