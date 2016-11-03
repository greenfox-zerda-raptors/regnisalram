/**
 * Created by regnisalram on 11/3/16.
 */
public class Workshop36 {
    public static void main(String[] args) {
        // Write a program which has this output
        // # # # # #
        // # # # # #
        // # # # # #
        // # # # # #
        // # # # # #
        // The # character should be replacable, hence store it in a variable
        String hash = "#";
        String line = "";
        for (int l = 0; l < 5; l++) {
            for (int i = 0; i <= 9; i++) {
                if (i != 9) {
                    if (i % 2 == 0) {
                        line += hash;
                    } else {
                        line += " ";
                    }
                } else {
                    line += "\n";
                }
            }
        }
        System.out.println(line);
    }
}