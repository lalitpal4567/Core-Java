package javaClasses.dateTime.LocalDateClass;

import java.time.LocalDate;
import java.time.Month;

/*
(1) public static LocalDate of(int year, int month, int dayOfMonth)
(2) public static LocalDate of(int year, Month month, int dayOfMonth)
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
        LocalDate date = LocalDate.of(2023, Month.JANUARY, 13);
        LocalDate date2 = LocalDate.of(2023, 1, 13);

        System.out.println(date);
        System.out.println(date2);
    }
}
