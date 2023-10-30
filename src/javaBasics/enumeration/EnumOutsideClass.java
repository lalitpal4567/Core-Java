package javaBasics.enumeration;

enum Rainbow { VIOLET, INDIGO, BLUE, GREEN, yellow, ORANGE, RED };

public class EnumOutsideClass {
    public static void main(String[] args) {
        for(Rainbow color : Rainbow.values()){
            System.out.println(color);
        }
        Rainbow color = Rainbow.GREEN;
        System.out.println("\n" + color);
    }
}
