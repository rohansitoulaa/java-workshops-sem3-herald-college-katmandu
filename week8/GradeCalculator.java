package week08;

public class GradeCalculator {
	int[] grades;
	public GradeCalculator(int[] grades) {
	 this.grades = grades;
	}
    public void calculateAverage() {
        if (grades.length == 0) {
            System.out.println("No grades available.");
            return;
        }
        int total = 0;
        for (int grade : grades) {
            total += grade;
        }
        double average = (double) total / grades.length;
        System.out.printf("Average Grade: %.2f\n", average);
    }
}
