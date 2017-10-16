package chapter03;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * There are lots of way to format date/time objects
 */
public class DateTimeFormatterExamples {

    public static void main(String[] args) {

        // Date/time objects without formatting
        LocalDate date = LocalDate.of(2016, Month.FEBRUARY, 26);
        System.out.println("Date: " + date);
        LocalTime time = LocalTime.of(14, 0, 0, 1000);
        System.out.println("Time: " + time);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        System.out.println("Date and time: " + dateTime);

        // Let's apply some formatting methods
        // Actually ISO standard is the default which local date and time classes use
        System.out.println();
        System.out.println(date.format(DateTimeFormatter.ISO_DATE));
        System.out.println(time.format(DateTimeFormatter.ISO_TIME));
        System.out.println(dateTime.format(DateTimeFormatter.ISO_DATE_TIME));

        // Let's use some predefined formatters
        // Long and Full formats are for date/time objects with time zones
        DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        DateTimeFormatter mediumDateTime = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);

        System.out.println();
        System.out.println("Short dateTime: " + dateTime.format(shortDateTime));
        System.out.println("Medium dateTime: " + dateTime.format(mediumDateTime));

        // It's possible to create your own formatters
        System.out.println();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd yyyy, hh:mm");
        System.out.println("Custom formatter: " + dateTime.format(formatter));
        // Remember you can format in both ways
        // The result is the same
        System.out.println("Custom formatter: " + formatter.format(dateTime));

        // Using formatter it's possible to parse date/time strings to create corresponding objects
        System.out.println();
        DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern("yyyy MM dd");
        LocalDate parsedDate = LocalDate.parse("2017 01 21", customFormatter);
        System.out.println("Parsed dateTime object: " + parsedDate);
    }
}
