package javaClasses.dateTime.LocalTimeClass;

import java.time.LocalTime;

public class PlusHoursMethod {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(13, 22, 20);
        System.out.println(time);   // 13:22:20

        time = time.plusHours(1);
        System.out.println(time);   // 14:22:20

        time = time.plusHours(10);
        System.out.println(time);   // 00:22:20

        time = time.plusHours(24);
        System.out.println(time);   // 00:22:20

        time = time.plusHours(5);
        System.out.println(time);   // 05:22:20
    }
}
