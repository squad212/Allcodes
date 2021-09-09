package com.humana.dhp.dhppocs.hhh.company.DataTransferObject;
//destination program which receives the information

public class LoanManager {
    //    public boolean loanProcessor(LoanApplication la){
//        return true;
    public LoanStatus loanProcessor(LoanApplication la)
    {
        System.out.println(la.getAddress());
        System.out.println(la.getFirstName());
        System.out.println(la.getLastName());
        LoanStatus ls = new LoanStatus();
        ls.setLoanApproved(true);
        ls.setInterestRate(3);
        return ls;

    }
}
