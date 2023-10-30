package javaClasses.dateTime.LocalDateTime;

import java.time.LocalDateTime;

public class PlusNanosMethod {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.of(2023, 8, 15, 12, 7, 30, 400);
        System.out.println(dateTime);   // 2023-08-15T12:07:30.000000400

        dateTime = dateTime.plusNanos(100);
        System.out.println(dateTime);   // 2023-08-15T12:07:30.000000500

        dateTime = dateTime.plusNanos(1000);
        System.out.println(dateTime);   // 2023-08-15T12:07:30.000001500

        dateTime = dateTime.plusNanos(10000);
        System.out.println(dateTime);   // 2023-08-15T12:07:30.000011500
    }
}
