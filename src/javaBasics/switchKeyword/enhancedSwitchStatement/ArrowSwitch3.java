package javaBasics.switchKeyword.enhancedSwitchStatement;

public class ArrowSwitch3 {
    public static void main(String[] args) {
        int choice = 2;

        switch (choice) {
            case 1 -> {
                System.out.println("One");
                System.out.println("1");
            }
            case 2 -> {
                System.out.println("Two");
                System.out.println(2);
            }
            case 3 -> {
                System.out.println("Three");
                System.out.println(3);
            }
            default -> {
            }
        }
    }
}
