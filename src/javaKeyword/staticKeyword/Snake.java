package javaKeyword.staticKeyword;

public class Snake {
    public static long hiss = 2;

    public static void main(String[] args) {
        System.out.println(Snake.hiss);
        System.out.println(hiss);

        Snake obj = new Snake();
        System.out.println(obj.hiss);

        obj = null;
        System.out.println(obj.hiss);
    }
}
