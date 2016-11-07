/**
 * Created by regnisalram on 11/6/16.
 */
public class Workshop22{
    public static void main(String... args) {
        // create a function which prints the input String parameters (can have multiple number of arguments)

        printing("bla", "blabla", "blablabla");
    }

    public static void printing(String... input) {
        for(String s : input) {
            System.out.println(s);
//            System.out.println(input);
        }
    }

}