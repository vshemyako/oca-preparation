package enthuware;

/**
 * Tests come precision loss between int and float
 */
public class PrecisionLoss {

    public static void main(String[] args) {

        int bigNumber = 12345678;
        float bigFloat = bigNumber;
        int floatToInt = (int) bigFloat;
        System.out.println(bigFloat);
        System.out.println(floatToInt);
    }
}
