package enthuware;

import java.util.ArrayList;
import java.util.List;

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

        A b = new B();
        System.out.println(b.number);

        String name = new StringBuilder("hello") + "hello";

        "replace".replace('r', 'r');
    }
}

class A {
    final int number = 100;
}

class B extends A {
    final int number = 200;
}
