package com.zetcode;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the principal");
        int principal = scanner.nextInt();

        System.out.println("Enter the interest rate: ");
        double interestRate = scanner.nextDouble();

        System.out.println("Enter the loan length:");
        int loanLength = scanner.nextInt();


        FinancialCalculator calculator =
                new FinancialCalculator(principal, interestRate, loanLength);

        System.out.printf("Your monthly payment is " + String.format("%.2f", calculator.monthlyPayment()));
        System.out.println(" ");
        System.out.printf("Your total interest paid is " + String.format("%.2f", calculator.totalInterestPaid(calculator.monthlyPayment())));

}
}