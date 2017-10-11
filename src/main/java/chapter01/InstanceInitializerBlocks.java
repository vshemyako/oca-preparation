package chapter01;

/**
 * Order of initialization:
 * -- instance fields and instance initialization blocks run in the order they appear in the code
 * -- constructor runs last
 */
public class InstanceInitializerBlocks {

    /**
     * It's not possible to make a forward reference. Only possible to set variable value beforehand
     */
    /*
    {
        System.out.println(name);
    }
    */

    /**
     * Init block before instance field
     */ {
        this.name = "First Block";
    }

    private String name = "Field itself";

    /**
     * Init block after instance field
     */ {
        this.name = "Second Block";
    }

    public static void main(String[] args) {
        InstanceInitializerBlocks blocks = new InstanceInitializerBlocks();
        System.out.println("Before inner block of code: " + blocks.name);

        // It's not an instance init block - just an ordinary block of code
        {
            blocks.name = "Forth Block";
        }
        System.out.println("After inner block of code: " + blocks.name);
    }

    private InstanceInitializerBlocks() {
        this.name = "Constructor inits field";
    }

    /**
     * Instance block at the bottom of the program
     */ {
        this.name = "Third Block";
    }
}
