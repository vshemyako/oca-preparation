package chapter05.DefaultMethods;

import chapter05.MultipleInheritance.GoodMan;

/**
 * Scrutinizes multiple inheritance problem with default methods
 */
public class Baby implements GoodBaby, BadBaby {

    // If both of methods with default implementation are provided we have to override both of them to prevent compile
    // time error
    @Override
    public void behave() {
        System.out.println("No one knows who i am!");
    }
}
