package week03;
import java.io.*;
import java.util.*;

class Studentss {
    private int id;
    private String name;
    private int age;
    private char grade;

    public Studentss(int id, String name, int age, char grade) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public char getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Age: " + age + ", Grade: " + grade;
    }
}

public class qn09 {
    public static void main(String[] args) {
        List<Studentss> students = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("students.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                students.add(new Studentss(
                        Integer.parseInt(parts[0]), 
                        parts[1], 
                        Integer.parseInt(parts[2]), 
                        parts[3].charAt(0)
                ));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        students.sort(Comparator.comparing(Studentss::getGrade));

        System.out.println("Sorted Students:");
        students.forEach(System.out::println);
    }
}
