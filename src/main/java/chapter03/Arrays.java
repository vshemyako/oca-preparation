package chapter03;

/**
 * String and StringBuilder classes are internally just arrays of chars with some convenient methods.
 * In order to understand their internal workings it's important to understand arrays themselves.
 */
public class Arrays {

    final public int number = 10;

    public static void main(String[] args) {

        // Different ways of array initialization
        // All elements will default to int default value '0'
        int[] firstArray = new int[3];
        for (int number : firstArray) {
            System.out.print(number + " ");
        }

        // We can initialize each element with provided value
        // But this approach is redundant cuz java already knows type of array
        int[] secondArray = new int[]{1, 2, 3};

        // For this purposes anonymous arrays were introduced
        int[] anonymousArray = {1, 2, 3};

        System.out.println();
        System.out.println("Array comparison " + anonymousArray.equals(secondArray));

        // Another crazy syntax
        // Pay attention to the trailing comma ','
        int[] anotherAnonymousArray = {111, 222, 333,};

        // Things to remember:
        // Valid approach
        int[] thirdArray;
        thirdArray = new int[]{10, 20, 30};

        // Not valid approach
        // Will lead to compile time error - anonymous arrays are treated like constants
        /*
        int[] forthArray;
        forthArray = {11, 22, 33};
        */

        // Tricky initialization part:
        int[] fifthArray, sixthArray; // Both variable are of type int[]
        int seventhArray[], eighthArray; // Only seventhArray is actually an array! eighthArray is a plain int variable

        // valid, though contain space character
        int[] ninthArray;
        int[] tenthArray;
        int[] eleventhArray;

        // really crazy stuff
        int  []        twelfthArray                        [];

        // illegal syntax - to put [] before array type:
        /*
        []double doubleArray;
        */

        // very dangerous stuff!!!!
        int[][][] twoDarray = {{{1}, {2}}, {{3}, {4}}};
        Object[] oneDarray = twoDarray;

        do {
            System.out.println("Yo");
        } while (false);
    }
}
