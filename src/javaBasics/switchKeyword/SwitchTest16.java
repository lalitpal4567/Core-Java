package javaBasics.switchKeyword;

public class SwitchTest16 {
    public static void main(String[] args) {
        int colorOfRainbow = 5;
//        int red = 5;  // compilation error
        final int red = 5;  // constant

        switch(colorOfRainbow) {
            default:
                System.out.print("Home");
                break;
            case red:   // must be constant expression
                System.out.print("Away");
        }
    }
}