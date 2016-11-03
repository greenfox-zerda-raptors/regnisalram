import com.sun.deploy.util.StringUtils;

/**
 * Created by regnisalram on 11/3/16.
 */
public class Workshop35 {
    public static void main(String[] args) {
        // Write a program which has this output
        // 1******
        // 12*****
        // 123****
        // 1234***
        // 12345**
        // 123456*
        // 1234567
        String out = "";
        for (int i = 1; i <= 7; i++) {
            out = out + i;
            String padded = out.format("%-7s", out).replace(' ', '*');
            System.out.println(padded);
        }

    }
}