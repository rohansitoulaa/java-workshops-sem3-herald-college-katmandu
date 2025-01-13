package week08;

interface StudentInfo {
    void name();
    void age();
    void studentId();
}

interface StudentRecords {
    void attendance();
    void grades();
    void subjects();
}

public class StudentManagementSystem implements StudentInfo, StudentRecords {
    private String name;
    private int age;
    private String studentId;
    private int attendanceDays;
    private int[] grades;
    private String[] subjects;
    
    //getter setter methods for name and ages;
    void setName(String name) {
    	this.name = name;
    }
    String getName() {
    	return this.name;
    }
    
    void setAge(int age) {
    	this.age = age;
    }
    int getAge() {
    	return this.age;
    }

    // Constructor declaration
    public StudentManagementSystem(String name, int age, String studentId, int attendanceDays, int[] grades, String[] subjects) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        this.attendanceDays = attendanceDays;
        this.grades = grades;
        this.subjects = subjects;
    }

    @Override
    public void name() {
        System.out.println("Name: " + name);
    }

    @Override
    public void age() {
        System.out.println("Age: " + age);
    }

    @Override
    public void studentId() {
        System.out.println("Student ID: " + studentId);
    }

    @Override
    public void attendance() {
        System.out.println("Attendance Days: " + attendanceDays);
    }

    @Override
    public void grades() {
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Grades in: "+subjects[i] + ": " + grades[i]);
        }
    }

    @Override
    public void subjects() {
        System.out.print("Subjects: ");
        for (String subject : subjects) {
            System.out.print(subject + " ");
        }
        System.out.println("\n");
    }
}
