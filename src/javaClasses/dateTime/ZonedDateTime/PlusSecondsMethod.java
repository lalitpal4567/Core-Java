package javaClasses.dateTime.ZonedDateTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class PlusSecondsMethod {
    public static void main(ZonedDateTime zone){
        System.out.println(zone);
    }

    public static void main(String[] args) {
        ZoneId id = ZoneId.of("Asia/Kolkata");
        ZonedDateTime zone = ZonedDateTime.of(2023, 8, 16, 1, 36, 40,1000, id);
        System.out.println(zone);
    }
}
