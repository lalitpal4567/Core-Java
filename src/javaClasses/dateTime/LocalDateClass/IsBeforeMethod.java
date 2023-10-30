package javaClasses.dateTime.LocalDateClass;

import java.time.LocalDate;

public class IsBeforeMethod {
    // We can't reuse this method
    public static void toyExchange(LocalDate start, LocalDate end){
        LocalDate upTo = start;

        while(upTo.isBefore(end)){
            System.out.println("give new toy: " + upTo);
            upTo = upTo.plusMonths(1);
        }
    }

    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2023, 1, 1);
        LocalDate end = LocalDate.of(2023, 3, 30);

        boolean status =  start.isBefore(end);
        boolean status2 = end.isBefore(start);
        System.out.println(status);     // true
        System.out.println(status2);    // false

        toyExchange(start, end);


    }
}
