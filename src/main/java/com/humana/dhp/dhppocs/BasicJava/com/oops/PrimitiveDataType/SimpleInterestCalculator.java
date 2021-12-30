package com.humana.dhp.dhppocs.BasicJava.com.oops.PrimitiveDataType;

import java.math.BigDecimal;

public class SimpleInterestCalculator {
    private BigDecimal principal;
    private BigDecimal interestRate;

    public SimpleInterestCalculator(String principal, String interestRate) {
        this.principal=new BigDecimal(principal);
        this.interestRate= new BigDecimal(interestRate).divide(BigDecimal.valueOf(100));
    }

    public BigDecimal calculateTotalValue(int time) {
        BigDecimal timeBigDecimal = new BigDecimal(time);
       // total value = principal + principal*interestRate * time
        BigDecimal totalValue = principal.add(principal.multiply(interestRate).multiply(BigDecimal.valueOf(time)));
        return totalValue;
    }


//    public SimpleInterestCalculator(String principal, String interestRate) {
//        this.principal = new BigDecimal(principal);
//        this.interestRate = new BigDecimal(interestRate).divide(new BigDecimal(100));
//    }

//    public SimpleInterestCalculator(BigDecimal principal, BigDecimal interestRate) {
//        this.principal = principal;
//        this.interestRate = interestRate;
//    }

//    public BigDecimal calculateTotalValue(int time) {
//        BigDecimal timeBigDecimal = new BigDecimal(time);
//       // total value = principal + principal*interestRate * time
//        BigDecimal totalValue  = principal.add(principal.multiply(interestRate).multiply(timeBigDecimal));
//        return totalValue;
//    }
}
