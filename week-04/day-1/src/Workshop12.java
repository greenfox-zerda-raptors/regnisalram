/**
 * Created by regnisalram on 11/7/16.
 */
import java.util.*;

public class Workshop12{
    public static void main(String... args){
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));
        // Check if list contains all of the following elements: 4,8,12,16
        // Print "true" if it contains all, otherwise print "false"
        ArrayList<Integer> containList = new ArrayList<Integer> (Arrays.asList(4, 8, 12, 16));
        System.out.println(list.containsAll(containList));
    }
}
