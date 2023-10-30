package javaBasics.switchKeyword.enhancedSwitchStatement;

public class ArrowSwitch6 {
    public static void main(String[] args) {
        byte dayNo = 5;

        switch(dayNo){
            case 2 -> System.out.println("Its monday");
            case 3  -> System.out.println("Its tuesday");
//            break;    // compilation error

            case 4 -> {
                System.out.println("Its wednesday");
                break;
            }
            case 5 -> {
                String day = "Its thursday";
                System.out.println(day);
            }
            case 6,7,1 -> System.out.println("Day off");    // no compilation error

            default -> {
                System.out.println("Invalid day number");
                break;  //  no compilation error, redundant
            }
        }
    }
}
