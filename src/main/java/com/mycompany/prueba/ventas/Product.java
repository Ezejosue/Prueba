/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba.ventas;

/**
 *
 * @author PC
 */
public class Product {

    private int productId;
    private String productName;
    private double price;
    private static int productCounter;

    public Product(String productName, double price) {
        this.productId = ++productCounter;
        this.productName = productName;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product ID: " + productId
                + ", Name: " + productName
                + ", Price: $" + price;
    }
}
