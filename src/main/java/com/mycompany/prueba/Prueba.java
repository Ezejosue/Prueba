/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.prueba;

import com.mycompany.prueba.ventas.*;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Prueba {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean createMoreOrders = true;

        while (createMoreOrders) {
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

            System.out.print("Do you want to create another order? (yes/no): ");
            String response = scanner.nextLine();
            createMoreOrders = response.equalsIgnoreCase("yes");
        }

        scanner.close();
    }
}
