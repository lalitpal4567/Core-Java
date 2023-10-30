package javaBasics.switchKeyword.enhancedSwitchStatement;

public class ArrowSwitch7 {
    public static void main(String[] args) {
        int colorOfRainbow = 5;
//        int red = 5;      // compilation error
        final int red = 5;  // constant
        final int blue = 10;
        final int green = 5;
        final long yellow = 15;
        final short skyBlue = 20;

        switch (colorOfRainbow) {
            default -> System.out.print("Home");

            case red ->   // must be constant expression
                    System.out.print("Away");

            case blue + green -> System.out.println("Stay at home.");

//            case green + yellow -> System.out.println("Wait at home."); // compilation error

            case (green + skyBlue) ->{
                System.out.println("Preparing breakfast");
            }
        }
    }
}

