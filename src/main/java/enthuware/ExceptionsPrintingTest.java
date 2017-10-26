package enthuware;

/**
 * There are some questions on the OCA exam which test knowledge of how exceptions are printed to the console
 */
public class ExceptionsPrintingTest {

    public static void main(String[] args) {

        try {
            throw new CustomException();
        } catch(CustomException exc) {
            // Straight exception print just gives up fully-qualified name of an Exception class
            System.out.println(exc);
        }

        try {
            throw new CustomException("Custom message in CustomException");
        } catch(CustomException exc) {
            // Message is attached to class name if provided
            System.out.println(exc);
        }

        try {
            throw new CustomException("Let's print stacktrace");
        } catch(CustomException exc) {
            System.out.println("Stack trace of an exception");
            exc.printStackTrace();
        }
    }
}

class CustomException extends Exception {

    public CustomException() {
    }

    public CustomException(String messageToPrint) {
        super(messageToPrint);
    }
}
