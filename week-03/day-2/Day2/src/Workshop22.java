/**
 * Created by regnisalram on 11/2/16.
 */
public class Workshop22{
    public static void main(String... args){
        String first = "I am the first string!";
        String second = "I think I'm longer than first..";
        // Decide if "first" string is longer than "second" string and store it in a variable
        // Print the value of the variable
        boolean isLonger = first.length() > second.length();

        System.out.println(isLonger);
    }
}