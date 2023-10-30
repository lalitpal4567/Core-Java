package javaBasics.switchKeyword.switchAsAnExpression.colonSwitch;

public class SwitchExpression {
    public static void main(String[] args) {
        int funCalling = 1;

        String funName = switch(funCalling){
            case 1: yield "calling showInfo()...";
            case 2:
                System.out.println("this is case 2");
                yield "calling display()";
            case 3: yield "calling print()";
            default: yield "no such function";
        };
        System.out.println(funName);
    }
}
