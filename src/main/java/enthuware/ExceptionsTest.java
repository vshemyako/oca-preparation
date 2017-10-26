package enthuware;

/**
 * Interesting, exceptions have some edge cases too
 */
public class ExceptionsTest {

    // We cannot throw exceptions in init blocks
    // This is legal
    static {
        if (true) {
            throw new IndexOutOfBoundsException();
        }
    }
    // This is not
    /*
    {
        throw new IndexOutOfBoundsException();
    }
    */

    public static void main(String[] args) {

        break_label:
        {
            System.out.println("Hello");
            break break_label;
        }
    }
}
