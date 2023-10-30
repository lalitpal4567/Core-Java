package javaClasses.dateTime.LocalTimeClass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

// Of method returns LocalTime object.
// (1) public static LocalTime of(int hour, int minute)
// (2) public static LocalTime of(int hour, int minute, int second)
// (3) public static LocalTime of(int hour, int minute, int second, int nanoOfSecond)

/*
(from = -999999999, to = 999999999)  int year,
    @Range(from = 1, to = 12)  int month,
    @Range(from = 1, to = 31)  int dayOfMonth,
    @Range(from = 0, to = 23)  int hour,
    @Range(from = 0, to = 59)  int minute
    @Range(from = 0, to = 59)  int second,
    @Range(from = 0, to = 999999999)  int nanoOfSecond
 */

public class OfMethod {
    public static void displayDateTime(LocalDate date, LocalTime time){
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        LocalDateTime dateTime2 = LocalDateTime.of(2023, 8, 13, 2, 44, 50);
        System.out.println(dateTime);
        System.out.println(dateTime2);
    }

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2023, 8, 13);
        LocalTime time = LocalTime.of(2, 44, 55);

        displayDateTime(date, time);
    }
}
