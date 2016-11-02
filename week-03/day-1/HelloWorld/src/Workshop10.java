/**
 * Created by regnisalram on 11/2/16.
 */
public class Workshop10{
    public static void main(String[] args) {
        int j1 = 10;
        int j2 = 3;
        // tell if j1 is between j2 squared and j2 cubed
        boolean isBetween = Math.sqrt(j2) < j1 && j1 < j2*j2;
        System.out.println(isBetween);
    }
}
