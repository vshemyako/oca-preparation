package enthuware;

/**
 * Unreachable statements
 */
public class LoopConstructs {

    public static void main(String[] args) {
        int number = 10;
        for (; number < 3; ) {
            System.out.println("hello");
        }
        System.out.println("Goodbye");
    }
}
