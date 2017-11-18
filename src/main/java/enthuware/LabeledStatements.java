package enthuware;

/**
 * Labels are not straightforward theme for OCA exam
 */
public class LabeledStatements {

    public static void main(String[] args) {
        label_1:
        System.out.println("lavel_1");

        label_2:
        {
        }

        label_2:
        {
            break label_2;
        }

        //will not compile
        /*
        label_2:
        {
            continue label_2;
        }
        */

        //will not compile
        /*
        label_3:
        int number = 10;
        */

        label_4:
        if(false) break label_4;

        label_5:
        invokedByLabel();

        int number = 10;
        label_6:
//        Integer.MAX_VALUE;
//        LabeledStatements labeledStatements = new LabeledStatements();
        number++;

        label_7:
        number = 10;
    }

    public static void invokedByLabel() {
        System.out.println("Invoked by label!");
    }
}
