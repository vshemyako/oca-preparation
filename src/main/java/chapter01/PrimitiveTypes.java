package chapter01;

/**
 * Primitive types examples
 */
public class PrimitiveTypes {

    public static void main(String[] args) {

        // Byte's values
        byte byteMinValue = Byte.MIN_VALUE;
        byte byteMaxValue = Byte.MAX_VALUE;
        byte byteMinValueMinusOne = (byte) (byteMinValue - 1);
        byte byteMaxValuePlusOne = (byte) (byteMaxValue + 1);
        System.out.println("Byte's min value: " + byteMinValue);
        System.out.println("Byte's max value: " + byteMaxValue);

        // As we see if we exceed boundaries total value just wraps around max/min value
        System.out.println("Byte's min value minus one: " + byteMinValueMinusOne);
        System.out.println("Byte's max value plus one: " + byteMaxValuePlusOne);

        byte byteRandomValue = (byte) 200; // 128 = -128 => 200 - 128 - 128 = -56
        System.out.println("Byte's random value: " + byteRandomValue);

        short shortValue = 200;
        int intValue = 3000;

        // Actually it's int which is promoted to long
        long longValue = 4000;

        // Without trailing 'L' this line won'n compile: int max value boundary exceeded
        long anotherLongValue = 2_200_000_000L;

        boolean trueValue = true;
        boolean falseValue = false;

        // If you want to use float - don't forget to use 'f' at the end
        float floatValue = 1.0f;
        double doubleValue = 1.0;
        System.out.println("Float value: " + floatValue);
        System.out.println("Double value: " + doubleValue);

        char randomChar = 'a';

        // It's possible to denote character with a number
        char anotherRandomChar = 97;
        System.out.println("Random char: " + randomChar);
        System.out.println("Another random char: " + anotherRandomChar);
    }
}
