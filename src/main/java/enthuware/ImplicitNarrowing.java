package enthuware;

/**
 * Taking enthuware tests i've came across interesting theme which is called 'implicit narrowing'.
 * 'Implicit narrowing' only occurs for byte, char, short, int
 */
public class ImplicitNarrowing {

    public static void main(String[] args) {

        byte byteMinValue = Byte.MIN_VALUE;
        byte byteMaxValue = Byte.MAX_VALUE;
        System.out.println("Byte minimum value is: " + byteMinValue);
        System.out.println("Byte maximum value is: " + byteMaxValue);

        // Let's test so called 'implicit narrowing'
        byte byteMinFitValue = -128;
        byte byteMaxFitValue = 127;

        // If a value doesn't fit - explicit cast is needed
        byte byteNotFitValue = (byte) -129;
        System.out.println("-129 downcasted to byte: " + byteNotFitValue);

        byte byteNotFitAnotherValue = (byte) 128;
        System.out.println("128 downcasted to byte: " + byteNotFitAnotherValue);

        short shortMinValue = Short.MIN_VALUE;
        short shortMaxValue = Short.MAX_VALUE;
        System.out.println("Short minimum value is: " + shortMinValue);
        System.out.println("Short maximum value is: " + shortMaxValue);

        short shortMinFitValue = -32768;
        short shortMaxFitValue = 32767;

        short shortNotFitValue = (short) -32769;
        short shortNotFitAnotherValue = (short) 32768;
        System.out.println("-32769 downcasted to short: " + shortNotFitValue);
        System.out.println("32768 downcasted to short: " + shortNotFitAnotherValue);

        // Something interesting happens with chars
        char minCharValue = Character.MIN_VALUE;
        char maxCharValue = Character.MAX_VALUE;
        System.out.println("Min char value: " + (int) minCharValue);
        System.out.println("Max char value: " + (int) maxCharValue);

        char minAssignValue = 0;
        char maxAssignValue = 65535;
        char moreThanMaxValue = (char) 65536;
        // We have to cast to int to see the number
        System.out.println((int) moreThanMaxValue);

        // Something crazy going on here
        byte byteSmallValue = 10;
        short shortSmallValue = 20;
        int intSmallValue = 30;

        // It's isnt possible because you cannot assign anything to a char
        char assignByteSmallValue = (char) byteSmallValue;
        System.out.println((int) assignByteSmallValue);
        char assignShortSmallValue = (char) shortSmallValue;
        System.out.println((int) assignShortSmallValue);
        char assignIntSmallValue = (char) intSmallValue;
        System.out.println((int) assignIntSmallValue);

        // Things are getting interesting here
        final byte byteSmallValueConstant = 10;
        final short shortSmallValueConstant = 20;
        final int intSmallValueConstant = 30;

        // NO EXPLICIT CAST NEEDED!!!
        char assignByteSmallValueConstant = byteSmallValueConstant;
        char assignShortSmallValueConstant = shortSmallValueConstant;
        char assignIntSmallValueConstant = intSmallValueConstant;

        // But its not possible to do with long, float, double
        final long longConstant = 10L;
        final float floatConstant = 10f;
        final double doubleConstant = 10.0;

        char assignLongConstant = (char) longConstant;
        System.out.println((int) assignLongConstant);
        char assignFloatConstant = (char) floatConstant;
        System.out.println((int) assignFloatConstant);
        char assignDoubleConstant = (char) doubleConstant;
        System.out.println((int) assignDoubleConstant);

        // Let's try to exceed valid boundaries
        final int excceedMinBoundary = -1;
        final int exceedMaxBoundary = 65536;

        // It's not possible
        /*
        char assignIntMinBoundary = excceedMinBoundary;
        char assignIntMaxBoundary = exceedMaxBoundary;
        */

        // Pay special attention to these narrowing tricks
        final byte finalByte = 10;
        final short finalShort = 20;
        char shortOrByteFinalOnly = finalByte;
        shortOrByteFinalOnly = finalShort;

        final char finalChar = 100;
        byte charToByte = finalChar;
        short charToShort = finalChar;
        int charToInt = finalChar;
    }
}
