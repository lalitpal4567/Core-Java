package javaBasics.switchKeyword.switchAsAnExpression.colonSwitch;

public class SwitchExpression11 {
    public static void main(String[] args) {
        int value = 1;

        String month = switch(value){
            case 1: {
                System.out.println("January");
//                break;      // compilation error, not permitted
            }
            case 2: {
                yield "february";
//                break;      // compilation error, not permitted
            }
            case 3: {
                System.out.println("march");
                yield "march";
            }
            case 4: {
                yield "april";
            }
//                System.out.println("april");      // compilation error, unreachable statement
            default: {
                yield "invalid month";
            }
        };
        System.out.println(month);
    }
}

