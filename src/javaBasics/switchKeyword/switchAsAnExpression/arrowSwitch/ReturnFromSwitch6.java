package javaBasics.switchKeyword.switchAsAnExpression.arrowSwitch;

public class ReturnFromSwitch6 {
    public static void main(String[] args) {
        String operator = "#";

        String result = switch(operator){
            case "+" -> Integer.toString(3 + 5);
            case "-" -> Integer.toString(5 - 3);
            case "/" -> Integer.toString(5 / 3);
            case "%" -> Integer.toString(5 % 3);
            case "*" -> Integer.toString(5 * 3);

            default -> "Invalid operator";  // Default is compulsory here to cover all cases
                                            // otherwise shows compilation error

        };
            System.out.println("Result: " + result);
    }
}
