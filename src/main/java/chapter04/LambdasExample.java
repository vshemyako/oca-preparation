package chapter04;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Experimenting with simple lambdas
 */
public class LambdasExample {

    public static void main(String[] args) {

        List<String> friends = new ArrayList<>();
        friends.add("Ronnie");
        friends.add("Bunnie");
        friends.add("Tommie");

        Predicate<List> listPredicate = (list) -> {return true;};

        // Filtering function which accepts predicate interface
        friends.removeIf(friend -> friend.charAt(0) != 'R');
        System.out.println(friends);
    }
}
