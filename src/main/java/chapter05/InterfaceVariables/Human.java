package chapter05.InterfaceVariables;

/**
 * Tests how we can access static variables of an interfaces
 */
public class Human implements Tiny {

    public static void main(String[] args) {

        // Any type of access is possible
        System.out.println(height);
        System.out.println(Tiny.height);
        System.out.println(new Human().height);
        System.out.println(Human.height);
    }
}
