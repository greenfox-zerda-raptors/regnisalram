/**
 * Created by regnisalram on 11/4/16.
 */
public class Workshop12{
    public static void main(String[] args) {
        // Swap the first element of the array
        // Expected output: third second first
        String[] abc = new String[] { "first", "second", "third" };
/* original solution:
        String first = abc[0];
        String last = abc[2];
        abc[0] = last;
        abc[2] = first;

        slightly shorter, with the help of the internets: */

        String temp = abc[0];
        abc[0] = abc[2];
        abc[2] = temp;

        for(int i=0;i<abc.length;i++){
            System.out.print(abc[i] + " ");
        }
    }
}