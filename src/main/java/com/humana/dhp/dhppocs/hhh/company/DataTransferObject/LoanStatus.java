package com.humana.dhp.dhppocs.hhh.company.DataTransferObject;

public class LoanStatus {
    boolean loanApproved;
    int interestRate;

    public boolean isLoanApproved() {
        return loanApproved;
    }

    public void setLoanApproved(boolean loanApproved) {
        this.loanApproved = loanApproved;
    }

    public int getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(int interestRate) {
        this.interestRate = interestRate;
    }

}
