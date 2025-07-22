package entityclassassignment1;
import java.util.Scanner;
public class StudentTest {
	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Student[] students = new Student[3];

	        for (int i = 0; i < 3; i++) {
	            System.out.println("Enter details for Student " + (i + 1));
	            System.out.print("Enter Roll No: ");
	            int rollNo = scanner.nextInt();
	            scanner.nextLine(); // consume newline

	            System.out.print("Enter Name: ");
	            String name = scanner.nextLine();

	            System.out.print("Enter Age: ");
	            int age = scanner.nextInt();

	            students[i] = new Student(rollNo, name, age);
	            System.out.println();
	        }

	        System.out.println("Student Details:");
	        System.out.println("==================");
	        for (Student student : students) {
	            student.displayStudentDetails();
	        }

	        scanner.close();
	    }
	}



