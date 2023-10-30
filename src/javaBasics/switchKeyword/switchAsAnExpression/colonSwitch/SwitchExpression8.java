package javaBasics.switchKeyword.switchAsAnExpression.colonSwitch;

public class SwitchExpression8{
    public static void main(String[] args) {
        int value = 1;

        String month = switch(value){   // compilation error
            case 1:
                System.out.println("January");
            case 2:
                System.out.println("february");
            case 3: yield "march";
            case 4:
                System.out.println("april");
                yield "march";

            default: yield "invalid month";
            case 5: yield "may";
            case 6: yield "june";
        };
        System.out.println(month);
    }
}
