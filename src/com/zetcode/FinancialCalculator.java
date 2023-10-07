package com.zetcode;

public class FinancialCalculator {
    int principal;
    double interestRate;
    int loanLength;

    public FinancialCalculator(int principal, double interest, int loanLength){
        this.principal = principal;
        this.interestRate = interest;
        this.loanLength = loanLength;

    }
    public double monthlyPayment(){
        double monthlyInterestRate = interestRate / 12 / 100;
        double exponentCalculation = (Math.pow((1 + monthlyInterestRate), loanLength));
        double interestTimesExpCalc = monthlyInterestRate * (exponentCalculation);
        double numerator = principal * interestTimesExpCalc;
        double denominator = exponentCalculation - 1;
        return numerator / denominator;
    }
    public double totalInterestPaid(double monthlyPayment){
        return (monthlyPayment * loanLength) - principal;
    }
}
