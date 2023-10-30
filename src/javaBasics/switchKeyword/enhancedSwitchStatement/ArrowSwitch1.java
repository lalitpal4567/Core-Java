package javaBasics.switchKeyword.enhancedSwitchStatement;

public class ArrowSwitch1 {
    public static void main(String[] args) {
        int x = 2;
        switch (x + 1) {
            case 1 -> System.out.println(1);
            case 1 + 1 -> System.out.println(2);
            case 2 + 1 -> System.out.println(3);
            default -> System.out.println("Default");
        }
    }
}
