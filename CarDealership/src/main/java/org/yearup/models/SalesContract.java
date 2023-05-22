package org.yearup.models;

public class SalesContract extends Contract {

    private double salesTax = 0.05;
    private int recordingFee = 100;
    private int processingFee;
    private boolean finance;

    public SalesContract(String date, String customerName, String email, String vehicleSold, double totalPrice, double monthlyPayment) {
        super(date, customerName, email, vehicleSold, totalPrice, monthlyPayment);
        this.processingFee = getProcessingFee(totalPrice);
    }

    public int getProcessingFee(double amount) {
        if (amount < 10000) {
            return 295;
        } else {
            return 495;
        }
    }

    public double getSalesTax() {
        return getTotalPrice() * salesTax;
    }

    public boolean isFinance() {
        return finance;
    }

    @Override
    public double getMonthlyPayment(double price) {
        double monthlyPayment = price;
        if (finance == true && price >= 10000) {
            monthlyPayment = getTotalPrice() * 0.0425;
        } else {
            monthlyPayment = getTotalPrice() * 0.0525;
        }
        return monthlyPayment;
    }

    @Override
    public double getTotalPrice(double price) {
        double totalPrice = getMonthlyPayment() + price + recordingFee + processingFee;

        if (finance) {
            totalPrice += getMonthlyPayment() * 48;
            } else {
            totalPrice += getMonthlyPayment() * 24;
        }
        return totalPrice;
    }
}
