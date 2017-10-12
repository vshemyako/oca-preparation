package chapter01;

/**
 * Test default initialization of fields
 */
public class DefaultFieldsInitialization {

    byte byteField;
    short shortField;
    int intField;
    long longField;

    float floatField;
    double doubleField;

    char charField;

    boolean booleanField;

    Object objectField;

    public static void main(String[] args) {
        DefaultFieldsInitialization initialization = new DefaultFieldsInitialization();

        // Integral variables init to '0'
        System.out.println("Byte field: " + initialization.byteField);
        System.out.println("Short field: " + initialization.shortField);
        System.out.println("Int field: " + initialization.intField);
        System.out.println("Long field: " + initialization.longField);

        // Floating-point variables init to '0.0'
        System.out.println("Float field: " + initialization.floatField);
        System.out.println("Double field: " + initialization.doubleField);

        // char inits to '\u0000'
        System.out.println("Char field: " + initialization.charField);

        // boolean to 'false'
        System.out.println("Boolean field: " + initialization.booleanField);

        // object to 'null'
        System.out.println("Object field: " + initialization.objectField);
    }
}
