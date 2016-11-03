/**
 * Created by regnisalram on 11/3/16.
 */
public class Workshop37 {
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
        String hash = "#";
        String line = "";
        for (int l = 1; l < 8; l++) {
            line = "";
            if (l % 2 == 0) {
                line = " ";
            }
            for (int i = 0; i <= 13; i++) {
                if (i % 2 == 0) {
                    line += hash;
                } else {
                    line += " ";
                }
            }
            System.out.println(line);
        }
    }
}