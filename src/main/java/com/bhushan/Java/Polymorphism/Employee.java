package com.bhushan.Java.Polymorphism;

/**
 * Created by bhushan on 1/1/17.
 */
public abstract class Employee implements Payable {

    private final String firstName;
    private final String lastName;
    private final String ssn;

    protected Employee(String firstName, String lastName, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
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

    @Override
    public String toString() {
        return String.format("%s %s %s", getFirstName(), getLastName(), getSsn());
    }

    public abstract double earnings();
}
