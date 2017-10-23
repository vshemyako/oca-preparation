package chapter06;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Java language has exceptions structure which builds on Throwable superclass. It's important to understand when an
 * exception have to be handled or declared
 */
public class TestingExceptions {

    // Runtime exception
    // Arithmetic exception
    public static void sum() {
        try {
            int answer = 11 / 0;
        } catch (ArithmeticException ex) {
            System.out.println("Runtime exception occurred! Division by zero!");
        }
    }

    // Index out of bounds
    public static void iterate() {
        int[] array = new int[]{10, 20, 30};
        try {
            for (int index = 0; index <= array.length; index++) {
                System.out.print(array[index]);
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println();
            System.out.println("Runtime exception occurred! Illegal index was requested!");
        }
    }

    // Class cast
    public static void cast() {
        String name = "Valentine";
        Object hiddenName = name;
        try {
        Integer numberName = (Integer) hiddenName;
        } catch (ClassCastException ex) {
            System.out.println("Runtime exception occurred! Illegal cast!");
        }
    }

    // Illegal argument exception
    // It's common for a programmer to throw it!
    public static void tellTeethNumber(int numberOfTeeth) {
        if (numberOfTeeth >= 0) {
        System.out.println("Your number of teeth is: " + numberOfTeeth);
        } else {
            throw new IllegalArgumentException("Are you serious?");
        }
    }

    public static final void main(String[] args) {
        sum();
        iterate();
        cast();

        try {
            tellTeethNumber(-2);
        } catch (IllegalArgumentException ex) {
            System.out.println("Actually I'm not =)");
        }
    }
}
