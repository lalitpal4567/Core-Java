package javaBasics.switchKeyword.enhancedSwitchStatement;

public class ArrowSwitch8 {
    public static void main(String[] args) {
        short choice = 66;
        final byte value = 55;
        final int value1 = 66;
        final long value2 = 77;

        switch (choice) {
            case value -> {
                System.out.println("You are welcome");
            }
            case value1 -> {
                System.out.println("Nice to meet you.");
                {
                    int firstNum = 10;
                    int secondNum = 20;
                    System.out.println("Multiplication: " + firstNum * secondNum);
                }
            }
//            case value2:{}  // compilation error
            case (short) value2 ->
//                firstNum = 5;   // compilation error
//                secondNum = 15; // compilation error
//                int result = firstNum + secondNum;  // compilation error
                    System.out.println();
        }
    }
}
