/**
 * Created by regnisalram on 11/6/16.
 */
public class Workshop21{
    public static void main(String[] args) {
        // create a recursive function that returns it's input factorial
        int bla = 5;
        System.out.println(factorial(bla));
    }
    public static int factorial (int fact) {
        if (fact == 0) {
            fact = 1;
        } else {
            fact *= factorial(fact - 1);
        }

        return fact;
    }
}