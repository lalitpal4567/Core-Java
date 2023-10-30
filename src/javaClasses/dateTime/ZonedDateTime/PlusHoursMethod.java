package javaClasses.dateTime.ZonedDateTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class PlusHoursMethod {
    public static void main(String[] args) {
        ZonedDateTime zone = ZonedDateTime.of(2023, 8, 16, 1, 11, 20, 9999, ZoneId.of("Asia/Kolkata"));
//        ZonedDateTime zone = ZonedDateTime.of(2023, 8, Month.AUGUST, 1, 11, 20, 9999, ZoneId.of("Asia/Ghaziabad"));   // compilation error

        System.out.println(zone);   // 2023-08-16T01:11:20.000009999+05:30[Asia/Kolkata]

        zone = zone.plusHours(1);
        System.out.println(zone);   // 2023-08-16T02:11:20.000009999+05:30[Asia/Kolkata]

        zone = zone.plusHours(24);
        System.out.println(zone);   // 2023-08-17T02:11:20.000009999+05:30[Asia/Kolkata]
    }
}
