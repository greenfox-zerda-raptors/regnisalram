/**
 * Created by regnisalram on 11/3/16.
 */
public class MoneyMoneyMoney {
    public static void main(String... args) {
        System.out.println(calculateYears(1000,0.05,0.18,1000));
    }
    public static int calculateYears ( double principal, double interest, double tax, double desired){

//        assertEquals(3, Money.calculateYears(1000,0.05,0.18,1100));
//        assertEquals(14 , Money.calculateYears(1000,0.01625,0.18,1200));
//        assertEquals(0, Money.calculateYears(1000,0.05,0.18,1000));

            int y = 0;
            while (principal < desired) {
                principal = (principal * (interest + 1)) - ((principal * interest) * tax);
                y++;
            }
            return y;
    }

}