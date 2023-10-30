package javaClasses.dateTime.LocalDateClass;

import java.time.LocalDate;

// plusYears() method returns a copy of this LocalDate with the specified number of years added.
// (1) public LocalDate plusYears(long yearsToAdd)

public class PlusYearsMethod {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2023, 8, 14);
        System.out.println(date);   // 2023-08-14

        date = date.plusYears(1);
        System.out.println(date);   // 2024-08-14

        date = date.plusYears(5);
        System.out.println(date);   // 2029-08-14

        date = date.plusYears(100);
        System.out.println(date);   // 2129-08-14
    }
}
