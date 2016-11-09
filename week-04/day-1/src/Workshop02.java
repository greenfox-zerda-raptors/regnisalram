/**
 * Created by regnisalram on 11/7/16.
 */
import java.util.*;

public class Workshop02{
    public static void main(String... args){
        String[] numbers = new String[] { "one", "two", "three", "four", "five"};
        // Initialize the arrayList using the numbers array
        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(numbers)); // ??

        System.out.println(arrayList);
    }
}