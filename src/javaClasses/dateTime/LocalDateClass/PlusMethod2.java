package javaClasses.dateTime.LocalDateClass;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class PlusMethod2 {
    public static void modifyDateTime(LocalDate date, Period period){
        date = date.plus(period);
        System.out.println(date);
    }

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2023, Month.AUGUST, 16);
        System.out.println(date);   // 2023-08-16

        System.out.println("\nadding days...");
        Period period = Period.ofDays(4);
        modifyDateTime(date, period);

        System.out.println("\nadding weeks...");
        Period period2 = Period.ofWeeks(4);
        modifyDateTime(date, period2);

        System.out.println("\nadding months...");
        Period period3 = Period.ofMonths(1);
        modifyDateTime(date, period3);

        System.out.println("\nadding years...");
        Period period4 = Period.ofYears(1);
        modifyDateTime(date, period4);
    }
}
