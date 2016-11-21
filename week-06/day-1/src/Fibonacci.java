/**
 * Created by regnisalram on 11/21/16.
 */
public class Fibonacci {

    public static int fibonacci(Integer number) {
            if(number <= 1){
                return number;
            }
            int fibo = 1;
            int fiboPrev = 1;
            for(int i = 2; i < number; ++i){
                int temp = fibo;
                fibo += fiboPrev;
                fiboPrev = temp;
            }
            return fibo;
        }

    public static void main(String[] args) {
        System.out.println(fibonacci(Integer.valueOf("bla")));
    }
}
