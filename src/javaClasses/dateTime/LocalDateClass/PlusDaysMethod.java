package javaClasses.dateTime.LocalDateClass;

import java.time.LocalDate;
import java.time.Month;

// plusDays() method returns a copy of this LocalDate with the specified number of days added.
// (1) public LocalDate plusDays(long daysToAdd)

public class PlusDaysMethod {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2023, Month.AUGUST, 14);
        System.out.println(date);   // 2023-08-14

        date = date.plusDays(2);
        System.out.println(date);   // 2023-08-16

        date = date.plusDays(15);
        System.out.println(date);   // 2023-08-31

        date = date.plusDays(1);
        System.out.println(date);   // 2023-09-01
    }
}
