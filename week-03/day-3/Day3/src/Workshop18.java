import java.util.Arrays;

/**
 * Created by regnisalram on 11/6/16.
 */
public class Workshop18{
    public static void main(String[] args) {
        // write a function that sum all the numbers until the given parameter
        int i = 5;
        System.out.println(sumOfNumbers(i));
    }
    public static int sumOfNumbers (int indexUntil) {
        int[] numbers = new int[indexUntil];
        for (int i = 0; i < indexUntil; i++) {
            numbers[i] = i + 1;
        }
        System.out.println(Arrays.toString(numbers));
        // this is just to check that it printed the right array

        int sum = 0;
        for (int j = 0; j < numbers.length; j++) {
            sum += numbers[j];
        }
        return sum;
    }
}
