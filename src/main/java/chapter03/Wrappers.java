package chapter03;

import java.util.ArrayList;

/**
 * There are some differences between primitive type initialization and corresponding wrapper objects
 */
public class Wrappers {

    public static void main(String[] args) {

        boolean booleanValue = true;

        char charValue = 'a';

        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 30;
        long longValue = 40;

        // Pay attention! Don't forget to put 'f' character at the end of a float number
        float floatValue = 1.0f;
        double doubleValue = 1.0;

        Boolean booleanWrapper = new Boolean(true);

        Character characterWrapper = new Character('a');

        // Where the cool things begin
        // Note how this differs from primitive type initialization
        // Explicit cast is requried
        Byte byteWrapper = new Byte((byte) 10);
        Short shortWrapper = new Short((short) 10);
        Integer integerWrapper = new Integer(10);

        // Thanks God numeric literals are treated as integers, so we have to add 'L' if we exceed valid boundaries
        Long longWrapper = new Long(3_000_000_000L);

        // Again pay attention that this time 'f' isn't required
        Float floatWrapper = new Float(1.0);
        Double doubleWrapper = new Double(1.0);

        // Edge cases with boxing/unboxing
        Integer integerObject = null;
        try {
            int unboxedInt = integerObject;
        } catch(NullPointerException ex) {
            System.out.println("Be careful about unboxing null values");
        }

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        // Will remove element at index '1' not element with value '1'
        list.remove(1);
        System.out.println(list);
    }
}
