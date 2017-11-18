package enthuware;

/**
 * Edge cases of string comparison
 */
public class StringComparison {

    StringComparison() throws Error {
    }

    public static void main(String[] args) {

        // PAY ATTENTION!!!!
        String name = "Hello";
        System.out.println("String comparison");
        System.out.println(name == (new String("Hello").intern()));
        System.out.println(name == "Hel" + "lo");
        System.out.println(name == (new String("Hello")));
    }
}
