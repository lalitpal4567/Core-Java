package javaClasses.dateTime.ZonedDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;

// now() method returns the current date using the system clock and default time-zone, not null
// (1) public static ZonedDateTime now()

public class NowMethod {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        System.out.println(ZonedDateTime.now());
    }
}
