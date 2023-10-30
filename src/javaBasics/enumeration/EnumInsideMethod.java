package javaBasics.enumeration;

public class EnumInsideMethod {

    public static void main(String[] args) {
        enum Day {
            SUNDAY, MONDAY, tuesday, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
        };

        for(Day day : Day.values()){
            System.out.println(day);
        }
    }
}
