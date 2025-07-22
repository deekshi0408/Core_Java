package entityclassassignment1;
import java.util.Scanner;
public class Student {
	
	    private int rollNo;
	    private String name;
	    private int age;

	    // Constructor
	    public Student(int rollNo, String name, int age) {
	        this.rollNo = rollNo;
	        this.name = name;
	        this.age = age;
	    }

	    // Getter Methods
	    public int getRollNo() {
	        return rollNo;
	    }

	    public String getName() {
	        return name;
	    }

	    public int getAge() {
	        return age;
	    }

	    // Method to display student details
	    public void displayStudentDetails() {
	        System.out.println("Roll No: " + rollNo);
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("-------------------------");
	    }
	}



