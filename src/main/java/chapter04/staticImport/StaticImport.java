package chapter04.staticImport;

import static chapter04.staticImport.FirstStatic.NAME;

/**
 * Let's try to import two static variables with the same name
 */
public class StaticImport {

    public static void main(String[] args) {

        // As with plain class imports its illegal to make static imports of variables with the same name
        System.out.println(NAME);
        System.out.println(SecondStatic.NAME);
    }
}
