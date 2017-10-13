package chapter02;

import static chapter02.SwitchStatement.Season.*;

/**
 * One have to remember that valid variable types for switch statement are:
 * - char
 * - byte
 * - short
 * - int
 * - enum
 * - final String values
 * - corresponding primitive wrappers
 * <p>
 * Simple tests to assure that information was learnt
 */
public class SwitchStatement {

    public enum Season {
        SUMMER, AUTUMN, WINTER, SPRING;
    }

    public static void detectSeason(Season season) {
        switch (season) {
            case SUMMER:
                System.out.println(SUMMER);
                break;
            case AUTUMN:
                System.out.println(AUTUMN);
                break;
            case WINTER:
                System.out.println(WINTER);
                break;
            case SPRING:
                System.out.println(SPRING);
                break;
        }
    }

    public static void detectNumber(int time) {
        switch (time) {
            case 8:
                System.out.println("Good morning");
                break;
            case 20:
                System.out.println("Good evening");
                break;
            default:
                System.out.println("Unknown time");
                break;
        }
    }

    // Pay attention to String values which are not constants!
    public static void detectName(String name, final String familyName) {
        final String john = "John";
        final String ron = "Ron";
        final String may;
        may = "May";

        switch (name) {
            case john:
                System.out.println(john);
                break;
            case ron:
                System.out.println(ron);
                break;

            // Only constant expressions are allowed to be used in 'case' statements;
            /*
            case may:
                System.out.println(may);
                break;
            */

            // Method parameter is not a constant
            /*
            case familyName:
                System.out.println(familyName);
                break;
            */
        }
    }

    public static void main(String[] args) {
        // null value will lead to NullPointerException
        /*
        detectSeason(null);
        */
        detectSeason(SUMMER);
    }
}
