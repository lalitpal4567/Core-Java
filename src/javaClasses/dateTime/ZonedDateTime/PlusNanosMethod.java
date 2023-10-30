package javaClasses.dateTime.ZonedDateTime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class PlusNanosMethod {
    public static void changeNanos(ZonedDateTime zone){
        System.out.println(zone);   // 2023-08-15T02:07:15.000999999-04:00[US/Eastern]

        zone = zone.plusNanos(1000);
        System.out.println(zone);   // 2023-08-15T02:07:15.001000999-04:00[US/Eastern]

        zone = zone.plusNanos(999999999);
        System.out.println(zone);   // 2023-08-15T02:07:16.001000998-04:00[US/Eastern]
    }
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.of(2023, 8, 15, 2, 7, 15, 999999);
        ZonedDateTime zone = ZonedDateTime.of(dateTime, ZoneId.of("US/Eastern"));

        changeNanos(zone);
    }
}
