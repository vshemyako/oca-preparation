package enthuware;

/**
 * It turns out that case parts of switch statements don't create the own scope
 */
public class SwitchCaseInsanceExample {

    public static void main(String[] args) {
        switch (Integer.parseInt(args[1]))  //1
        {
            case 0:
                boolean b = false;
                break;

            case 1:
                b = true; //2
                break;
        }
    }
}
