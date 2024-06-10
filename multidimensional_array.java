import java.util.Scanner;

public class multidimensional_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of rows and columns for the theater seating
        System.out.println("Enter the number of rows for the theater seating:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of columns for the theater seating:");
        int cols = scanner.nextInt();

        // Create a 2D array to represent the theater seating
        String[][] theater = new String[rows][cols];

        // Assign names to each seat
        System.out.println("Please enter the names for each seat:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Seat [" + i + "][" + j + "]: ");
                theater[i][j] = scanner.next();
            }
        }

        // Display the seating arrangement
        System.out.println("\nTheater Seating Arrangement:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(theater[i][j] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}
