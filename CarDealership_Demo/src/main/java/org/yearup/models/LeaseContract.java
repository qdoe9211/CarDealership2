package org.yearup.models;

public class LeaseContract extends Contract {

    private double endingValue;

    private double leaseFee;

    public LeaseContract(String date, String customerName, String email, String vehicleSold, double totalPrice, double monthlyPayment) {
        super(date, customerName, email, vehicleSold, totalPrice, monthlyPayment);
    }

    public double getEndingValue() { return endingValue; }

    public double getLeaseFee() { return leaseFee; }



}
