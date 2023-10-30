package javaClasses.dateTime.ZonedDateTime;

import java.time.*;

public class PlusDaysOfMonthMethod {
    public static void main(String[] args) {
        ZoneId id = ZoneId.of("Asia/Kolkata");
        LocalDate date = LocalDate.of(2023, 8, 16);
        LocalTime time = LocalTime.of(1, 4, 33, 80000);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        ZonedDateTime zone = ZonedDateTime.of(dateTime, id);

        System.out.println(zone);   // 2023-08-16T01:04:33.000080+05:30[Asia/Kolkata]

        zone = zone.plusDays(10);
        System.out.println(zone);   // 2023-08-26T01:04:33.000080+05:30[Asia/Kolkata]

        zone = zone.plusDays(10);
        System.out.println(zone);   // 2023-09-05T01:04:33.000080+05:30[Asia/Kolkata]
    }
}
