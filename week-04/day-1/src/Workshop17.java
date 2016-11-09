/**
 * Created by regnisalram on 11/9/16.
 */
import java.util.*;

public class Workshop17 {

    // Implement trimAll(..)
    // Expected output:
    // "first"
    // "second"
    // "third"
    // "fourth"
    // "fifth"

    static void trimAll(List<String> strings) {
        // ???
        for (ListIterator<String> it = strings.listIterator(); it.hasNext();) {
            it.set(it.next().trim());
        }
    }

    public static void main(String... args){
        List<String> strList = new ArrayList<String>(Arrays.asList("   first", "second   ", "  third ", "fourth", "    fifth "));
        trimAll(strList);
        for (String str : strList) {
            System.out.format("\"%s\"%n", str);
        }
    }
}