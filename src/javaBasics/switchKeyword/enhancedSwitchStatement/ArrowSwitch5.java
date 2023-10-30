package javaBasics.switchKeyword.enhancedSwitchStatement;

public class ArrowSwitch5 {
    public static void main(String[] args) {
        int dice = 3;

        switch(dice){
            case 1 -> System.out.println("Its one.");
//            System.out.println("pass dice to next person"); // compilation error
//            break;    // compilation error, must be enclosed in a curly braces

            case 2 -> System.out.println("Its two");
//            break;  //  compilation error

            case 3 -> System.out.println("Its three");
//            String diceColor = "Red";   // compilation error

            case 4 -> {
                System.out.println("Its four");
                int value = 4;
                System.out.println("It is " + value);
            }
//            default -> break;   // compilation error

            default -> {
                break;  // no compilation error
            }
        }
    }
}
