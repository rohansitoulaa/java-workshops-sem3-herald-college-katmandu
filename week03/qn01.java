package week03;
class Student {
    private int id;
    private String name;
    private int age;
    private char grade;

    // Constructor
    public Student(int id, String name, int age, char grade) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Getter and Setter for id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        if (grade >= 'A' && grade <= 'F') {
            this.grade = grade;
        } else {
            System.out.println("Illegal ");
        }
    }
}

    public class qn01{
    	public static void main(String[] args) {
            Student student = new Student(1, "John Doe", 20, 'A');
            
            System.out.println("ID: " + student.getId());
            System.out.println("Name: " + student.getName());
            System.out.println("Age: " + student.getAge());
            System.out.println("Grade: " + student.getGrade());
            
            student.setName("Jane Doe");
            student.setAge(21);
            student.setGrade('B');
            
            System.out.println("Updated Name: " + student.getName());
            System.out.println("Updated Age: " + student.getAge());
            System.out.println("Updated Grade: " + student.getGrade());
        }
    	
    }
    

