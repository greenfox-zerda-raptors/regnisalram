import java.util.Arrays;

/**
 * Created by regnisalram on 11/4/16.
 */
public class Workshop11{
    public static void main(String[] args) {
        String[] ah = new String[] {"kuty", "macsk", "cic" };
        // add to all elements an 'a' on the end
        for (int animal = 0; animal < ah.length; animal++) {
            ah[animal] += "a";
        }
        System.out.println(Arrays.toString(ah));
    }
}
