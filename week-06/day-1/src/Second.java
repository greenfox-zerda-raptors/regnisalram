import java.util.ArrayList;

/**
 * Created by regnisalram on 11/21/16.
 */
public class Second {

    public static int sum(ArrayList<Integer> numbers) {
        int sumOfArrayList = 0;
        for (int number : numbers) {
            sumOfArrayList += number;
        }
        return sumOfArrayList;
    }
}
