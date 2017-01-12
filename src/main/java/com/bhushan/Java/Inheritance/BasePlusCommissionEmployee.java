package com.bhushan.Java.Inheritance;

/**
 * Created by bhushan on 1/1/17.
 */
public class BasePlusCommissionEmployee extends CommissionEmployee {

    private double baseSalary;

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public BasePlusCommissionEmployee(String firstName, String lastName, String ssn,
                                      double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, ssn, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }

    public double earnings() {
        return baseSalary + super.earnings();
    }

    public String toString() {
        return String.format("%s %s %s %d %d %d", getFirstName(), getLastName(), getSsn(),
                getCommissionRate(), getGrossSales(), baseSalary);
    }
}
