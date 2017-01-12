package com.bhushan.Java.Polymorphism;

/**
 * Created by bhushan on 1/1/17.
 */
public class SalariedEmployee extends Employee {

    private double weeklySalary;

    protected SalariedEmployee(String firstName, String lastName, String ssn, double weeklySalary) {
        super(firstName, lastName, ssn);

        if(weeklySalary < 0.0)
            throw new IllegalArgumentException("Weekly salary must be above 0.0");

        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double earnings() {
        return getWeeklySalary();
    }

    @Override
    public String toString() {
        return String.format("%s Weekly: %f", super.toString(), getWeeklySalary());
    }

    @Override
    public double getPaymentAmount() {
        return getWeeklySalary();
    }
}
