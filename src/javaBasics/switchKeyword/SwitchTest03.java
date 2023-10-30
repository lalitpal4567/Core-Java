package javaBasics.switchKeyword;

// tradition switch statement

public class SwitchTest03 {
    public static void main(String[] args) {
        int key = 2;

        switch(key){
            case 1:
                System.out.println("You have pressed 1");
                break;
            case 2:
                System.out.println("You have pressed 2");
                break;
            case 3:
                System.out.println("You have pressed 3");
                break;
            default:
                System.out.println("Unknown key");
//                break; // optional (not mandatory)
        }
    }
}
