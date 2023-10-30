package javaBasics.switchKeyword.enhancedSwitchStatement;


// Enhanced switch statement
public class ArrowSwitch2 {

    public static void main(String[] args) {
        String month = "JANUARY";
        int monthNumber = switch (month.toLowerCase()) {
            case "january" -> 1;
            case "february" -> 2;
            case "march" -> 3;
            case "april" -> 4;
            case "may" -> 5;
            case "june" -> 6;
            case "july" -> 7;
            case "august" -> 8;
            case "september" -> 9;
            case "october" -> 10;
            case "november" -> 11;
            case "december" -> 12;
            default -> 0;
        };
        System.out.println(monthNumber);
    }
}

