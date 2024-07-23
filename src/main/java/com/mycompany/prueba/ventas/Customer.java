/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba.ventas;

/**
 *
 * @author PC
 */
public class Customer {

    private int customerId;
    private String customerName;
    private PaymentType paymentType;
    private static int customerCounter;

    public Customer(String customerName, PaymentType paymentType) {
        this.customerId = ++customerCounter;
        this.customerName = customerName;
        this.paymentType = paymentType;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    @Override
    public String toString() {
        return "Customer ID: " + customerId
                + ", Name: " + customerName
                + ", Payment Type: " + paymentType;
    }
}
