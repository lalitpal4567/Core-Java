package javaClasses.dateTime.LocalDateClass;

import java.time.LocalDate;

// plusWeeks() method Returns a copy of this LocalDate with the specified number of weeks added.
// (1) public LocalDate plusWeek(long weeksToAdd)

public class PlusWeeksMethod {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2023, 8, 14);
        System.out.println(date);   // 2023-08-14

        date = date.plusWeeks(1);
        System.out.println(date);   // 2023-08-21

        date = date.plusWeeks(2);
        System.out.println(date);   // 2023-09-04

        date = date.plusWeeks(4);
        System.out.println(date);   // 2023-10-02
    }
}
