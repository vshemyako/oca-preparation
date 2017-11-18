package enthuware.revision;

/**
 * Created by Tom on 06.11.2017.
 */
public class ExceptionsHandling {

    public static void main(String[] args) {
        try {
            char foundChar = "Hello".charAt(5);
        } catch (IndexOutOfBoundsException exc) {
            System.out.println("Exception was thrown");
        }
    }
}
