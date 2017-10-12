package chapter01;


public class SimpleConstructorExample {

    /**
     * Empty constructor - has the same name as the class has; no return type
     */
    public SimpleConstructorExample() {
    }

    /**
     * Pay special attention to this scenario!
     * The same name as the class has, but return type is present ->
     * Ordinary method not a constructor
     */
    public void SimpleConstructorExample() {
    }
}
