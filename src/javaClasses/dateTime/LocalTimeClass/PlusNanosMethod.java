package javaClasses.dateTime.LocalTimeClass;

import java.time.LocalTime;

public class PlusNanosMethod {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(1, 43, 17, 5000);
        System.out.println(time);   // 01:43:17.000005

        time = time.plusNanos(100);
        System.out.println(time);   // 01:43:17.000005100

        time = time.plusNanos(40000);
        System.out.println(time);   // 01:43:17.000045100

        time = time.plusNanos(999999999);
        System.out.println(time);   // 01:43:18.000045099
    }
}
