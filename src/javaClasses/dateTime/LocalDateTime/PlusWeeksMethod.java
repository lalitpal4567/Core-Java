package javaClasses.dateTime.LocalDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class PlusWeeksMethod {
    public static void changeWeek(LocalDateTime dateTime){
        System.out.println(dateTime);   // 2023-08-15T12:13:11

        dateTime = dateTime.plusWeeks(1);
        System.out.println(dateTime);   // 2023-08-22T12:13:11

        dateTime = dateTime.plusWeeks(4);
        System.out.println(dateTime);   // 2023-09-19T12:13:11
    }

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2023, 8, 15);
        LocalTime time = LocalTime.of(12, 13, 11);
        LocalDateTime dateTime = LocalDateTime.of(date, time);

        changeWeek(dateTime);
    }
}
