/**
 * Created by regnisalram on 11/9/16.
 */
import java.util.*;

public class Workshop15{
    public static void main(String... args){
        ArrayList<String> al = new ArrayList<String>(Arrays.asList("1", "2", "3", "4", "5", "6", "7" ));
        // Add "a" to every string in al. Use a for(each) loop
        for (String st : al) {
            al.set(al.indexOf(st), st + "a");
        }
        System.out.println(al);

    }
}