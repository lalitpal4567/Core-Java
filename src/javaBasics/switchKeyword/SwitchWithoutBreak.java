package javaBasics.switchKeyword;

// If we drop break keyword then all the statements after the matching case will be executed.

public class SwitchWithoutBreak {
    public static void main(String[] args) {
        char character = 'b';

        switch(character){
            case 'a':
                System.out.println("small letter a");
            case 'b':
                System.out.println("small letter b");
            case 'c':
                System.out.println("small letter c");
            case 'z':
                System.out.println("capital letter Y");
            default:
                System.out.println("other letter");
        }
    }
}
