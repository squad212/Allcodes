package com.humana.dhp.dhppocs.hhh.company.ExceptionHandling;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccountExc bae= new BankAccountExc();
        try {
            bae.withdraw(1000);
        } catch (InsufficientFund insufficientFund) {
            insufficientFund.printStackTrace();
        }

    }
}
