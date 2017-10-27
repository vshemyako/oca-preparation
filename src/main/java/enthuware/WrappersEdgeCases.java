package enthuware;

/**
 * It turns out that primitive type Wrappers have constructors which accept string as a parameter
 */
public class WrappersEdgeCases {

    public static void main(String[] args) {
        String numberAsString = "100";

        Long stringAsLong = new Long(numberAsString);
        Long.parseLong(numberAsString);
        Long.valueOf(numberAsString);

        // Returns primitive value
        // Remember Long and other Wrappers doesn't have no-args constructors
        new Long(100).longValue();
    }
}
