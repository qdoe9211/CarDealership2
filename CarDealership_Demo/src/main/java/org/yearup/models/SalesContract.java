package org.yearup.models;

public class SalesContract extends Contract {

    private double salesTax = .5;
    private int recordingFee = 100;
    private int processingFee;
    private boolean finance;

    public SalesContract(String date, String customerName, String email, String vehicleSold, double totalPrice, double monthlyPayment) {
        super(date, customerName, email, vehicleSold, totalPrice, monthlyPayment);
    }

    public int getProcessingFee(double amount)
    {
        if (amount < 10000) {
            return 295;
        } else {
            return 495;
        }
    }

    public boolean getIsFinance() {
        if (true) {
            return finance;
        } else {
            return false;
        }
    }

    @Override
    public double getTotalPrice(double price) {
        return totalPrice;
    }


    @Override
    public double getMonthlyPayment(double price) {
        double monthlyPayment = price;
        if (isFinance == true && price >= 10000) {
            int processingFee = getProcessingFee(price);
            monthlyPayment += processingFee;
        }
        return monthlyPayment;


    }
}
