package chapter01;

/**
 * Some tests about legal identifiers - '_', '$' and so on...
 */
public class LegalIdentifiers {

    public static void main(String[] args) {

        int $number = 10;
        int _number = 20;

        // It's illegal to start variable name with a digit
        /*
        int 1number = 30;
        */

        // REMEMBER: Java is case sensitive
        int Number = 40;

        // Some crazy things
        int $$$num____ber = 50;
        int _______n$$$um__ber$$$$ = 60;

        // Only dollar sign and underscore are legal 'exotic' characters
        /*
        int *number = 70;
        */

        // Do not use 'reserved words'
        /*
        String class = "class";
        */
        String Class = "Class";
        String main = "main";
        /*
        String static = "static";
        */
    }
}
