/**
 * Created by regnisalram on 11/4/16.
 * mozgaanna's solution, just copied here ffr
 */
public class Workshop35a {
    public static void main(String[] args) {

        String x = "*******";
        for (int i = 1; i <= 7; i++) {
            x = x.replaceFirst("\\*", Integer.toString(i));
            System.out.println(x);
        }
    }
}
