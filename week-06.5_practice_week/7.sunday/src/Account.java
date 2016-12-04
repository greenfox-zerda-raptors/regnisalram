/**
 * Created by regnisalram on 12/4/16.
 */
/**
 A class for bank accounts.

 This class provides the basic functionality of accounts.
 It allows deposits and withdrawals but not overdraft
 limits or interest rates.
 @author Stuart Reynolds ... 1999
 */

public abstract class Account {

    private double balance;  //The current balance
    private int accountNum;  //The account number


    public Account(int accountNum) {
        balance = 0.0;
        this.accountNum = accountNum;
    }

    public void deposit(double amountAdded) {
        if (amountAdded > 0)
            balance += amountAdded;
        else
            System.out.println("Account.deposit(...): " + "cannot deposit negative amount.");
    }

    public void withdraw(double amountWithdrawn) {
        if (amountWithdrawn > 0)
            balance -= amountWithdrawn;
        else
            System.out.println("Account.withdraw(...): " + "cannot withdraw negative amount.");
    }

    public double getBalance() {
        return balance;
    }

    public double getAccountNumber() {
        return accountNum;
    }

    @Override
    public String toString() {
        return "Acc " + accountNum + ": " + "balance = " + balance;
    }

    public final void print() {
        //Don't override this,
        //override the toString method
        System.out.println(toString());
    }

}
