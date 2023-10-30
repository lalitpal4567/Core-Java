package javaBasics.switchKeyword.switchAsAnExpression.arrowSwitch;

public class ReturnFromSwitch5 {
    public static void main(String[] args) {
        int measurement = 10;

        int size = switch(measurement) {
            case 5 -> 1;
            case 10 -> (short)2;
            default -> 5;
//            case 20 -> "3";   // DOES NOT COMPILE
//            case 40 -> 4L;    // DOES NOT COMPILE
//            case 50 -> null;  // DOES NOT COMPILE
        };
    }
}
