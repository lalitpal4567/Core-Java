package javaClasses.dateTime.LocalDateTime;

import java.time.LocalDateTime;

public class PlusDaysMethod {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.of(2023, 8, 15, 11, 22, 20, 400);
        System.out.println(dateTime);   // 2023-08-15T11:22:20.000000400

        dateTime = dateTime.plusDays(1);
        System.out.println(dateTime);   // 2023-08-16T11:22:20.000000400

        dateTime = dateTime.plusDays(20);
        System.out.println(dateTime);   // 2023-09-05T11:22:20.000000400
    }
}
