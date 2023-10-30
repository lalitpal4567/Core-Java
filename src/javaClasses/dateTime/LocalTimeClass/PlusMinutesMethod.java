package javaClasses.dateTime.LocalTimeClass;

import java.time.LocalTime;

public class PlusMinutesMethod {
    public static void changeTime(LocalTime time){
        System.out.println(time);   // 12:28:58

        time = time.plusMinutes(10);
        System.out.println(time);   // 12:38:58

        time = time.plusMinutes(30);
        System.out.println(time);   // 13:08:58
    }

    public static void main(String[] args) {
        LocalTime time = LocalTime.of(12, 28, 58);

        changeTime(time);
    }
}
