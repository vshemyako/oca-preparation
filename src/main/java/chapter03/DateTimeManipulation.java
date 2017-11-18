package chapter03;

import java.time.*;

/**
 * One of the reasons why 'Oracle' introduced new Date/Time library - these objects manipulation become much easier
 */
public class DateTimeManipulation {

    public static void main(String[] args) {

        // While manipulation date/time objects remember: these objects are immutable therefore you have to assign newly
        // created objects to a variable
        LocalDate firstDate = LocalDate.of(2017, Month.JULY, 20);
        System.out.println(firstDate);
        firstDate = firstDate.plusYears(10);
        System.out.println(firstDate);
        firstDate = firstDate.plusMonths(5);
        System.out.println(firstDate);
        firstDate = firstDate.plusWeeks(10);
        System.out.println(firstDate);
        firstDate = firstDate.plusDays(100);
        System.out.println(firstDate);

        LocalTime firstTime = LocalTime.of(0, 0);
        System.out.println(firstTime);
        firstTime = firstTime.plusHours(10);
        System.out.println(firstTime);
        firstTime = firstTime.plusMinutes(20).plusSeconds(1_000_000).plusNanos(100);
        System.out.println(firstTime);

        // Both of these objects have the same 'minus' methods
        LocalDateTime firstLocalDateTime = LocalDateTime.of(2001, 9, 11, 11, 11, 11, 1111);
        firstLocalDateTime = firstLocalDateTime
                .minusYears(10)
                .minusMonths(10)
                .minusWeeks(10)
                .minusDays(10)
                .minusHours(10)
                .minusMinutes(10)
                .minusSeconds(10)
                .minusNanos(1000);
        System.out.println(firstLocalDateTime);

        // Sometimes its much easier to specify date/time chunks with Period and Duration classes:
        Period yearPeriod = Period.ofYears(1);
        Period monthPeriod = Period.ofMonths(2);
        Period weeksPeriod = Period.ofWeeks(4);
        Period daysPeriod = Period.ofDays(8);

        Duration daysDuration = Duration.ofDays(365);
        Duration hoursDuration = Duration.ofHours(24);
        Duration minutesDuration = Duration.ofMinutes(60);
        Duration nanosDuration = Duration.ofNanos(1_000_000_000);

        firstDate.plus(yearPeriod);
        firstDate.plus(monthPeriod);

        // Do not change period/duration methods - no chain is supported actually
        System.out.println();
        Period specialPeriod = Period.ofYears(10).ofMonths(20);
        // Period of 20 months
        System.out.println(specialPeriod);
    }
}
