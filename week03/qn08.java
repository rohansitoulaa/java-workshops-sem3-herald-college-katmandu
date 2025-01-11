package week03;
import java.io.*;
import java.util.*;


class Students {
    private int id;
    private String name;
    private int age;
    private char grade;

    public Students(int id, String name, int age, char grade) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String toCSV() {
        return id + "," + name + "," + age + "," + grade;
    }
}
public class qn08 {
	 public static void main(String[] args) {
	        try (Scanner scanner = new Scanner(System.in)) {
				System.out.print("Enter  ID: ");
				int id = scanner.nextInt();
				scanner.nextLine();

				System.out.print("Enter  Name: ");
				String name = scanner.nextLine();

				System.out.print("Enter age: ");
				int age = scanner.nextInt();

				System.out.print("Enter Grade : ");
				char grade = scanner.next().charAt(0);

				Students student = new Students(id, name, age, grade);

				try {
					System.out.println("try block");
						FileWriter myWriter = new FileWriter("students.csv");
						try (BufferedWriter writer = new BufferedWriter(myWriter)) {
							System.out.println("Inner try block");
							writer.write(student.toCSV());
//							writer.write(2);
							writer.newLine();
							writer.close();
						}
						myWriter.close();
						System.out.println("saved to students.csv");
				}
					catch (IOException e) {
				    System.out.println("Unable to insert data");
				    e.printStackTrace();
				}
			}
	    }
}
