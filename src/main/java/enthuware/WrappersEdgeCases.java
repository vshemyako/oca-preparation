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
        new Byte((byte) 20).byteValue();
        new Byte((byte) 20).shortValue();
        new Byte((byte) 20).intValue();
        new Byte((byte) 20).longValue();
        new Byte((byte) 20).floatValue();
        new Byte((byte) 20).doubleValue();
        new Character((char) 20);

        A b = new B();
        System.out.println(b.number);

        String name = new StringBuilder("hello") + "hello";

        "replace".replace('r', 'r');
    }
}

class A {
    final static int number = 100;

    public static void speak() {

    }
}

class B extends A {
    final int number = 200;

    public static void speak() {

    }
}
