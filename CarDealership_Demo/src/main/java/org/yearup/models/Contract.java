package org.yearup.models;

public abstract class Contract {

    private String date;
    private String customerName;
    private String email;
    private String vehicleSold;
    private double totalPrice;
    private double monthlyPayment;

    public Contract(String date, String customerName, String email, String vehicleSold, double totalPrice, double monthlyPayment)
    {
        this.date = date;
        this.customerName = customerName;
        this.email = email;
        this.vehicleSold =vehicleSold;
        this.totalPrice = totalPrice;
        this.monthlyPayment = monthlyPayment;
    }

    public String getDate() { return date; }

    public String getCustomerName() { return customerName; }

    public String getEmail() { return email; }

    public String getVehicleSold() { return vehicleSold; }

    public double getTotalPrice() { return totalPrice; }

    public double getMonthlyPayment() { return monthlyPayment; }

    public double getTotalPrice(double price) {}

    public double getMonthlyPayment(double price) {}
}
