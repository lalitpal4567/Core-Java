package javaBasics.switchKeyword.switchAsAnExpression.arrowSwitch;

public class ReturnFromSwitch3 {
    public static void main(String[] args) {
        int random = 7;

        String output = switch(random){
            case 1 -> "this is one";
            case 2 -> "this" + " is " + "two";
//            case 3 -> return "this is three";   // compilation error
//            case 4 -> yield "this is four";      // compilation error

//            case 5 -> {
//                System.out.println("yield keyword should be used in case of multiple statements");
//                "this is five";     // compilation error
//            }

//            case 6 -> {
//                System.out.println("return keyword will not work here");
//                return "this is six";       // compilation error
//            }

            case 7 -> {
                System.out.println("yield is not a reserved keyword in Java");
                System.out.println("yield is context sensitive.");
                System.out.println("It can be used as a variable name.");
                yield "this is seven";      // no compilation error
            } // ;      // don't include semicolon at the end of case, shows compilation error

//            case 8 -> {};   // compilation error, must return something
//            case 9 -> {
//                break;        // compilation error, must return something
//            }

            default -> "this is a number";  // default is compulsory here.
                                            // to cover all cases.
        };
        System.out.println("Output random number: " + output);
    }
}
