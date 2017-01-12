package com.bhushan.Java.Polymorphism;

/**
 * Created by bhushan on 1/1/17.
 */
public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String ssn, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, ssn, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public double earnings() {
        return super.earnings() + getBaseSalary();
    }

    @Override
    public double getPaymentAmount() {
        return super.getPaymentAmount() + getBaseSalary();
    }

    @Override
    public String toString() {
        return String.format("%s BasePlusCommission: %f", super.toString(), getBaseSalary());
    }
}
