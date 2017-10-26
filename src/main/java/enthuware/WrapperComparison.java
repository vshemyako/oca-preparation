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
    }
}
