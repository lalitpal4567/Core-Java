package javaBasics.switchKeyword.enhancedSwitchStatement;

public class ArrowSwitch9 {
    public static void main(String[] args) {
        String choice = "AppleShake";
        final String fruit1 = "Mango";
        final String fruit2 = "Guava";
        final String fruit3 = "Banana";

        switch(choice){
            case fruit1 -> System.out.println("Mango Shake");
            case (fruit2) ->{
                System.out.println("Guava Shake");
            }
//            case fruit3 -> boolean isMilkAvailable = true;  // compilation error, must be enclosed in a curly braces
//            case fruit3 ->{
//                boolean isMilkAvailable = true;
//                System.out.println("Banana shake is ready.");
//            }
            case "Apple"+"Shake" -> System.out.println("Apple shake is available only in windter.");
//            break;  // compilation error

            default -> {
                System.out.println("Apple Juice");
                System.out.println("PineApple juice");
                break;  // no compilation error, redundant
            }
        }
    }
}
