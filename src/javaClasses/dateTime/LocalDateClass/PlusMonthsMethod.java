package javaClasses.dateTime.LocalDateClass;

import java.time.LocalDate;

// plusMonths() method returns a copy of this LocalDate with the specified number of months added.
// (1) public LocalDate plusMonths(long monthsToAdd)

public class PlusMonthsMethod {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2023, 8, 14);
        System.out.println(date);   // 2023-08-14

        date = date.plusMonths(1);
        System.out.println(date);   // 2023-09-14

        date = date.plusMonths(3);
        System.out.println(date);   // 2023-12-14

        date = date.plusMonths(1);
        System.out.println(date);   // 2024-01-14
    }
}
