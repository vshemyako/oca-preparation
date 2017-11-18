package chapter02;

/**
 * Ternary operator behaves similar to short-circuit operators. Testing some edge cases here
 */
public class TernaryOperator {

    public static void main(String[] args) {

        int firstNumber = 10;
        int secondNumber = 20;

        // firstNumber will not be incremented because of short-circuit nature of ternary operator
        int thirdNumber = firstNumber > secondNumber ? firstNumber++ : secondNumber++;
        System.out.println("first number: " + firstNumber);
        System.out.println("second number: " + secondNumber);
        System.out.println("third number: " + thirdNumber);

        // this time secondNumber won't be changed
        thirdNumber = firstNumber < secondNumber ? --firstNumber : --secondNumber;
        System.out.println();
        System.out.println("first number: " + firstNumber);
        System.out.println("second number: " + secondNumber);
        System.out.println("third number: " + thirdNumber);
    }
}
