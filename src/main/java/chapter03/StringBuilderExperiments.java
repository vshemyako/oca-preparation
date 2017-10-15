package chapter03;

/**
 * String objects are immutable which means that each and every operation upon String objects creates a new String
 * object. For this reason two other classes exist in java - 'StringBuilder' and 'StringBuffer'
 */
public class StringBuilderExperiments {

    public static void main(String[] args) {

        // Important feature which really show difference between 'StringBuilder' and 'String' objects is capacity
        StringBuilder firstBuilder = new StringBuilder();
        System.out.println("Initial size is: " + firstBuilder.length());
        // Initial capacity of a 'StringBuilder' object is 16
        System.out.println("Initial capacity is: " + firstBuilder.capacity());

        StringBuilder secondBuilder = new StringBuilder("four");
        System.out.println("Our initial capacity will be 'four'.length() + '16': " + secondBuilder.capacity());

        // Let's see how our capacity is stretched
        StringBuilder thirdBuilder = new StringBuilder(1);
        thirdBuilder.append("two");
        // Now curious logic is implicated, just adds the length of a parameter
        System.out.println("New capacity: " + thirdBuilder.capacity());

        // Method#1 - charAt()
        // Counterpart of the same String's method
        System.out.println();
        firstBuilder.append("holidays");
        System.out.println("What char is at position '3': " + firstBuilder.charAt(3));

        // Method#2 - indexOf()
        System.out.println();
        System.out.println("Index of 'l' letter: " + firstBuilder.indexOf("l"));

        // Method#3 - length()
        System.out.println();
        System.out.println("The length of a string builder: " + firstBuilder.length());

        // Method#4 - substring()
        System.out.println();
        System.out.println("Returns a new string! Doesn't change StringBuilder object itself!");
        System.out.println("Substring from '0' to '5': " + firstBuilder.substring(0, 5));
        System.out.println("Our string builder stays the same: " + firstBuilder);

        // Method#5 - append() - the main reason why one should use a 'StringBuilder' class
        StringBuilder forthBuilder = new StringBuilder();
        for (char abc = 'a'; abc <= 'z'; abc++) {
            forthBuilder.append(abc);
        }
        // String would created 27 separate objects while StringBuilder just changes the same
        // No garbage collection is implicated - very memory efficient
        System.out.println();
        System.out.println("Final object: " + forthBuilder);

        // Method#6 - insert()
        System.out.println();
        StringBuilder fifthBuilder = new StringBuilder("Boss");
        System.out.println("Insert new character at index '0': " + fifthBuilder.insert(0, 'J'));
        System.out.println("Insert a new String at index '1': " + fifthBuilder.insert(1, "ava"));

        // Method#7 - delete()
        // Be careful about indices - the end index is not included as we saw previously in substring() method
        System.out.println();
        StringBuilder sixthBuilder = new StringBuilder("Trump");
        System.out.println("Let's delete this guy: " + sixthBuilder.delete(0, sixthBuilder.length()));

        // Method#8 - reverse()
        System.out.println();
        StringBuilder seventhBuilder = new StringBuilder("Bob");
        System.out.println("Reverses a string: " + seventhBuilder.reverse());
    }
}
