package com.greenfox.bx;

/**
 * Created by regnisalram on 11/16/16.
 */
public class CreditCard implements CreditCardy{

    public int sumCvv;
    public String nameCardHolder;
    public String codeAccount;

    public CreditCard(int sumCvv, String nameCardHolder, String codeAccount) {

    }

    @Override
    public void setSumCVV(int sumCVV) {

    }

    @Override
    public int getSumCVV() {
        return 0;
    }

    @Override
    public void setNameCardholder(String nameCardholder) {
        this.nameCardHolder = nameCardholder;
    }

    @Override
    public String getNameCardholder() {
        return this.getNameCardholder();
    }

    @Override
    public void setCodeAccount(String codeAccount) {
        this.codeAccount = codeAccount;
    }

    @Override
    public String getCodeAccount() {
        return this.codeAccount;
    }

    @Override
    public int cumeSumCVV(String codeAccount) {
        return 0;
    }

    @Override
    public boolean ValidCard(String codeAccount, int sumCVV) {
        return true;
    }

    @Override
    public String toString() {
        return "CreditCard{}";
    }
}
