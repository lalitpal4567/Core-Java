package javaClasses.dateTime.periodClass;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class PeriodDemo {
    public static void toyExchange(LocalDate start, LocalDate end, Period period){
        LocalDate upTo = start;

        while(upTo.isBefore(end)){
            System.out.println("give new toy: " + upTo);
            upTo = upTo.plus(period);
        }
    }

    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2023, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2024, 1, 1);

        System.out.println("Days");
        Period period2 = Period.ofDays(60);
        toyExchange(start, end, period2);

        System.out.println("\nWeeks");
        Period period3 = Period.ofWeeks(2);
        toyExchange(start, end, period3);

        System.out.println("\nMonths");
        Period period = Period.ofMonths(2);
        toyExchange(start, end, period);

        System.out.println("\nYears");
        Period period4 = Period.ofYears(1);
        toyExchange(start, end, period4);
    }
}

