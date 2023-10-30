package javaBasics.switchKeyword;

public class SwitchTest11 {
    public static void main(String[] args) {
        byte choice = 3;

        switch(choice){
            case 1, 2:
                System.out.println("You have pressed either 1 or 2.");
                break;

            case 3: {
                System.out.println("You have pressed 3.");
            }
            System.out.println("You have pressed Three.");  // no compilation error
            break;  // no compilation error

            case 4,5,6:
                System.out.println("You pressed either 4, or 5 or 6.");
                break;

            case 7: break;  // no compilation error

            case 8: {}  // no compilation error

            case 9:         // no compilation error

            default: break;
        }
    }
}
