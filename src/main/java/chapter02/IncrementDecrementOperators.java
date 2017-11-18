package chapter02;

/**
 * Practice with prefix/postfix operators
 */
public class IncrementDecrementOperators {

    public static void main(String[] args) {

        // Example #1
        int firstNumber = 3;
        int secondNumber = ++firstNumber * 5 / firstNumber-- + --firstNumber; // 4(4) * 5 / 4(3) + 2(2) = 7;
        System.out.println("firstNumber is: " + firstNumber); // 2
        System.out.println("secondNumber is: " + secondNumber); // 7

        // Example #2
        int thirdNumber = 10;
        thirdNumber = ++thirdNumber; // 11(11)
        System.out.println("thirdNumber is: " + thirdNumber);

        // Example #3
        int forthNumber = 20;
        forthNumber = forthNumber++; // 20(21 is lost!)
        System.out.println("fourthNumber is: " + forthNumber);
    }
}
