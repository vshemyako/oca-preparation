package chapter02;

/**
 * Only modulus is really tricky i suppose
 */
public class BinaryOperators {

    public static void main(String[] args) {

        System.out.println("Plain division:");
        for (double number = 0; number >= -6; number -= 0.5) {
            System.out.println(number % 3);
        }
    }
}
