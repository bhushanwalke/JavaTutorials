package com.bhushan.Java.Polymorphism;

/**
 * Created by bhushan on 1/1/17.
 */
public class HourlyEmployee extends Employee {

    private double wage;
    private double hours;

    protected HourlyEmployee(String firstName, String lastName, String ssn, double wage, double hours) {
        super(firstName, lastName, ssn);

        this.wage = wage;
        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public double earnings() {
        if (getHours() <= 40)
            return getWage() * getHours();
        else
        return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
    }

    @Override
    public double getPaymentAmount() {
        if (getHours() <= 40)
            return getWage() * getHours();
        else
            return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
    }

    @Override
    public String toString() {
        return String.format("%s HourlyWage: %f Hours: %f", super.toString(), getWage(), getHours());
    }
}
