package javaBasics.switchKeyword.switchAsAnExpression.colonSwitch;

public class SwitchExpression13 {
    public static void main(String[] args) {
        String operation = "+";

        int result = switch(operation){
            default: yield 1000;

            case "+": {
                System.out.println("doing addition...");
//                100;    // compilation error
//                return (2 + 6);     // compilation error
                yield (2 + 8);
//                break;      // compilation error, break out of switch expression is not allowed
            }

            case "-": {
                yield 2 - 1;
            }
        };
        System.out.println(result);
    }
}
