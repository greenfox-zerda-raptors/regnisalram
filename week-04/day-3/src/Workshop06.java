/**
 * Created by regnisalram on 11/10/16.
 */
/**************************************************************************************************
 * Workshop: Practice Exceptions: Nested Try Catch - 2nd situation
 *
 * Run this and explain the what is going on
 *
 * Basically if there's an Exception in a try block, it'll look within it's loop first, then exit it,
 * and keep looking until it finds the right Exception in a catch block. Doesn't really matter where
 * the catch block is compared to the try block. It'll look in a logical order (exiting the loops)
 * but it'll look until it finds one and then ignore the rest of the catch blocks after.
 *
 **************************************************************************************************/
import java.util.*;

public class Workshop06{
    public static void main(String[] args){
        //main try-block
        try{
            //try-block2
            try{
                //try-block3
                try{
                    int arr[]= {1,2,3,4};
            	/* I'm trying to display the value of
            	 * an element which doesn't exist. The
            	 * code should throw an exception
            	 */
                    System.out.println(arr[10]);
                }catch(ArithmeticException e){
                    System.out.print("Arithmetic Exception");
                    System.out.println(" handled in try-block3");
                }
            }
            catch(ArithmeticException e){
                System.out.print("Arithmetic Exception");
                System.out.println(" handled in try-block2");
            }
        }
        catch(ArithmeticException e3){
            System.out.print("Arithmetic Exception");
            System.out.println(" handled in main try-block");
        }
        catch(ArrayIndexOutOfBoundsException e4){
            System.out.print("ArrayIndexOutOfBoundsException");
            System.out.println(" handled in main try-block");
        }
        catch(Exception e5){
            System.out.print("Exception");
            System.out.println(" handled in main try-block");
        }
    }

}
