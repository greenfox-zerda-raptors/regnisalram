/**
 * Created by regnisalram on 11/4/16.
 */
public class Workshop37a {
    public static void main(String[] args) {
        // Write a program which has this output
        // # # # # # # #
        //  # # # # # # #
        // # # # # # # #
        //  # # # # # # #
        // # # # # # # #
        //  # # # # # # #
        // # # # # # # #
        // The # character should be replacable, hence store it in a variable
        String x = "#";
                for (int k = 0; k < 7; k++) {
                        for (int l = 0; l < 7; l++) {
                                if (k % 2 == 0)
                                        System.out.print(String.format("%s ", x));
                                else
                                    System.out.print(String.format(" %s", x));
                            }
                        System.out.print("\n");
                    }

    }
}