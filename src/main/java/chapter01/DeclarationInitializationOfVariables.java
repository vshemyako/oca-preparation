package chapter01;

/**
 * Test some edge cases of variable declaration and initialization
 */
public class DeclarationInitializationOfVariables {

    public static void main(String[] args) {

        // Declaration and initialization on separate lines
        String name;
        int age;
        name = "Tonnie";
        age = 20;

        // More concise way
        String anotherName = "Ronnie";
        int anotherAge = 45;

        // The same line declarations
        // All of type int
        int first, second, third;

        // Only 'five' is initialized
        int forth, five = 10;

        // Illegal several type declaration via comma
        /*
        byte one, string name;
        */

        // Even of the same type
        /*
        byte two, byte three;
        */

        // Be carefull about ';'
        // It's legal - separate statements
        byte four; String familyName;
    }
}
