import java.util.*;
import java.io.*;

class OutOfStockException extends Exception {
    OutOfStockException(String message) {
        super(message);
    }
}

class Product {
    String name;
    int stock;

    Product(String name, int stock) {
        this.name = name;
        this.stock = stock;
    }

    void purchase(int quantity)
            throws OutOfStockException {

        if (quantity > stock) {
            throw new OutOfStockException(
                "Product Out of Stock! Available stock: "
                + stock);
        }

        stock -= quantity;

        System.out.println("Purchase Successful");
        System.out.println("Remaining Stock: " + stock);
    }
}

public class System {
    public static void main(String[] args) {

        Product p = new Product("Laptop", 5);

        try {
            p.purchase(10);
        }
        catch (OutOfStockException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("General Error: "
                    + e.getMessage());
        }
    }
}