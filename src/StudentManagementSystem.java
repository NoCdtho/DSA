import java.util.ArrayList;
import java.util.Scanner;

class Student {
    int roll;
    String name;
    String section;

    Student(int roll, String name, String section) {
        this.roll = roll;
        this.name = name;
        this.section = section;
    }

    @Override
    public String toString() {
        return "Roll: " + roll + ", Name: " + name + ", Section: " + section;
    }
}

public class StudentManagementSystem {
    static ArrayList<Student> students = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by Roll");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1: addStudent(); break;
                case 2: viewStudents(); break;
                case 3: searchStudent(); break;
                case 4: updateStudent(); break;
                case 5: deleteStudent(); break;
                case 6: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice!");
            }
        } while (choice != 6);
    }

    static void addStudent() {
        System.out.print("Enter Roll Number: ");
        int roll = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Section: ");
        String section = scanner.nextLine();

        students.add(new Student(roll, name, section));
        System.out.println("Student added successfully!");
    }

    static void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
        } else {
            System.out.println("Student List:");
            for (Student s : students) {
                System.out.println(s);
            }
        }
    }

    static void searchStudent() {
        System.out.print("Enter Roll Number to search: ");
        int roll = scanner.nextInt();
        boolean found = false;

        for (Student s : students) {
            if (s.roll == roll) {
                System.out.println("Student Found: " + s);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student not found.");
        }
    }

    static void updateStudent() {
        System.out.print("Enter Roll Number to update: ");
        int roll = scanner.nextInt();
        scanner.nextLine(); // consume newline
        boolean found = false;

        for (Student s : students) {
            if (s.roll == roll) {
                System.out.print("Enter new Name: ");
                s.name = scanner.nextLine();
                System.out.print("Enter new Section: ");
                s.section = scanner.nextLine();
                System.out.println("Student updated.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student not found.");
        }
    }

    static void deleteStudent() {
        System.out.print("Enter Roll Number to delete: ");
        int roll = scanner.nextInt();
        boolean removed = students.removeIf(s -> s.roll == roll);

        if (removed) {
            System.out.println("Student deleted.");
        } else {
            System.out.println("Student not found.");
        }
    }
}
