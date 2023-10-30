package javaBasics.switchKeyword.switchAsAnExpression.colonSwitch;

public class SwitchExpressionTest {
    public static void main(String[] args) {
        int x = 1;

        String output = switch(x){
            default: yield "invalid input";
            case 1: yield "22";
            case 2: yield "lalit";
            case 3:
                System.out.println("case 3");
                yield "sachin";
        };
        System.out.println(output);
    }
}
