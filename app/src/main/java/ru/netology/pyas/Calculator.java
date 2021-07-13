package ru.netology.pyas;

public class Calculator {

    private double creditAmount;
    private double interestRatePerYear;
    private int loanTermIntMonth;

    public Calculator(double creditAmount, double interestRatePerYear, int loanTermIntMonth) {
        this.creditAmount = creditAmount;
        this.interestRatePerYear = interestRatePerYear;
        this.loanTermIntMonth = loanTermIntMonth;
    }

    public double monthlyPayment() {
        return 0;
    }

    public double refundableAmount() {
        return 0;
    }

    public double overpaymentSize() {
        return 0;
    }
}
