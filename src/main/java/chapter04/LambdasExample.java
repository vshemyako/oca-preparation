package chapter04;

import java.util.ArrayList;
import java.util.List;

/**
 * Experimenting with simple lambdas
 */
public class LambdasExample {

    public static void main(String[] args) {

        List<String> friends = new ArrayList<>();
        friends.add("Ronnie");
        friends.add("Bunnie");
        friends.add("Tommie");

        // Filtering function which accepts predicate interface
        friends.removeIf(friend -> friend.charAt(0) != 'R');
        System.out.println(friends);
    }
}
