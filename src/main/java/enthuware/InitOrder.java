package enthuware;

/**
 * Init order of classes
 */
public class InitOrder {

    public InitOrder() {
        System.out.println("Parent constructor");
    }

    static {
        System.out.println("Parent static block");
    }

    {
        System.out.println("Parent non-static block");
    }

    public static void main(String[] args) {
        new ChildInitOrder();
    }
}

class ChildInitOrder extends InitOrder {

    public ChildInitOrder() {
        System.out.println("Child constructor");
    }

    static {
        System.out.println("Child static block");
    }

    {
        System.out.println("Child non-static block");
    }
}
