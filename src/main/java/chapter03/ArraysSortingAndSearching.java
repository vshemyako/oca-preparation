package chapter03;

/**
 * Edge cases while sorting and search elements of an array
 */
public class ArraysSortingAndSearching {

    public static void main(String[] args) {

        // Sorts numeric array as expected
        int[] numericArray = {10, 5, 20, 33, 50};
        java.util.Arrays.sort(numericArray);
        System.out.println(java.util.Arrays.toString(numericArray));

        // Sorting array of Strings may lead you astray due to ASCII table which defines position of each character
        System.out.println();
        String[] stringArray = {"10", "5", "20", "33", "50"};
        java.util.Arrays.sort(stringArray);
        System.out.println(java.util.Arrays.toString(stringArray));

        // Some examples of binarySearch() method
        System.out.println();
        byte[] severalNumbers = {10, 20, 30, 40, 50};
        // As expected output will be '0'
        System.out.println(java.util.Arrays.binarySearch(severalNumbers, (byte) 10));
        // Output '4'
        System.out.println(java.util.Arrays.binarySearch(severalNumbers, (byte) 50));
        // If binarySearch didn't find element if will lead to -> positionOfElement * (-1) -1
        // 15 would be placed at index '1' -> '1' * '-1' -1 = -2
        System.out.println(java.util.Arrays.binarySearch(severalNumbers, (byte) 15));

        // If array is not sorted binarySearch will lead to unpredictable results
        short[] unsortedArray = {13, 10, 22, 1};
        System.out.println();
        System.out.println(java.util.Arrays.binarySearch(unsortedArray, (short) 10));
        System.out.println(java.util.Arrays.binarySearch(unsortedArray, (short) 13));
    }
}
