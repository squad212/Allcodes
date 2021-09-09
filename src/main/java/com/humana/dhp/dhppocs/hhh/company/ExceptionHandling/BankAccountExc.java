package com.humana.dhp.dhppocs.hhh.company.ExceptionHandling;

public class BankAccountExc {

    public void withdraw(int withdrawnAmount) throws InsufficientFund {
        int balance = 100;

        if (balance < withdrawnAmount){
            InsufficientFund isf= new InsufficientFund
                    ("Please withdraw money less than " + balance);
            throw isf;
        }
    }
}
