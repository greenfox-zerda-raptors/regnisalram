/**
 * Created by regnisalram on 12/6/16.
 */
public class NumberConverter {
    public static String arabicToRoman(int i) {
        String out = "";
        String I = "I";
        String V = "V";
        String X = "X";
        if (i == 4) {
            out = I + V;
        } else if (i == 5) {
            out = V;
        } else if (i == 9) {
            out = I + X;
        } else if (i == 10) {
            out = X;
        } else if (i < 4){
            while (i > 0) {
                out += I;
                i--;
            }
        } else {
            while (i > 5) {
                out = V;
                out += I;
                i--;
            }
        }
        return out;
    }
}
