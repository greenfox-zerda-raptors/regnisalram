/**
 * Created by regnisalram on 11/4/16.
 */
import java.util.Arrays;
public class Workshop05{
    public static void main(String[] args) {
        int[] t = new int[] { 1, 2, 3, 4, 5 };
        // increment the 3rd element
        t[2] += 1;
        System.out.println(Arrays.toString(t));
    }
}