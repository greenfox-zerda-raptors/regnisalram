import java.util.Arrays;

/**
 * Created by regnisalram on 11/4/16.
 */
public class Workshop09{
    public static void main(String[] args) {
        int[] ag = new int[] { 3, 4, 5, 6, 7 };
        // please double all the elements of the list
        for (int i = 0; i < ag.length; i++) {
            ag[i] *= 2;
        }
        System.out.println(Arrays.toString(ag));
    }
}