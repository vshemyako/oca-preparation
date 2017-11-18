package enthuware;

/**
 * Edge cases with primitive types comparison
 */
public class WrapperComparison {

    public static void main(String[] args) {

        Integer int1 = 1;
        Integer int2 = new Integer(1);
        System.out.println(int1 == int2);
        System.out.println(int1.equals(int2));

        Byte byte1 = 1;
        System.out.println(byte1.equals(int1));
        // Comparing object with double equal sign which do not have inheritance connection leads to compile time error
        /*
        System.out.println(byte1 == int1);
        */

        Byte byteWrapper = 10;
        byteWrapper.byteValue();
        byteWrapper.shortValue();
        byteWrapper.intValue();
        byteWrapper.longValue();
        byteWrapper.shortValue();
        byteWrapper.doubleValue();

        Short shortWrapper = 10;
        shortWrapper.byteValue();
        shortWrapper.shortValue();
        shortWrapper.intValue();
        shortWrapper.longValue();
        shortWrapper.shortValue();
        shortWrapper.doubleValue();

        Integer intWrapper = 10;
        intWrapper.byteValue();
        intWrapper.shortValue();
        intWrapper.intValue();
        intWrapper.longValue();
        intWrapper.floatValue();
        intWrapper.doubleValue();

        //direct assignment cannot be done because promotion is done only once
//        Long longWrapper = 10;
//        Float floatWrapper = 10;
//        Double doubleWrapper = 20;

        Long longWrapper = 10L;
        Float floatWrapper = 10F;
        Double doubleWrapper = 20D;

        Character charWrapper = 10;
    }
}
