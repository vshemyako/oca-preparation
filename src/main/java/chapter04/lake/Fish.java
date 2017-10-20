package chapter04.lake;

/**
 * Class is created protected access which is the most trickiest
 */
public class Fish {

    protected String name = "fish";
    protected void speak() {
        System.out.println("I'm a " + name);
    }

    protected static String surName = "the monster";
    protected static void speakSurName() {
        System.out.println("I'm a " + surName);
    }
}
