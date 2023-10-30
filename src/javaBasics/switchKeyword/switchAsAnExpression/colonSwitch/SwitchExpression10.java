package javaBasics.switchKeyword.switchAsAnExpression.colonSwitch;

public class SwitchExpression10 {
    public static void main(String[] args) {
        int choice = 2;

        String result = switch(choice){
            case 1: {
                System.out.println("hi");
            }
            case 2: {
                System.out.println("hello");
            }
            case 3: {
                System.out.println("good morning");
            }
            default: {
                System.out.println("good afternoon");
                yield "good bye";
            }
        };
        System.out.println(result);
    }
}
