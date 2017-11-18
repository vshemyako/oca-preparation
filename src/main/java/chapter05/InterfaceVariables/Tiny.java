package chapter05.InterfaceVariables;

/**
 * Examines how static fields of java's interfaces
 */
public interface Tiny {

    // All fields are complemented with 'public static final' keywords
    int height = 100;

    // Static init blocks are not allowed in interfaces
    /*
    int weight;
    static {
        weight = 1000;
    }
    */
}
