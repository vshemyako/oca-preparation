package chapter05.DefaultMethods;

public interface BadBaby {

    default void behave() {
        System.out.println("I'm a bad boy =)");
    }
}
