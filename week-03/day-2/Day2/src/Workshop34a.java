/**
 * Created by regnisalram on 11/3/16.
 */
public class Workshop34a {
    public static void main(String[] args) {
        // Write a program that prints the numbers from 1 to 100.
        // But for multiples of three print "Fizz" instead of the number
        // and for the multiples of five print "Buzz".
        // For numbers which are multiples of both three and five print "FizzBuzz".
        String out = "";
        for (int i = 1; i <= 100; i++) {
            out = "";
            if (i % 3 == 0) {
                out += "Fizz";
            }
            if (i % 5 == 0) {
                out += "Buzz";
            }
            if (out == "") {
                out += i;
            }
            System.out.println(out);
        }


    }
}