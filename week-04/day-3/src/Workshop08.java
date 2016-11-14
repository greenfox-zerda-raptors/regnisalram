/**
 * Created by regnisalram on 11/10/16.
 */
/**************************************************************************************************
 * Workshop: Practice Exceptions: Having raised exceptions, then what?  I'm looking to get some
 * closure here.  "Finally" would do... whatever else, this is what I need if something goes
 * wrong...
 *
 *
 *
 * So, I'm looking for the following output:
 * try - first statement
 * start - myMethod
 * An Exception Occurred
 * Finally I did this instead
 * ::::FINISH LINE:::: out of the try/catch/finally statement
 *
 **************************************************************************************************/
import java.util.*;

public class Workshop08{

    static void myMethod(int inNumber) throws Exception { // something should appear here before (see Workshop07)
        System.out.println("start - myMethod");
        if (inNumber == 7) {
            throw new Exception("You can't possibly think 7 is a valid number...");
        }
    }

    public static void main(String  args[]) { // see Workshop07
        Scanner userInput = new Scanner(System.in);
        int myValue;
        String prompt = "Enter a value from 1 to 9 or 0 to exit?";

        System.out.println(prompt);
        while (userInput.hasNextInt()) {
            myValue = userInput.nextInt();
            if (myValue == 0) {
                break;
            } else {
                try {
                    System.out.println("try - first statement");
                    myMethod(myValue);
                   // System.out.println("start - myMethod");
                } catch (Exception ex) {
                    System.out.println("An Exception occurred: " + ex.getMessage());
                } finally {
                    if (myValue == 0) {
                        System.out.println("Finally I did this");
                    } else {
                        System.out.println("Not done just yet!");
                    }

                }
            }
        }
        System.out.println("::::FINISH LINE::::");
    }
}