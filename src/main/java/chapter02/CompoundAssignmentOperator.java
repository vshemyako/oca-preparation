package chapter02;

import java.util.Objects;

/**
 * Some tricky things with compound assignment operator
 */
public class CompoundAssignmentOperator {

    public static void main(String[] args) {

        // Don't forget to initialize variable
        int firstNumber;
        int secondNumber = 10;
        // Will not compile!
        /*
        firstNumber += secondNumber;
        */

        // Auto cast to lower type!
        int thirdNumber = 20;
        long forthNumber = 2;
        // Will compile! though 'forthNumber' is of a broader type
        thirdNumber += forthNumber;
        System.out.println("thirdNumber is: " + thirdNumber);

        // Assignment operator is an expression of itself
        int anotherNumber = 5;
        int oneMoreNumber = 10;
        oneMoreNumber = anotherNumber = 3;
        System.out.println("anotherNumber: " + anotherNumber);
        System.out.println("oneMoreNumber: " + oneMoreNumber);
    }
}
