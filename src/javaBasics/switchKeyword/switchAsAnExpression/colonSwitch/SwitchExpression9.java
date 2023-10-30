package javaBasics.switchKeyword.switchAsAnExpression.colonSwitch;

public class SwitchExpression9 {
    public static void main(String[] args) {
        int value = 5;

        String month = switch(value){   // compilation error
            case 1:
                System.out.println("January");
            case 2:
                System.out.println("february");
            case 3: yield "march";
            default: yield "invalid month";
            case 4: yield "march";
            case 5:         // no compilation error
            case 6: yield "may";
            case 7: {}
            case 8: yield "june";
//            case 9:         // compilation error
        };
        System.out.println("month: " + month);
    }
}
