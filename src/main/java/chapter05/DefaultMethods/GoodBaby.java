package chapter05.DefaultMethods;

public interface GoodBaby {

    default void behave() {
        System.out.println("I'm a good boy =)");
    }
}
