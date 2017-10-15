package chapter03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * It's not straightforward how array is converted into ArrayList and vice versa
 */
public class ArrayToArrayListConversion {

    public static void main(String[] args) {

        ArrayList<String> strings = new ArrayList<>();
        strings.add("One");
        strings.add("Two");
        strings.add("Three");
        strings.add("Four");
        strings.add("Five");
        // Explicit cast is needed
        Object[] convertedArray = strings.toArray();
        System.out.println("Converted array elements:");
        System.out.println(java.util.Arrays.toString(convertedArray));

        // Another way - provide new array as an argument
        String[] anotherConvertedArray = strings.toArray(new String[0]);
        System.out.println();
        System.out.println("Converted array elements:");
        System.out.println(java.util.Arrays.toString(convertedArray));

        // Both references to the same object
        String[] fixedArray = new String[]{"One", "Two"};
        List<String> backedList = java.util.Arrays.asList(fixedArray);
        fixedArray[0] = "Three";

        // The trick is that backedList is restricted from removing elements and adding new ones
        System.out.println();
        try {
            backedList.remove(1);
        } catch (UnsupportedOperationException ex) {
            System.out.println("You cannot shrink backed list");
        }

        try {
            backedList.add("Five");
        } catch (UnsupportedOperationException ex) {
            System.out.println("You cannot stretch backed list");
        }

        // Collections.sort()
        System.out.println();
        Collections.sort(backedList);
        System.out.println("Sorted elements: ");
        System.out.println(backedList);
    }
}
