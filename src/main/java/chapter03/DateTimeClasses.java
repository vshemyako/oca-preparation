package chapter03;

import java.time.*;

/**
 * JDK1.8 introduced new classes for date and/or time manipulation which are on the OCA exam
 */
public class DateTimeClasses {

    public static void main(String[] args) {

        // Date/Time classes do not have public constructors to force you to use static methods
        // Creating Date objects
        System.out.println("Date objects:");
        LocalDate firstDate = LocalDate.of(2017, 1, 1);
        System.out.println(firstDate);
        LocalDate secondDate = LocalDate.of(2017, Month.APRIL, 1);
        System.out.println(secondDate);

        // Creating Time objects
        // hours and minutes
        System.out.println();
        System.out.println("Time objects:");
        LocalTime firstTime = LocalTime.of(20, 45);
        System.out.println(firstTime);
        // hours, minutes and seconds
        LocalTime secondTime = LocalTime.of(20, 45, 30);
        System.out.println(secondTime);
        // hours, minutes, seconds and nanos
        LocalTime thirdTime = LocalTime.of(20, 45, 30, 999_999_999);
        System.out.println(thirdTime);

        // Remember not to exceed valid boundaries
        System.out.println();
        System.out.println("Let's try to pass invalid values:");
        try {
            LocalTime forthTime = LocalTime.of(25, 30, 30);
        } catch (DateTimeException ex) {
            System.out.println(ex.getMessage());
        }

        // It's possible to create objects which contain both date and time
        System.out.println();
        System.out.println("Creating date-time objects:");
        LocalDateTime firstLocalDateTime = LocalDateTime.of(2017, 10, 16, 20, 55, 30);
        System.out.println(firstLocalDateTime);
        // There're lots of date-time method signatures which combine mandatory year-month-date and different time signatures
        LocalDateTime secondLocalDateTime = LocalDateTime.of(2017, Month.JULY, 16, 20, 55);
        System.out.println(secondLocalDateTime);
        LocalDateTime thirdLocalDateTime = LocalDateTime.of(2017, Month.JULY, 16, 20, 55, 30, 1000);
        System.out.println(thirdLocalDateTime);

        // And really cool part
        LocalDate date = LocalDate.of(2000, Month.JANUARY, 1);
        LocalTime time = LocalTime.of(0, 0);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        System.out.println();
        System.out.println(dateTime);

        // Create date-time objects representing current date-time
        LocalDate currentDate = LocalDate.now();
        System.out.println();
        System.out.println(currentDate);
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);
    }
}
