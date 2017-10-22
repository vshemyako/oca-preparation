package chapter05.MultipleInheritance;

/**
 * Examines edge cases with multiple inheritance scenario when both of interfaces have methods with the same signature
 */
public class Human implements BadMan, GoodMan{

    // It's possible to implement interfaces which have methods with the same signature
    // Cuz implementing on of those will automatically implement another one
    public void speak() {
        System.out.println("I ma bad");
    }

    // Method overloading is ok!
    public void greet() {
        System.out.println("Hello everyone");
    }

    public void greet(String name) {
        System.out.format("Hello %s", name);
    }
}
