package javaKeyword.staticKeyword;

public class Penguin {
    String name;
    static String nameOfTallestPenguin;

    public static void main(String[] args) {
        Penguin p1 = new Penguin();
        p1.name = "Lilly";
        p1.nameOfTallestPenguin = "Lilly";

        Penguin p2 = new Penguin();
        p2.name = "Willy";
        p2.nameOfTallestPenguin = "Willy";

        System.out.println(p1.name);
        System.out.println(p1.nameOfTallestPenguin);

        System.out.println(p2.name);
        System.out.println(p2.nameOfTallestPenguin);
    }
}
