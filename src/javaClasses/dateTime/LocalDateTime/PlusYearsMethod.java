package javaClasses.dateTime.LocalDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class PlusYearsMethod {
    LocalDateTime dateTime;
    PlusYearsMethod(LocalDate date, LocalTime time){
        dateTime = LocalDateTime.of(date, time);
    }

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2023, 8, 15);
        LocalTime time = LocalTime.of(11, 39, 44, 120);
        PlusYearsMethod obj = new PlusYearsMethod(date, time);

        System.out.println(obj.dateTime);   // 2023-08-15T11:39:44.000000120

        obj.dateTime = obj.dateTime.plusYears(1);
        System.out.println(obj.dateTime);   // 2024-08-15T11:39:44.000000120

        obj.dateTime = obj.dateTime.plusYears(5);
        System.out.println(obj.dateTime);   // 2029-08-15T11:39:44.000000120
    }
}
