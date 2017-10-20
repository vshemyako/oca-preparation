package chapter04;

/**
 * Static and instance member have some differences which are not easy to spot
 */
public class StaticVsInstance {

    private static String greeting = "Hello";

    public static void main(String[] args) {

        // Its obvious that we can call static field using instance of a class
        StaticVsInstance instance = new StaticVsInstance();
        System.out.println(instance.greeting);

        // What is not that obvious is that we can do the same even if our reference variable equals null
        instance = null;
        System.out.println("Reference to a static field via null reference variable: " + instance.greeting);

        // Calling another static method without reference
        printGreeting();
    }

    private static void printGreeting() {
        System.out.println(greeting);
    }
}
