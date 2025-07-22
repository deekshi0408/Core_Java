package entityclassassignment2;
import java.util.Scanner;
public class Product {
	int productId;
    String productName;
    double productPrice;

    // Constructor
    public Product(int productId, String productName, double productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    // Method to display product details
    public void display() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Product Price: ₹" + productPrice);
        System.out.println("------------------------");
    }
}
	



