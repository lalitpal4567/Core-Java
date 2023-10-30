package javaBasics.switchKeyword;

public class CaseInsideDefault {
    public static void main(String[] args) {
        var tailFeathers = 23;
        final var one = 1;
        switch (tailFeathers) {
            case one: System.out.print(3 + " ");
            default: case 3: System.out.print(5 + " ");
        }
        while (tailFeathers> 1) {
            System.out.print(--tailFeathers + " "); }

    }
}
