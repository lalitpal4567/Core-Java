package javaBasics.switchKeyword.switchAsAnExpression.colonSwitch;

public class SwitchExpression3 {
    public static void main(String[] args) {
        int value = 1;

        String month = switch(value){
            case 1:
                System.out.println("January");
            case 2:
                System.out.println("february");
            case 3: yield "march";
//                System.out.println("march");    // compilation error, unreachable statement
            case 4:
                System.out.println("april");
                yield "march";
            case 5: yield "may";
//                System.out.println("april");      // compilation error, unreachable statement
            case 6:         // no compilation error
            default: yield "invalid month";
        };
        System.out.println(month);
    }
}

