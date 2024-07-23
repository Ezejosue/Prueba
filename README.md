
# Sales Order Management System

This is a simple console-based application in Java that demonstrates object-oriented programming principles. The application allows users to create customers, add products, and generate sales orders. 

## Project Structure

The project is divided into two packages:
- `ventas`: Contains the main classes (`Order`, `Product`, `Customer`, `PaymentType`).
- `testVentas`: Contains the classes for testing the application (`Sales`, `UserInteraction`).

## Classes

### ventas Package

- **Product**
  - Fields: `productId`, `productName`, `price`, `productCounter`
  - Methods: Constructor, getters, setters, `toString()`

- **Customer**
  - Fields: `customerId`, `customerName`, `paymentType`, `customerCounter`
  - Methods: Constructor, getters, setters, `toString()`

- **PaymentType**
  - Enum: `CASH`, `CREDIT`

- **Order**
  - Fields: `orderId`, `products`, `customer`, `date`, `orderCounter`, `productCounter`, `MAX_PRODUCTS`
  - Methods: Constructor, `addCustomer()`, `addProduct()`, `calculateTotal()`, `showOrder()`

### testVentas Package

- **Sales**
  - Contains the `main` method to execute the application with predefined customers and products.
  
- **UserInteraction**
  - Contains the `main` method to interact with the user, allowing dynamic addition of customers and products to the order.

## How to Run

1. **Clone the repository**
    ```sh
    git clone <repository_url>
    ```

2. **Navigate to the project directory**
    ```sh
    cd <project_directory>
    ```

3. **Compile the project**
    ```sh
    javac -d bin src/ventas/*.java src/testVentas/*.java
    ```

4. **Run the application**
    - To run the predefined test:
        ```sh
        java -cp bin testVentas.Sales
        ```
    - To run the user interaction test:
        ```sh
        java -cp bin testVentas.UserInteraction
        ```

## Example Output

### Predefined Test (`Sales` Class)

```
Order #1
Customer: Customer ID: 1, Name: John Doe, Payment Type: CASH
Date: 18/07/2024 15:16:49
Products:
  - Product ID: 1, Name: Laptop, Price: $1200.0
  - Product ID: 2, Name: Smartphone, Price: $800.0
Total: $2000.0
```

### User Interaction Test (`UserInteraction` Class)

```
Enter the customer's name: Josue
Enter the payment type (1 for CASH, 2 for CREDIT): 2
Enter the product name: Vick
Enter the product price: 0.75
Do you want to add another product? (yes/no): yes
Enter the product name: Aceta
Enter the product price: 22
Do you want to add another product? (yes/no): no
-------------------------------------
Order #1
Customer: Customer ID: 1, Name: Josue, Payment Type: CREDIT
Date: 18/07/2024 15:48:46
Products:
  - Product ID: 1, Name: Vick, Price: $0.75
  - Product ID: 2, Name: Aceta, Price: $22.0
Total: $22.75
```

## Notes

- This project is for educational purposes to demonstrate basic POO concepts in Java.
- Feel free to extend the project by adding more features or improving the existing code.

