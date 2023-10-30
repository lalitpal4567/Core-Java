package javaClasses.dateTime.LocalTimeClass;

import java.time.LocalTime;

public class PlusSecondsMethod {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(1, 48, 4);
        System.out.println(time);   // 01:48:04

        time = time.plusSeconds(54);
        System.out.println(time);   // 01:48:58

        time = time.plusSeconds(10);
        System.out.println(time);   // 01:49:08
    }
}
