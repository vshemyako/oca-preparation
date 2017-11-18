package chapter03;

import java.util.ArrayList;
import java.util.List;

/**
 * More convenient approach to store a collection of object is to use resizable array which in java is called ArrayList
 */
public class ArrayListExamples {

    public static void main(String[] args) {

        // Plain-old ArrayList declaration which doesn't use Generics
        // If initial capacity isn't specified - capacity of '10' is used
        // If generics aren't used - class type defaults to 'Object'
        ArrayList noGenericsList = new ArrayList();
        noGenericsList.add(10);
        noGenericsList.add('a');
        noGenericsList.add(true);
        noGenericsList.add(1.0f);
        System.out.println("ArrayList of various type variables: ");
        System.out.println(noGenericsList);

        // But it's always good idea to adhere to compile-time type safety
        // New ArrayList object with initial capacity of '16'
        ArrayList<String> genericsList = new ArrayList<String>(16);

        // Previous example was a bit redundant cuz since JDK1.7 it's possible to use 'diamond - <>' operator
        System.out.println();
        ArrayList<Integer> integers = new ArrayList<>(20);
        integers.add(10);
        integers.add(30);
        // First goes index, then goes value
        integers.add(1, 20);
        System.out.println(integers);

        // remove() method
        ArrayList<String> names = new ArrayList<>();
        names.add("Jim");
        names.add("John");
        names.add("Jack");
        names.add("Grey");
        // Method returns boolean value if an object is specified
        System.out.println("Has been removed: " + names.remove("Jim"));
        // Method return an object if an index is specified
        System.out.println("An object has been removed: " + names.remove(1));

        // set() method
        System.out.println();
        // Be careful! If provided wrong index - results in exception being thrown
        System.out.println("Object which was substituted: " + names.set(1, "Johny"));
        System.out.println("List contains: " + names);

        // size() and isEmpty()
        System.out.println();
        System.out.println("Size() method example: " + names.size());
        System.out.println("Is our list empty? : " + names.isEmpty());

        // Convenient method to clear our list - clear()
        names.clear();
        System.out.println();
        System.out.println("Size() method example: " + names.size());
        System.out.println("Is our list empty? : " + names.isEmpty());

        // contains() method which actually invokes upon each element equals() method to see if a match was found
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(100);
        numbers.add(1000);
        System.out.println();
        System.out.println("Does it contain '10'?: " + numbers.contains(10));

        // ArrayList class has a custom implementation of an equals() method
        ArrayList<Integer> copyOfNumbers = new ArrayList<>(numbers);
        System.out.println();
        System.out.println("Is our copied array equal to original one?: " + numbers.equals(copyOfNumbers));

        // Diamond operator
        List list = new ArrayList<>();  //legal ...
        // List<> list = new ArrayList(); //illegal
        // List<> list = new ArrayList<>(); //illegal
    }
}
