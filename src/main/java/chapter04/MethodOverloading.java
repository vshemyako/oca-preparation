package chapter04;

/**
 * Some tricky parts about method overloading and parameters matching
 */
public class MethodOverloading {

    public static void main(String[] args) {

        // The most important thing to remember - java makes promotion only once!
        speak(10);
        speak(10L);
        speak(new Integer(10));
        speak(new Long(10));
        speak(new Object());
        speak(10, 20);
    }

    private static void speak(int number) {
        System.out.println("int");
    }

    private static void speak(long number) {
        System.out.println("long");
    }

    private static void speak(Integer number) {
        System.out.println("Integer");
    }

    private static void speak(Long number) {
        System.out.println("Long");
    }

    private static void speak(Object number) {
        System.out.println("Object");
    }

    // Remember that java treats varargs and array as the same structure
    private static void speak(Object ...number) {
        System.out.println("Varargs");
    }
}
