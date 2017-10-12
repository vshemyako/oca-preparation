package chapter02;

/**
 * Some cast examples
 */
public class CastingPrimitiveTypes {

    public static void main(String[] args) {

        short firstNumber = (short) 1921222;
        System.out.println("firstNumber is: " + firstNumber);

        // Without trailing L will not compile!
        long longNumber = 3_333_333_333L;

        byte firstByte = 10;
        byte secondByte = 20;
        // Without explicit cast will not compile!
        byte result = (byte) (firstByte + secondByte);
    }
}
