package javaBasics.switchKeyword.switchAsAnExpression.arrowSwitch;

public class ReturnFromSwitch4 {
    public static void main(String[] args) {
        int yield = 10;
        int value = 0;

        String answer = switch (value){
            case 0 -> {
                System.out.println("Calculating for zero...");
                if(Math.random() > 0.5) throw new IllegalArgumentException();
                yield "Zero";
            }
//                case 1 -> yield "One";      // compilation error, yield is not permitted here

            default -> throw new IllegalArgumentException("Bad value");
        };

    }
}
