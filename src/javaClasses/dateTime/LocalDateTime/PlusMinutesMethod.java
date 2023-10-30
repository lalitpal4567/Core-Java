package javaClasses.dateTime.LocalDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class PlusMinutesMethod {
    public static void changeMinute(LocalDateTime dateTime){
        System.out.println(dateTime);   // 2023-08-15T11:59

        dateTime = dateTime.plusMinutes(10);
        System.out.println(dateTime);   // 2023-08-15T12:09

        dateTime = dateTime.plusMinutes(50);
        System.out.println(dateTime);   // 2023-08-15T12:59
    }

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2023, 8, 15);
        LocalTime time = LocalTime.of(11, 59);
//        LocalDateTime dateTime = LocalDateTime.of(date, 11, 58, 55);    // compilation error, no such constructor
        LocalDateTime dateTime = LocalDateTime.of(date, time);

        changeMinute(dateTime);
    }
}
