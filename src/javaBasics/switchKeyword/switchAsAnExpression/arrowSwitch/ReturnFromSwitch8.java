package javaBasics.switchKeyword.switchAsAnExpression.arrowSwitch;

public class ReturnFromSwitch8 {
    public static void main(String[] args) {
        int fish = 5;
        int length = 12;

        var name = switch(fish) {
            case 1 -> "Goldfish";

//            case 2 -> {}  // compilation error

//               case 3 -> {
//                      if(length > 10) yield "Blobfish";
//                   }  // compilation error

            default -> "Swordfish";
        };

        System.out.println("-------------------------------");
        int fish1 = 5;
        final int length1 = 12;

        var name1 = switch(fish1) {
                    case 1 -> "Goldfish";
//                    case 2 -> {}  // compilation error
//                    case 3 -> {
//                       if(length1 > 10) yield "Blobfish";
//                    } // compilation error
                    default -> "Swordfish";
        };
    }
}
