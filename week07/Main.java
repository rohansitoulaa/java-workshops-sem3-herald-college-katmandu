package week07;
import week07.Person;
import week07.Professor;
import week07.Address;
import week07.Student;

/**
 * This class calls all other classes for demonstration.
 */
public class Main{
		/**
		 * This 
		 * @param args 
		 */
		public static void main(String[] args) {
	        // Create Address for the student
	        Address studentAddress = new Address();
	        studentAddress.street = "123 Main St";
	        studentAddress.city = "Kathmandu";
	        studentAddress.state = "Bagmati";
	        studentAddress.postalCode = 44600;
	        studentAddress.country = "Nepal";

	        // Create Student object
	        Student student = new Student();
	        student.name = "John Doe";
	        student.phoneNumber = "9841234567";
	        student.emailAddress = "john.doe@example.com";
	        student.address = studentAddress;
	        student.studentNumber = 12345;
	        student.averageMark = 85;

	        // Display student details
	        System.out.println("Student Details:");
	        System.out.println("Name: " + student.name);
	        System.out.println("Phone: " + student.phoneNumber);
	        System.out.println("Email: " + student.emailAddress);
	        System.out.println("Address: " + student.address.street + ", " + student.address.city);
	        System.out.println("Student Number: " + student.studentNumber);
	        System.out.println("Average Mark: " + student.averageMark);
	        System.out.println("Seminars Taken: " + student.getSeminarsTaken());

	        // Check enrollment eligibility
	        System.out.println("Eligible to Enroll: " + student.isEligibleToEnroll("Yes"));

	        // Create Address for the professor
	        Address professorAddress = new Address();
	        professorAddress.street = "456 Elm St";
	        professorAddress.city = "Pokhara";
	        professorAddress.state = "Gandaki";
	        professorAddress.postalCode = 33700;
	        professorAddress.country = "Nepal";

	        // Create Professor object
	        Professor professor = new Professor();
	        professor.name = "Dr. Jane Smith";
	        professor.phoneNumber = "9812345678";
	        professor.emailAddress = "jane.smith@example.com";
	        professor.address = professorAddress;
	        professor.Salary = 120000.50;
	        professor.staffNumber = 9876;
	        professor.setYearsOfServices(15);
	        professor.numberOfClasses = 4;

	        // Display professor details
	        System.out.println("\nProfessor Details:");
	        System.out.println("Name: " + professor.name);
	        System.out.println("Phone: " + professor.phoneNumber);
	        System.out.println("Email: " + professor.emailAddress);
	        System.out.println("Address: " + professor.address.street + ", " + professor.address.city);
	        System.out.println("Salary: " + professor.Salary);
	        System.out.println("Staff Number: " + professor.staffNumber);
	        System.out.println("Years of Service: " + professor.getYearsOfServices());
	        System.out.println("Number of Classes: " + professor.numberOfClasses);
	    }
	}
