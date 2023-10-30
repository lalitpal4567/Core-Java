package javaBasics.loops.forEachLoop;

public class IteratingStringArray {
    public static void iteratingObject(String[] colors){
        for(String str : colors){
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        String[] colors = {"red", "yellow", "blue", "white", "green"};
        iteratingObject(colors);
    }
}
