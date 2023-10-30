package javaClasses.dateTime.LocalDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class PlusHoursMethod {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2023, 8, 15);
        LocalTime time = LocalTime.of(11, 52, 10);
        LocalDateTime dateTime = LocalDateTime.of(date, time);

        System.out.println(dateTime);   // 2023-08-15T11:52:10

        dateTime = dateTime.plusHours(5);
        System.out.println(dateTime);   // 2023-08-15T16:52:10

        dateTime = dateTime.plusHours(24);
        System.out.println(dateTime);   // 2023-08-16T16:52:10
    }
}
