package javaClasses.dateTime.LocalDateTime;

import java.time.LocalDateTime;

public class PlusSecondsMethod {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.of(2023, 8, 15, 12, 2, 23);
        System.out.println(dateTime);   // 2023-08-15T12:02:23

        dateTime = dateTime.plusSeconds(20);
        System.out.println(dateTime);   // 2023-08-15T12:02:43

        dateTime = dateTime.plusSeconds(50);
        System.out.println(dateTime);   // 2023-08-15T12:03:33
    }
}
