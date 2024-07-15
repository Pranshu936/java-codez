import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PUMIS {
    private static int idcounter = 1001; // Counter to generate unique student IDs
    private static final String FILENAME = "students.csv"; // File to store student data
    private static Scanner scanner = new Scanner(System.in);

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
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = getIntInput(); // Read user choice

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    displayAllStudents();
                    break;
                case 3:
                    searchStudentByID();
                    break;
                case 4:
                    updateStudent();
                    break;
                case 5:
                    deleteStudentByID();
                    break;
                case 6:
                    exit = true;
                    System.out.println("Exiting... Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }
        }

        scanner.close(); // Close the scanner object
    }

    // Utility method to get integer input from user
    private static int getIntInput() {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.print("Invalid input. Please enter a number: ");
                scanner.next(); // Consume invalid input
            } finally {
                scanner.nextLine(); // Consume newline character
            }
        }
    }

    // Method to check if a string contains only letters
    private static boolean isValidName(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isLetter(str.charAt(i))) {
                return false; // Found a non-letter character
            }
        }
        return true; // All characters are letters
    }

    // Method to add a new student
    private static void addStudent() {
        int id = idcounter++;

        String name;
        boolean validInput = false;
        while (!validInput) {
            System.out.print("Enter student name: ");
            name = scanner.nextLine().trim(); // Read and trim input

            if (isValidName(name)) {
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILENAME, true))) {
                    writer.write(id + "," + name + "\n");
                    System.out.println("Student added successfully.");
                    validInput = true;
                } catch (IOException e) {
                    System.err.println("Error writing to file: " + e.getMessage());
                }
            } else {
                System.out.println("Invalid name. Please enter a name with only characters.");
            }
        }
    }

    // Method to display all students
    private static void displayAllStudents() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILENAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    int id = Integer.parseInt(parts[0]);
                    String name = parts[1];
                    System.out.println("ID: " + id + ", Name: " + name);
                }
            }
        } catch (IOException | NumberFormatException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
    }

    // Method to search for a student by ID
    private static void searchStudentByID() {
        System.out.print("Enter student ID to search: ");
        int id = getIntInput(); // Get student ID from user input

        boolean found = false;
        try (BufferedReader reader = new BufferedReader(new FileReader(FILENAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2 && Integer.parseInt(parts[0]) == id) {
                    String name = parts[1];
                    System.out.println("Student found:");
                    System.out.println("ID: " + id + ", Name: " + name);
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Student not found with ID: " + id);
            }
        } catch (IOException | NumberFormatException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
    }

    // Method to update student information
    private static void updateStudent() {
        System.out.print("Enter student ID to update: ");
        int id = getIntInput(); // Get student ID from user input

        boolean found = false;
        try (BufferedReader reader = new BufferedReader(new FileReader(FILENAME));
             BufferedWriter writer = new BufferedWriter(new FileWriter("temp.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2 && Integer.parseInt(parts[0]) == id) {
                    System.out.print("Enter new name for student: ");
                    String newName = scanner.nextLine().trim(); // Get new name from user input
                    writer.write(id + "," + newName + "\n");
                    System.out.println("Student information updated successfully.");
                    found = true;
                } else {
                    writer.write(line + "\n");
                }
            }
        } catch (IOException | NumberFormatException e) {
            System.err.println("Error updating student information: " + e.getMessage());
        }

        if (!found) {
            System.out.println("Student not found with ID: " + id);
        } else {
            // Rename temp.csv to students.csv after successful update
            File oldFile = new File(FILENAME);
            File newFile = new File("temp.csv");
            if (newFile.renameTo(oldFile)) {
                System.out.println("File renamed successfully.");
            } else {
                System.err.println("Failed to rename file.");
            }
        }
    }

    // Method to delete a student by ID
    private static void deleteStudentByID() {
        System.out.print("Enter student ID to delete: ");
        int id = getIntInput(); // Get student ID from user input

        boolean found = false;
        try (BufferedReader reader = new BufferedReader(new FileReader(FILENAME));
             BufferedWriter writer = new BufferedWriter(new FileWriter("temp.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2 && Integer.parseInt(parts[0]) == id) {
                    System.out.println("Student deleted successfully.");
                    found = true;
                } else {
                    writer.write(line + "\n");
                }
            }
        } catch (IOException | NumberFormatException e) {
            System.err.println("Error deleting student: " + e.getMessage());
        }

        if (!found) {
            System.out.println("Student not found with ID: " + id);
        } else {
            // Rename temp.csv to students.csv after successful delete
            File oldFile = new File(FILENAME);
            File newFile = new File("temp.csv");
            if (newFile.renameTo(oldFile)) {
                System.out.println("File renamed successfully.");
            } else {
                System.err.println("Failed to rename file.");
            }
        }
    }
}
