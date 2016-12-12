/**
 * Created by regnisalram on 12/4/16.
 */
public class App {

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.add(new SavingsAccount(01));
        bank.add(new SavingsAccount(02));
        bank.add(new SavingsAccount(03));
        bank.add(new CurrentAccount(11));
        bank.add(new CurrentAccount(12));
        bank.add(new CurrentAccount(13));
    }
}
