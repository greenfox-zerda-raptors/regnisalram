/**
 * Created by regnisalram on 11/3/16.
 */
public class Workshop29{
    public static void main(String[] args) {
        int ab = 123;
        int credits = 100;
        boolean isBonus = false;
        // if credits are at least 50,
        // and is_bonus is False decrement ab by 2
        // if credits are smaller than 50,
        // and is_bonus is False decrement ab by 1
        // if is_bonus is True ab should remain the same
        if (!isBonus) {
            if (50 <= credits) {
                ab -= 2;
            } else if (credits < 50) {
                ab--;
            }
        }

        System.out.println(ab);
    }
}
