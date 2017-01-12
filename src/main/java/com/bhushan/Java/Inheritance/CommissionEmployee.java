package com.bhushan.Java.Inheritance;

/**
 * Created by bhushan on 1/1/17.
 */
public class CommissionEmployee {

    private final String firstName;
    private final String lastName;
    private final String ssn;
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName, String ssn, double grossSales, double commissionRate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSsn() {
        return ssn;
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
        return commissionRate * grossSales;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %d %d", firstName, lastName, ssn, grossSales, commissionRate);
    }
}
