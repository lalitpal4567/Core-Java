package javaClasses.dateTime.ZonedDateTime;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class PlusMonthsMethod {
    public static void main(String[] args) {
        ZoneId id = ZoneId.of("Asia/Kolkata");
        LocalDateTime dateTime = LocalDateTime.of(2023, Month.AUGUST, 2, 16, 13, 55);
        ZonedDateTime zone = ZonedDateTime.of(dateTime, id);
        System.out.println(zone);   // 2023-08-02T16:13:55+05:30[Asia/Kolkata]

        zone = zone.plusMonths(10);
        System.out.println(zone);   // 2024-06-02T16:13:55+05:30[Asia/Kolkata]

        zone = zone.plusMonths(12);
        System.out.println(zone);   // 2025-06-02T16:13:55+05:30[Asia/Kolkata]
    }
}
