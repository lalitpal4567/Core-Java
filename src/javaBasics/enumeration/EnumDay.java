package javaBasics.enumeration;

public class EnumDay {
    enum Day {
        SUNDAY, MONDAY, tuesday, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    };

    public static void main(String args[]) {
        Day day = Day.tuesday;
        switch (day) {
            case SUNDAY:
                System.out.println("sunday");
                break;
            case MONDAY:
                System.out.println("monday");
                break;
            case tuesday:
                System.out.println("tuesday");
                break;
            default:
                System.out.println("other day");
        }
    }
}
