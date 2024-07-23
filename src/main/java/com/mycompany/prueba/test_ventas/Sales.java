/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba.test_ventas;
import com.mycompany.prueba.ventas.*;
/**
 *
 * @author PC
 */
public class Sales {
      public static void main(String[] args) {
        Customer customer1 = new Customer("John Doe", PaymentType.CASH);
        Customer customer2 = new Customer("Jane Smith", PaymentType.CREDIT);

        Product product1 = new Product("Laptop", 1200.00);
        Product product2 = new Product("Smartphone", 800.00);
        Product product3 = new Product("Tablet", 300.00);

        Order order1 = new Order(customer1);
        order1.addProduct(product1);
        order1.addProduct(product2);

        Order order2 = new Order(customer2);
        order2.addProduct(product3);

        order1.showOrder();
        order2.showOrder();
    }
}
