/**
 * Created by regnisalram on 12/4/16.
 */
public class SavingsAccount extends Account {

    public double interest; // ex: 0.06 (6%)

    public SavingsAccount(int accountNum) {
        super(accountNum);
    }

    public double addInterest() {
        return this.getBalance() * (1 + interest);
    }
}
