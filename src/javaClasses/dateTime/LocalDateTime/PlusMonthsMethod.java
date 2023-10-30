package javaClasses.dateTime.LocalDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class PlusMonthsMethod {
    public static void changeDateTime(LocalDateTime dateTime){
        System.out.println(dateTime);   // 2023-08-15T11:27:44.000000120

        dateTime = dateTime.plusMonths(2);
        System.out.println(dateTime);   // 2023-10-15T11:27:44.000000120

        dateTime = dateTime.plusMonths(4);
        System.out.println(dateTime);   // 2024-02-15T11:27:44.000000120

    }

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2023, 8, 15);
        LocalTime time = LocalTime.of(11, 27, 44, 120);
        LocalDateTime dateTime = LocalDateTime.of(date, time);

        changeDateTime(dateTime);
    }
}
