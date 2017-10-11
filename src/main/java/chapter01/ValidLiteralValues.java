package chapter01;

/**
 * Test possibility of difference radix usage
 */
public class ValidLiteralValues {

    public static void main(String[] args) {

        // Octal - leading 'zero' -> '0'
        // Dont forget that max digit in octal system is 7
        int octalNumber = 017;  // 1 * 8 + 7 * 1 = 15;
        int anotherOctalNumber = 020;   // 2 * 8 + 0 * 1 = 16;
        System.out.println("Octal number: " + octalNumber);
        System.out.println("Another octal number: " + anotherOctalNumber);

        // Hexadecimal - leading '0x' or '0X'
        int hexNumber = 0x10;   // 1 * 16 + 0 * 16 = 16;
        int anotherHexNumber = 0XFF;    // 15 * 16 + 15 * 1 = 255;
        System.out.println("Hex number: " + hexNumber);
        System.out.println("Another hex number: " + anotherHexNumber);

        // Binary - leading '0b' or '0B'
        int binaryNumber = 0b101;   // 1 * 4 + 0 * 2 + 1 * 1 = 5;
        int anotherBinaryNumber = 0B1001;   // 1 * 8 + 0 * 4 + 0 * 2 + 1 * 1 = 9;
        System.out.println("Binary number: " + binaryNumber);
        System.out.println("Another binary number: " + anotherBinaryNumber);

        // Underscores were added in JDK 7 - valid only between 2 digits
        int numberWithUnderscores = 1_000_000;
        System.out.println("Number with underscores: " + numberWithUnderscores);

        // Valid even with different radix
        int anotherNumberWithUnderscores = 0B1_0_0_1;
        System.out.println("Another number with underscores: " + anotherNumberWithUnderscores);
    }
}
