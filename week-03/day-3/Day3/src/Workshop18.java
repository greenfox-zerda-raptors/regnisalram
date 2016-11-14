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
//  old solution with creating an array first.
//        int[] numbers = new int[indexUntil];
//        for (int i = 0; i < indexUntil; i++) {
//            numbers[i] = i + 1;
//        }
//        System.out.println(Arrays.toString(numbers));  [1, 2, 3, 4, 5]
//        // this is just to check that it printed the right array

//        int sum = 0;
//        for (int j = 0; j < numbers.length; j++) {
//            sum += numbers[j];
//        }
//        return sum;

        int sum = 0;
        for (int j = 1; j < indexUntil + 1; j++) {
            sum += j;
        }
        return sum;
    }
}