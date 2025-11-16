import java.util.ArrayList;
import java.util.Scanner;

// Class to represent a student
class Student {
    private String name;
    private int age;
    private String grade;

    public Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void display() {
        System.out.printf("%-20s %-10d %-10s%n", name, age, grade);
    }
}

public class StudentInformationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = 0;
        try {
            n = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter a number.");
            sc.close();
            return;
        }

        for (int i = 1; i <= n; i++) {
            System.out.println("\nEnter details of student " + i + ":");
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Age: ");
            int age;
            try {
                age = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid age! Setting default age to 18.");
                age = 18;
            }

            System.out.print("Grade: ");
            String grade = sc.nextLine();

            students.add(new Student(name, age, grade));
        }

        System.out.println("\n-------------------------------------------");
        System.out.printf("%-20s %-10s %-10s%n", "Name", "Age", "Grade");
        System.out.println("-------------------------------------------");
        for (Student s : students) s.display();
        System.out.println("-------------------------------------------");
        sc.close();
    }
}
