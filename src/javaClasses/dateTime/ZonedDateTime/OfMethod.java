package javaClasses.dateTime.ZonedDateTime;

import java.time.*;

//
// (1) public static ZonedDateTime of(int year, int month, int dayOfMonth, int hour, int minute, int second, int nanoOfSecond, ZoneId zone)
// (2) public static ZonedDateTime of(LocalDate date, LocalTime time, ZoneId zone)
// (3) public static ZonedDateTime of(LocalDateTime localDateTime, ZoneId zone)

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
        ZoneId id = ZoneId.of("US/Eastern");
        ZonedDateTime zone = ZonedDateTime.of(2023, 8, 14, 11, 51, 25, 300, id);
//        ZonedDateTime zone2 = ZonedDateTime.of(2023, Month.AUGUST, 14, 11, 51, 25, 300, id);    // compilation error

        LocalDate date = LocalDate.of(2023, 8, 14);
        LocalTime time = LocalTime.of(11, 58);

        System.out.println(zone);
        System.out.println(ZonedDateTime.of(date, time, ZoneId.of("US/Eastern")));
    }
}
