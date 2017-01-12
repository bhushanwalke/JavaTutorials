package com.bhushan.Java.Polymorphism;

/**
 * Created by bhushan on 1/1/17.
 */
public class CommissionEmployee extends Employee {

    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName, String ssn, double grossSales, double commissionRate) {
        super(firstName, lastName, ssn);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public double earnings() {
        return getCommissionRate() * getGrossSales();
    }

    @Override
    public double getPaymentAmount() {
        return getCommissionRate() * getGrossSales();
    }

    public String toString() {
        return String.format("%s CommissionRate: %f GrossSale: %f", super.toString(), getCommissionRate(), getGrossSales());
    }
}
