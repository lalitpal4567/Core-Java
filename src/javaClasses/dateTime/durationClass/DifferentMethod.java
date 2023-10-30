package javaClasses.dateTime.durationClass;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class DifferentMethod {
    public static void main(String[] args) {
        System.out.println(Duration.ofDays(2));
        System.out.println(Duration.ofHours(3));
        System.out.println(Duration.ofMillis(100));
        System.out.println(Duration.ofNanos(5000));
        System.out.println(Duration.ofMinutes(40));
        System.out.println(Duration.ofSeconds(56));
        System.out.println(Duration.ofSeconds(30, 1000));

        System.out.println(Duration.of(1, ChronoUnit.DAYS));
        System.out.println(Duration.of(3, ChronoUnit.HOURS));
    }
}
