/**
 * Created by regnisalram on 11/10/16.
 */
/**************************************************************************************************
 * Workshop: Practice Exceptions: Cascading problems
 *
 * What if there are lots of different types of errors?
 *
 * We've got an array and a mad man writing idiotic code (me!).  Deal with my mayhem and get to
 * the ::::FINISH LINE::::
 *
 * Note that there should not be Compile Time errors.
 *
 **************************************************************************************************/
import java.util.*;

public class Workshop04{
    public static void main(String[] args){

        int a[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8};
        String two = "2";

        System.out.println("Testing ...");
        try {
            a[2] = a[3]/a[0];
        } catch (ArithmeticException e){
            System.out.println(e.toString());
        }
        System.out.println("Past hurdle 1" + "\n");

        try {
            a[9] = Integer.parseInt(two);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.toString());
        }
        System.out.println("Past hurdle 2" + "\n");

        try {
            a[10] = Integer.parseInt("ten");
        } catch (NumberFormatException e) {
            System.out.println(e.toString());
        }
        System.out.println("Past hurdle 3...  And I realized perhaps I'm wrong" + "\n");

        try {
            a[10] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.toString());
        }
        System.out.println("Past hurdle 4" + "\n");

        try {
            two = "two";
        } catch (NumberFormatException e) {
            System.out.println(e.toString());
        }
        System.out.println("Past hurdle 5" + "\n");

        try {
            a[9] = Integer.parseInt(two);
        } catch (NumberFormatException e) {
            System.out.println(e.toString());
        }
        System.out.println("*** FINISH LINE ***");
    }
}