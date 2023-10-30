package javaBasics.enumeration;

// Enhanced Switch example
// It does not require break statement

public class EnumSwitch1 {
    enum Day {
        SUNDAY, MONDAY, tuesday, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    };

    public static void main(String args[]) {
        Day day = Day.tuesday;
        switch (day) {
            case SUNDAY -> System.out.println("sunday");
            case MONDAY -> System.out.println("monday");
            case tuesday -> System.out.println("tuesday");
            default -> System.out.println("other day");
        }
    }
}
