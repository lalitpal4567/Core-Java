package javaBasics.switchKeyword.switchAsAnExpression.arrowSwitch;

public class ReturnFromSwitch7 {
    public static void main(String[] args) {
        int fish = 5;
        int length = 12;

        var name = switch(fish) {
            case 1 -> "Goldfish";
            case 2 -> { yield "Trout"; } // yield is optional here
            case 3 -> {
                if(length > 10) yield "Blobfish";
                else yield "Green";
            }
            default -> "Swordfish";
        };
        System.out.println("name: " + name);
    }
}
