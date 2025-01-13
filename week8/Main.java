package week08;

public class Main {
	public static void main(String[] args) {
		String[] subjects = {"NMC", "OODP", "AI"};
        int[] grades = {85, 90, 78};
        StudentManagementSystem student = new StudentManagementSystem("Rohan", 20, "2408887", 180, grades, subjects);

        GradeCalculator Avggrades = new GradeCalculator(grades);
        student.name();
        student.age();
        student.studentId();
        student.attendance();
        student.grades();
        Avggrades.calculateAverage();
        student.subjects();
	}
}
