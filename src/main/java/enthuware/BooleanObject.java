package enthuware;

/**
 * Boolean class has tricky constructors
 */
public class BooleanObject {

    public static void main(String[] args) {

        System.out.println(Boolean.TRUE);
        System.out.println(Boolean.FALSE);
        System.out.println(Boolean.parseBoolean("TrUe") == Boolean.TRUE);
        System.out.println(new Boolean("TrUe") == Boolean.TRUE);

        // Insane primitive assignments
        float number = 0x01;
        double number2 = 1.3_2e1_0_0;
    }
}
