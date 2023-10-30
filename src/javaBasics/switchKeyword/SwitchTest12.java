package javaBasics.switchKeyword;

public class SwitchTest12 {
    public static void main(String[] args) {
        String choice = "1";
        final String one = "1";
        final String two = "2";

        switch(choice){
            default: break;

            case one:   // no compilation error, constant expression
                System.out.println("You have pressed 1");
                break;

            case two:   // no compilation error, constant expression
                System.out.println("You have pressed 2");
                break;

            case "3": {};

            case "6": break;
        }
    }
}
