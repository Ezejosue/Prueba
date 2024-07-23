/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba.test_ventas;

import com.mycompany.prueba.ventas.Customer;
import com.mycompany.prueba.ventas.Order;
import com.mycompany.prueba.ventas.PaymentType;
import com.mycompany.prueba.ventas.Product;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class UserInteraction {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the customer's name: ");
        String customerName = scanner.nextLine();

        System.out.print("Enter the payment type (1 for CASH, 2 for CREDIT): ");
        int paymentTypeInt = scanner.nextInt();
        PaymentType paymentType = (paymentTypeInt == 1) ? PaymentType.CASH : PaymentType.CREDIT;

        Customer customer = new Customer(customerName, paymentType);

        Order order = new Order(customer);

        boolean addMoreProducts = true;
        scanner.nextLine();
        while (addMoreProducts) {
            System.out.print("Enter the product name: ");
            String productName = scanner.nextLine();

            System.out.print("Enter the product price: ");
            double productPrice = scanner.nextDouble();
            scanner.nextLine();

            Product product = new Product(productName, productPrice);
            order.addProduct(product);

            System.out.print("Do you want to add another product? (yes/no): ");
            String response = scanner.nextLine();
            addMoreProducts = response.equalsIgnoreCase("yes");
        }
        System.out.println("-------------------------------------");
        order.showOrder();
        scanner.close();
    }
}
