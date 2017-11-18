package chapter03;

/**
 * The ways of creating multidimensional arrays are not always straightforward
 */
public class MultidimensionalArrays {

    public static void main(String[] args) {

        // Truly multidimensional nature
        int[][][] threeDArray = new int[10][20][5];

        // It's possible to specify each array dimensions later on
        int[][] twoDArray = new int[4][];
        twoDArray[0] = new int[5];
        twoDArray[1] = new int[6];
        twoDArray[2] = new int[7];
        twoDArray[3] = new int[8];

        // As expected we have bunch of arrays within array
        for(int[] array : twoDArray) {
            for(int number : array) {
                System.out.print(number + " ");
            }
            System.out.println();
        }

        // Let's try to delve into a three dimensional array
        // Here we specify only the lenght of the first array
        int[][][] anotherThreeDArray = new int[3][][];
        // It gets very tricky
        anotherThreeDArray[0] = new int[4][5];
        anotherThreeDArray[1] = new int[2][1];
        anotherThreeDArray[2] = new int[1][5];
    }
}
