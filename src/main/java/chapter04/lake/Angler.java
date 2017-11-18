package chapter04.lake;

import chapter04.forest.Deer;

/**
 * We'll try to access protected member from another class
 */
public class Angler {

    public static void main(String[] args) {

        // Everything works as expected
        Fish fish = new Fish();
        System.out.println(fish.name);
        fish.speak();

        // Static members are accessible too
        System.out.println(Fish.surName);
        System.out.println(fish.surName);
        Fish.speakSurName();
        fish.speakSurName();

        Deer deer = new Deer();
        System.out.println(deer.name);;
        deer.speak();
        System.out.println(deer.surName);
        deer.speakSurName();
    }
}
