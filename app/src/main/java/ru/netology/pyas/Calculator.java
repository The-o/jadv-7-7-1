package ru.netology.pyas;

public class Calculator {

    private double creditAmount;
    private double interestPercentPerYear;
    private int loanTermIntMonth;

    public Calculator(double creditAmount, double interestPercentPerYear, int loanTermIntMonth) {
        this.creditAmount = creditAmount;
        this.interestPercentPerYear = interestPercentPerYear;
        this.loanTermIntMonth = loanTermIntMonth;
    }

    public double monthlyPayment() {
        double interestRatePerMonth = interestPercentPerYear/12/100;
        return creditAmount * (interestRatePerMonth + interestRatePerMonth/(Math.pow(1 + interestRatePerMonth, loanTermIntMonth)-1));
    }

    public double refundableAmount() {
        return monthlyPayment() * loanTermIntMonth;
    }

    public double overpaymentSize() {
        return refundableAmount() - creditAmount;
    }
}
