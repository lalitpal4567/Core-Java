package javaBasics.switchKeyword.switchAsAnExpression.colonSwitch;

public class SwitchExpression2 {
    public static void main(String[] args) {
        int value = 1;

        String month = switch(value){
            case 1:
                System.out.println("January");
            case 2: yield "february";
            case 3:
                System.out.println("march");
                yield "march";
            case 4: yield "april";
//                System.out.println("april");      // compilation error, unreachable statement
            default: yield "invalid month";
        };
        System.out.println(month);
    }
}
