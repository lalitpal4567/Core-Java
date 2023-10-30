package javaClasses.dateTime.ZonedDateTime;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class PlusMinutesMethod {
    public static void main(String[] args) {
        ZoneId id = ZoneId.of("US/Eastern");
        LocalDateTime dateTime = LocalDateTime.of(2023, Month.AUGUST, 16, 1, 17, 25, 99999);
        ZonedDateTime zone = ZonedDateTime.of(dateTime, id);

        System.out.println(zone);   // 2023-08-16T01:17:25.000099999-04:00[US/Eastern]

        zone = zone.plusMinutes(3);
        System.out.println(zone);   // 2023-08-16T01:20:25.000099999-04:00[US/Eastern]

        zone = zone.plusMinutes(30);
        System.out.println(zone);   // 2023-08-16T01:50:25.000099999-04:00[US/Eastern]
    }
}
