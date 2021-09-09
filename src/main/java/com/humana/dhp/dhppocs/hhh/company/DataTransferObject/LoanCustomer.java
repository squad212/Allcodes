package com.humana.dhp.dhppocs.hhh.company.DataTransferObject;

//source program which will pass the information

public class LoanCustomer {
    public static void main(String[] args) {
        LoanManager lm = new LoanManager();
        LoanApplication la = new LoanApplication();
        la.setAddress("122 street");
        la.setAge(21);
        la.setFirstName("saroj");
        la.setLastName("kc");
        la.setApplicantNumber(4567);
        la.setSsn(678900);
        //Method handling
//        LoanStatus lstat = lm.loanProcessor(la);
//        System.out.println(lstat.getInterestRate());
//        System.out.println(lstat.isLoanApproved());

    }
}
