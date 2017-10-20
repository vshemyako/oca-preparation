package chapter04.initorder;

/**
 * Edge cases of initialization without superclass initialization
 * Pay attention to this init order! 1 -> 3 -> 2 -> 4 -> 0
 */
public class InitOrderWithoutSuper {

    private InitOrderWithoutSuper() {
        print("0");
    }

    static {
        print("1");
    }

    {
        print("2");
    }

    static {
        print("3");
    }

    private static void print(String number) {
        System.out.println(number);
    }

    {
        print("4");
    }

    static {
        new InitOrderWithoutSuper();
    }

    public static void main(String[] args) {
        // nothing here
    }
}
