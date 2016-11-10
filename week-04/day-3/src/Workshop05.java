/**
 * Created by regnisalram on 11/10/16.
 */
/**************************************************************************************************
 * Workshop: Practice Exceptions: Nested Try Catch
 *
 * Run this and explain the what the heck is going on
 *
 * ADD YOUR EXPLANATION HERE -----------------------------------
 * 1, The Parent try block starts
 * 2, Child try block1 starts
 * 3, Prints "Inside block1" from inside Child try block1
 * 4, Since the exception that is thrown is caught in the catch that comes after this, it prints
 *    "Exception: e1"
 * 5, Goes into Child try block2
 * 6, Prints "Inside block2"
 * 7, But since the catch block's argument doesn't catch the right kind of Exception...
 * 8, It exits the block and we are in Parent try block again, at the first catch block
 * 9, Since here's the right kind of Exception is caught for the last try block ie.
 *    ArithmeticException, it prints both lines from here.
 * 10,It doesn't check any other catch blocks, since the Exception has been caught.
 * 11,Prints Next statement...
 *
 **************************************************************************************************/
import java.util.*;

public class Workshop05{
    public static void main(String[] args){

        //Parent try block
        try{
            //Child try block1
            try{
                System.out.println("Inside block1");
                int b =45/0;
                System.out.println(b);
            }
            catch(ArithmeticException e1){
                System.out.println("Exception: e1");
            }
            //Child try block2
            try{
                System.out.println("Inside block2");
                int b =45/0;
                System.out.println(b);
            }
            catch(ArrayIndexOutOfBoundsException e2){
                System.out.println("Exception: e2");
            }
            System.out.println("Just other statement");
        }
        catch(ArithmeticException e3){
            System.out.println("Arithmetic Exception");
            System.out.println("Inside parent try catch block");
        }
        catch(ArrayIndexOutOfBoundsException e4){
            System.out.println("ArrayIndexOutOfBoundsException");
            System.out.println("Inside parent try catch block");
        }
        catch(Exception e5){
            System.out.println("Exception");
            System.out.println("Inside parent try catch block");
        }
        System.out.println("Next statement..");
    }
}


