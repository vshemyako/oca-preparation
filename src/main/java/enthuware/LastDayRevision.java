package enthuware;

import java.util.ArrayList;
import java.util.List;

/**
 * Last day revision of all of the topics
 */
public class LastDayRevision {

    public static void main(String[] args) {

        //implicit narrowing once again ladies and gentlemen
        byte byteValue = 127;
        short shortValue = 127;
        int intValue = 127;
        char charValue = 127;

        //implicit extending
        shortValue = byteValue;
        intValue = byteValue;

        //char value cannot be assigned to short or byte directly
//        byteValue = charValue;
//        shortValue = charValue;

        //constant char actually can, but only if physically fits into this variable
        final char charConstant = 127;
        byteValue = charConstant;
        shortValue = charConstant;

        //float is only eight significant digits precise
        int nineDigits = 123456789;
        int eightDigits = 12345678;
        System.out.println((int) (float) nineDigits);
        System.out.println((int) (float) eightDigits);

        //double is 17 significant digits precise
        long nineDigitsX2 = 12345678912345678L;
        System.out.println((long) (double) nineDigitsX2);
        System.out.println((long) (double) eightDigits);

//        new ArrayList<>().subList(0, 10);

        int[] array = null;
//        int number = array[(char) 10];

        float x = 0b10000;
        System.out.println("x " + x);
    }
}

interface House {
    public default String getAddress() {
        return "101 Main Str";
    }
}

interface Bungalow extends House {
    public default String getAddress() {
        return "101 Smart Str";
    }
}

class MyHouse implements Bungalow, House {
}

class TestClass {
    public static void main(String[] args) {
        House ci = new MyHouse();  //1
        System.out.println(ci.getAddress()); //2
    }
}
