package Phase3_Java8_Features;

import java.time.*;

public class Date_Time_API_Example {
    public static void main(String[] args){
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(2003, 12, 11);
        System.out.println("Today Date is: " + today);
        System.out.println("Birthday date is: " + birthday);

        LocalTime time = LocalTime.now();
        System.out.println("Current Time is: " + time);


        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current Date and Time : " + now);

        LocalDate startDate = LocalDate.of(2022, 6, 27);
        LocalDate endDate = LocalDate.now();

        Period p = Period.between(startDate, endDate);
        System.out.println( "Working Period: " + p.getYears() + " years, " + p.getMonths() + " month");

        LocalTime start = LocalTime.of(10, 0);
        LocalTime end = LocalTime.of(12, 30);

        Duration d = Duration.between(start, end);
        System.out.println("Duration in minutes: " + d.toMinutes());
    }
}
