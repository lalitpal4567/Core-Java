package javaBasics.switchKeyword.switchAsAnExpression.colonSwitch;

// every case must return something including default

public class SwitchExpression14 {
    public static void main(String[] args) {
        String career = "1";

        String target = switch(career){
//            case "1": {
//                "Doctor";     // compilation error
//            }
            case "1": {
                yield "Doctor";
            }
            case "2": {
                System.out.println("use yield");
                yield "Engineer";
            }
            case "3": {
                System.out.println("always use yield to return sth from switch");
                yield "Lawyer";
            }
            default: {
                System.out.println("hi");
                yield "Prime Minister";
            }
        };
        System.out.println("Target: " + target);
    }
}
