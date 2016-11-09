/**
 * Created by regnisalram on 11/9/16.
 */
import java.util.*;

public class Workshop14{
    public static void main(String... args){
        ArrayList<String> al = new ArrayList<String>(Arrays.asList("kuty", "macsk", "kacs", "rók"));
        // Add "a" to every string in al. Use an iterator!
        ListIterator<String> plusA = al.listIterator();
        while (plusA.hasNext()) {
            plusA.set(plusA.next() + "a");
        }
        System.out.println(al);
    }
}
