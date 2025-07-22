package entityclassassignment2;
import java.util.Scanner;
public class ProductMain {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Product[] products = new Product[4];

	        // Collect product details
	        for (int i = 0; i < 4; i++) {
	            System.out.println("Enter details for Product " + (i + 1));

	            System.out.print("Enter Product ID: ");
	            int id = scanner.nextInt();
	            scanner.nextLine(); // consume leftover newline

	            System.out.print("Enter Product Name: ");
	            String name = scanner.nextLine();

	            System.out.print("Enter Product Price: ");
	            double price = scanner.nextDouble();

	            products[i] = new Product(id, name, price);
	            System.out.println();
	        }

	        // Display all product details
	        System.out.println("Product Details:");
	        System.out.println("=====================");
	        for (Product product : products) {
	            product.display();
	        }

	        scanner.close();
	    }
	}



