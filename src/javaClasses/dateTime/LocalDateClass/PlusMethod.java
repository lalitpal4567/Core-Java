package javaClasses.dateTime.LocalDateClass;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

// plus() method returns a copy of this date with the specified amount added.
// The amount is typically Period but may be any other type implementing the TemporalAmount interface.
// (1) public LocalDate plus(TemporalAmount amountToAdd)

public class PlusMethod {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2023, Month.AUGUST, 16);
        System.out.println(date);   // 2023-08-16

        System.out.println("\nadding days...");
        Period period = Period.ofDays(4);
        date = date.plus(period);
        System.out.println(date);   // 2023-08-20

        System.out.println("\nadding weeks...");
        Period period2 = Period.ofWeeks(4);
        date = date.plus(period2);
        System.out.println(date);   // 2023-09-17

        System.out.println("\nadding months...");
        Period period3 = Period.ofMonths(1);
        date = date.plus(period3);
        System.out.println(date);   // 2023-10-17

        System.out.println("\nadding years...");
        Period period4 = Period.ofYears(1);
        date = date.plus(period4);
        System.out.println(date);   // 2024-10-17
    }
}
