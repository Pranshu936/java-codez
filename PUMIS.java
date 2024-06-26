import java.util.Scanner;
import java.util.Arrays;

public class PUMIS {
    private static Student[] students = new Student[10]; // Array to store students
    private static int numStudents = 0; // Number of students currently in the system
    private static Scanner scanner = new Scanner(System.in);
    private static int idcounter = 1001; // Counter to generate unique student IDs

    public static void main(String[] args) {
        boolean exit = false;

        while (!exit) {
            // Display menu options
            System.out.println("\nStudent Management System Menu:");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Update Student Information");
            System.out.println("5. Delete Student by ID");
            System.out.println("6. Sort Students by ID");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = getIntInput; // Read user choice

            switch (choice) {
                case 1:
                    addStudent(); // Add a new student
                    break;
                case 2:
                    displayAllStudents(); // Display all students
                    break;
                case 3:
                    searchStudentByID(); // Search for a student by ID
                    break;
                case 4:
                    updateStudent(); // Update student information
                    break;
                case 5:
                    deleteStudentByID(); // Delete a student by ID
                    break;
                case 6:
                    sortStudentsByID(); // Sort students by ID
                    break;
                case 7:
                    exit = true; // Exit the program
                    System.out.println("Exiting... Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 7.");
            }
        }

        scanner.close(); // Close the scanner object
    }

    // Utility method to get integer input from user
    private static int getIntInput() {
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input. Please enter a number: ");
            scanner.next(); // Consume invalid input
        }
        return scanner.nextInt();
    }

    // Method to add a new student
    private static void addStudent() {
        if (numStudents == students.length) {
            // If array is full, resize it
            students = Arrays.copyOf(students, students.length * 2);
        }

        System.out.print("Id assigned \n");
        int id = idcounter++;
        scanner.nextLine(); // Consume newline character

        // Check if the ID already exists
        if (findStudentByID(id) != null) {
            System.out.println("Student with ID " + id + " already exists. Please enter a different ID.");
            return;
        }

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        students[numStudents] = new Student(id, name); // Create and add new student
        numStudents++; // Increment student count

        System.out.println("Student added successfully.");
    }

    // Method to display all students
    private static void displayAllStudents() {
        if (numStudents == 0) {
            System.out.println("No students to display.");
        } else {
            System.out.println("\nList of Students:");
            for (int i = 0; i < numStudents; i++) {
                System.out.println(students[i]); // Print each student's information
            }
        }
    }

    // Method to search for a student by ID
    private static void searchStudentByID() {
        System.out.print("Enter student ID to search: ");
        int id = getIntInput(); // Get student ID from user input
        scanner.nextLine(); // Consume newline character

        Student foundStudent = findStudentByID(id); // Search for student

        if (foundStudent != null) {
            System.out.println("Student found:");
            System.out.println(foundStudent); // Display student information
        } else {
            System.out.println("Student not found with ID: " + id);
        }
    }

    // Helper method to find a student by ID
    private static Student findStudentByID(int id) {
        for (int i = 0; i < numStudents; i++) {
            if (students[i].getId() == id) {
                return students[i]; // Return the student object if found
            }
        }
        return null; // Return null if student with given ID is not found
    }

    // Method to update student information
    private static void updateStudent() {
        System.out.print("Enter student ID to update: ");
        int id = getIntInput(); // Get student ID from user input
        scanner.nextLine(); // Consume newline character

        Student studentToUpdate = findStudentByID(id); // Find student to update

        if (studentToUpdate != null) {
            System.out.print("Enter new name for student: ");
            String newName = scanner.nextLine(); // Get new name from user input

            studentToUpdate.setName(newName); // Update student name

            System.out.println("Student information updated successfully.");
        } else {
            System.out.println("Student not found with ID: " + id);
        }
    }

    // Method to delete a student by ID
    private static void deleteStudentByID() {
        System.out.print("Enter student ID to delete: ");
        int id = getIntInput(); // Get student ID from user input
        scanner.nextLine(); // Consume newline character

        boolean found = false;
        for (int i = 0; i < numStudents; i++) {
            if (students[i].getId() == id) {
                // Shift elements to the left to remove the student
                for (int j = i; j < numStudents - 1; j++) {
                    students[j] = students[j + 1];
                }
                numStudents--; // Decrement student count

                // Clear the last element
                students[numStudents] = null;

                found = true;
                System.out.println("Student deleted successfully.");
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found with ID: " + id);
        }
    }

    // Method to sort students by ID using bubble sort
    private static void sortStudentsByID() {
        if (numStudents > 1) {
            // Bubble sort by student ID
            for (int i = 0; i < numStudents - 1; i++) {
                for (int j = 0; j < numStudents - i - 1; j++) {
                    if (students[j].getId() > students[j + 1].getId()) {
                        // Swap students
                        Student temp = students[j];
                        students[j] = students[j + 1];
                        students[j + 1] = temp;
                    }
                }
            }
            System.out.println("Students sorted by ID.");
        } else {
            System.out.println("Sorting requires at least 2 students.");
        }
    }

    // Nested Student class to represent a student
    static class Student {
        private int id;
        private String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "ID: " + id + ", Name: " + name;
        }
    }
}
