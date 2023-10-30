package javaClasses.dateTime.LocalDateClass;

import java.time.LocalDate;
import java.time.Period;

public class IsBeforeMethod2 {
    // We can't reuse this method
    public static void toyExchange(LocalDate start, LocalDate end, Period period){
        LocalDate upTo = start;

        while(upTo.isBefore(end)){
            System.out.println("give new toy: " + upTo);
            upTo = upTo.plus(period);
        }
    }

    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2023, 1, 1);
        LocalDate end = LocalDate.of(2023, 3, 30);

        Period period = Period.ofMonths(1);
        toyExchange(start, end, period);
    }
}

