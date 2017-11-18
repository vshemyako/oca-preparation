package chapter04.forest;

import chapter04.lake.Fish;

/**
 * I know that deer extending fish is a strange creature, but nonetheless it's all about protected accesss
 */
public class Deer extends Fish {

    public static void main(String[] args) {

        // And again - everything works fine
        Deer deer = new Deer();
        System.out.println(deer.name);
        System.out.println(deer.surName);
        System.out.println(Deer.surName);

        // Accessing methods is also ok!
        deer.speak();
        deer.speakSurName();
        Deer.speakSurName();

        // Remember! You cannot reference members of the parent class with the parent class type variable from within
        // another package
        Fish fish = new Fish();
        // !!! Doesn't compile
        /*
        System.out.println(fish.name);
        */
        // This won't either
        /*
        fish.speak();
         */

        // Accessing static members is ok!
        System.out.println(fish.surName);
        fish.speakSurName();
    }

    public void protectedAccessCheck() {
        // We've inherited all protected members so it's ok to use them without references
        System.out.println(name);
        System.out.println(surName);
        speak();
        speakSurName();
    }
}
