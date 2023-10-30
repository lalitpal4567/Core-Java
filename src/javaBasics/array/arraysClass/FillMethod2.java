package javaBasics.array.arraysClass;

import java.util.Arrays;

public class FillMethod2 {
    public static void fillMethod(String fillColor, String... colors){
        Arrays.fill(colors, fillColor);
        System.out.println(Arrays.toString(colors));    // [white, white, white, white, white]
    }

    public static void main(String[] args) {
        String[] colors = new String[]{"red", "yellow", "green", "blue", "violet"};
        System.out.println(Arrays.toString(colors));    // [red, yellow, green, blue, violet]

        String fillColor = "white";
        fillMethod(fillColor, colors);
        System.out.println(Arrays.toString(colors));    // [white, white, white, white, white]
    }
}
