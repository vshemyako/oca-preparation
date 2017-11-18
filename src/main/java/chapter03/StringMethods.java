package chapter03;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * For the OCA exam it's necessary to get accustomed with the main String's methods
 */
public class StringMethods {

    public static void main(String[] args) {

        String name = "Valentine";

        // Method#1 - length()
        // Remember that arrays in java have field 'length' while String has method 'length()'
        System.out.println("The length is: " + name.length());

        // Method#2 - charAt() - starts counting from '0'
        System.out.println();
        System.out.println("The first character is: " + name.charAt(0));
        System.out.println("The last character is: " + name.charAt(name.length() - 1));
        // Remember that if you'll request a character, index of which is not presented in a String it will
        // lead to an ordinary IndexOutOfBounds exception
        try {
            System.out.println("Trying to access illegal character: " + name.charAt(name.length()));
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Exception occurred while trying to access illegal character");
        }

        // Method#3 - indexOf() - returns -1 if no match was found
        System.out.println();
        System.out.println("Character 'e': " + name.indexOf('e'));
        System.out.println("Character 'e' with offset 4: " + name.indexOf('e', 4));
        System.out.println("String 'ent': " + name.indexOf("ent"));
        System.out.println("String 'ent' with offset 4 which will return: " + name.indexOf("ent", 4));

        // Method#4 - substring()
        System.out.println();
        System.out.println("Substring starting with index '0': " + name.substring(0));
        System.out.println("Another way to do this: " + name.substring(0, name.length()));
        System.out.println("An empty string: " + name.substring(3, 3));
        try {
            System.out.println("Illegal request: " + name.substring(3, 2));
        } catch (StringIndexOutOfBoundsException ex) {
            System.out.println("It's not possible to request such substring");
        }

        // Method#5 - toLowerCase()
        System.out.println();
        System.out.println("To lowercase: " + name.toLowerCase());

        // Method#6 - toUpperCase()
        System.out.println();
        System.out.println("To uppercase: " + name.toUpperCase());

        // Method#7 - equals()
        // Method#8 - equalsIgnoreCase()
        // Note!!! Due to StringPool mechanism those strings are the same
        System.out.println("String pool nature comparison: " + ("Valentine" == name));
        // Will return false
        System.out.println("String pool isn't used by JVM here: " + (new String("Valentine") == name));
        // Trying to do the same with equals()
        System.out.println("equals() example: " + new String("Valentine").equals(name));
        System.out.println("equals() example: " + "Valentine".equals(name));
        System.out.println("equalsIgnoreCase() example: " + "Valentine".toUpperCase().equalsIgnoreCase(name));

        // Method#9 startsWith()
        System.out.println();
        System.out.println("Starts with 'V': " + name.startsWith("V"));
        System.out.println("Ends with 'e': " + name.endsWith("e"));

        // Method#10 contains()
        System.out.println();
        System.out.println("Does it contain 'v'? :" + name.contains("v"));
        System.out.println("Does it contain 'V'? :" + name.contains("V"));

        // Method#11 replace()
        System.out.println();
        System.out.println("Replace 'Valentine' with 'Annie': " + name.replace("Valentine", "Annie"));
        System.out.println("It's possible to use chars instead: " + name.replace('e', '3'));

        // Method#12 trim()
        String holiday = "   \t Christmas   \t\n";
        System.out.println("Let's try trim() method: " + holiday.trim());
    }
}
