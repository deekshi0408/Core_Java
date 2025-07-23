package Assignment2.entity;

public class Assignment2 {
	

	    // Part 1: Student class with default constructor
	    static class Student {
	        Student() {
	            System.out.println("Student object is created");
	        }
	    }

	    // Part 2: Commission class
	    static class Commission {
	        String name;
	        String address;
	        String phone;
	        double salesAmount;

	        // Method to accept details (for simplicity, using parameters instead of Scanner input)
	        void acceptDetails(String name, String address, String phone, double salesAmount) {
	            this.name = name;
	            this.address = address;
	            this.phone = phone;
	            this.salesAmount = salesAmount;
	        }

	        // Method to calculate and display commission
	        void calculateCommission() {
	            double commission;
	            if (salesAmount >= 100000) {
	                commission = 0.10 * salesAmount;
	            } else if (salesAmount >= 50000) {
	                commission = 0.05 * salesAmount;
	            } else if (salesAmount >= 30000) {
	                commission = 0.03 * salesAmount;
	            } else {
	                commission = 0.0;
	            }

	            System.out.println("\n--- Commission Details ---");
	            System.out.println("Name: " + name);
	            System.out.println("Address: " + address);
	            System.out.println("Phone: " + phone);
	            System.out.println("Sales Amount: " + salesAmount);
	            System.out.println("Commission: " + commission);
	        }
	    }

	    // Main method
	    public static void main(String[] args) {
	        // Creating Student object (default constructor)
	        Assignment2 student = new Assignment2();

	        // Creating Commission object
	        Commission emp = new Commission();
	        emp.acceptDetails("Ravi", "Chennai", "9876543210", 65000);  // Example data
	        emp.calculateCommission();
	    }
	}


