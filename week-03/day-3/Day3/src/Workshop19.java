/**
 * Created by regnisalram on 11/6/16.
 */
public class Workshop19 {
    // create a function that returns it's input factorial
    public static void main(String[] args) {
        int bla = 5;
        System.out.println(factorial(bla));
    }

    public static int factorial(int input) {
        int out = 1;
        for (int i = input; i > 0; i--) {
            out *= i;
        }
        return out;
    }
}
