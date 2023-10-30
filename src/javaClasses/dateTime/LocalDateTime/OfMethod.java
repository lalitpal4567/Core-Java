package javaClasses.dateTime.LocalDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

/*
Of method returns the LocalDateTime object.
(1) public static LocalDateTime of(int year, int month, int dayOfMonth, int hour, int minute)
(2) public static LocalDateTime of(int year, int month, int dayOfMonth, int hour, int minute, int second)
(3) public static LocalDateTime of(int year, int month, int dayOfMonth, int hour, int minute, int second, int nanoOfSecond)

(4) public static LocalDateTime of(int year, Month month, int dayOfMonth, int hour, int minute)
(5) public static LocalDateTime of(int year, Month month, int dayOfMonth, int hour, int minute, int second)
(6) public static LocalDateTime of(int year, Month month, int dayOfMonth, int hour, int minute, int second, int nanoOfSecond)

(7) public static LocalDateTime of(LocalDate date, LocalTime time)
 */

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
    public static void main(String[] args) {
        System.out.println(LocalDateTime.of(2023, 8, 14, 11, 25));
        System.out.println(LocalDateTime.of(2023, 8, 14, 11, 26, 35));
        System.out.println(LocalDateTime.of(2023, 8, 14, 11, 27, 2, 100) + "\n");

        ////////////////////////////////////////////////////////////////

        LocalDateTime dateTime = LocalDateTime.of(2023, Month.AUGUST, 14, 11, 28);
        LocalDateTime dateTime2 = LocalDateTime.of(2023, Month.AUGUST, 14, 11, 26, 15);
        LocalDateTime dateTime3 = LocalDateTime.of(2023, Month.AUGUST, 14, 11, 29, 59, 450);

        System.out.println(dateTime);
        System.out.println(dateTime2);
        System.out.println(dateTime3 + "\n");

        ////////////////////////////////////////////////////////////////
        LocalDate date = LocalDate.of(2023, Month.AUGUST, 14);
        LocalTime time = LocalTime.of(11, 31);

        System.out.println(LocalDateTime.of(date, time));
    }
}
