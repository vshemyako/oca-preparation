package chapter03;

/**
 * String comparison is a tricky part of the Java language.
 * One have to remember about 'string pool compile-time mechanism'.
 */
public class StringsEquality {

    public static void main(String[] args) {

        // 1st - we use string literals
        // 2nd - the are the same at compile time!
        String whiskey = "Jim Bean";
        String tastyLiquid = "Jim Bean";
        System.out.println("Due to string pool they are the same: " + (whiskey == tastyLiquid));

        // Let's show that compile-time equality is important
        String vodka = "Grey Goose";
        String nopeItsFood = "Grey Goose ";
        nopeItsFood = nopeItsFood.trim();
        System.out.println("Simple reference comparison will fail now: " + (vodka == nopeItsFood));

        // So as every java guide suggests objects equality has be to compared using equals()
        System.out.println("Equals() returns: " + vodka.equals(nopeItsFood));

        // Remember: StringBuilder doesn't implement its own equals() method -> simple reference comparison is inherited
        StringBuilder beerBuilder = new StringBuilder("Budweiser");
        StringBuilder drinkBuilder = new StringBuilder("Budweiser");
        System.out.println("Equals will fail: " + beerBuilder.equals(drinkBuilder));
    }
}
