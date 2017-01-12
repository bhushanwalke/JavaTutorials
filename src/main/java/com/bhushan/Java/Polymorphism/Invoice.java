package com.bhushan.Java.Polymorphism;

/**
 * Created by bhushan on 1/2/17.
 */
public class Invoice implements Payable {

    private final String partNumber;
    private final String partDescription;
    private int quantity;
    private double pricePerItem;

    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    @Override
    public double getPaymentAmount() {
        return getQuantity() * getPricePerItem();
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s", getPartNumber(), getPartDescription(), getQuantity(), getPricePerItem());
    }
}
