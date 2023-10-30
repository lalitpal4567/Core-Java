package javaBasics.switchKeyword.switchAsAnExpression.arrowSwitch;

public class ReturnFromSwitch2 {
    enum ColorPicker {RED, BLUE, GREEN, YELLOW, SKY_BLUE, GREY}

    public static void main(String[] args) {
        ColorPicker color = ColorPicker.SKY_BLUE;

        System.out.println("Color: " + switch(color){
            case RED -> "red blood";
            case BLUE -> "blue sky";
            case GREEN -> "green grass";
            case YELLOW -> "yellow sun";
            case SKY_BLUE -> "sky blue sky";
            case GREY -> "grey cement";
            default -> "no more elements";  // no compilation error, it is optional, unnecessary
                                            // as all the cases have been covered

        });
    }
}
