/**
 * Created by regnisalram on 11/9/16.
 */
import java.util.*;

public class Workshop16 {
    public static void main(String... args) {
        ArrayList<Integer> al = new ArrayList<Integer> (Arrays.asList (1, 2, 3, 4, 5, 6, 7));
        // Fix this code fragment! It should remove every even number from the list.

        for(Iterator<Integer> it = al.iterator(); it.hasNext();) {
            int element = it.next();
            if(element % 2 == 0){
                it.remove();
            }
        }
        System.out.println(al);
    }
}
