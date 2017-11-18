package enthuware;

import java.util.ArrayList;

/**
 * Created by Tom on 16.11.2017.
 */
public class ArrayListTest {

    public static void main(String[] args) {

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(null);
        integers.remove(null);

        System.out.println(integers);
    }

}
