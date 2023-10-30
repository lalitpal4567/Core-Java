package javaBasics.enumeration;

enum DaysOff { Thanksgiving, PresidentsDay, ValentinesDay }

public class EnumSwitch2 {
    public static void main(String... unused) {
        final DaysOff input = DaysOff.Thanksgiving;
        switch(input) {
            default:
//            case DaysOff.ValentinesDay:
//                System.out.print("2");
//            case DaysOff.PresidentsDay:
//                System.out.print("1");
//            case DaysOff.Thanksgiving:
//                System.out.println("0");

                // compilation error
        }
    }
}
