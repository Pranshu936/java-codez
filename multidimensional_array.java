//2d Array
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
                System.out.printf("Seat [%d][%d]: ",i,j);
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

// Three dimensional array
public class ThreeDimensionalArrayExample {
    public static void main(String[] args) {
        // Creating and initializing a 3D array with dimensions 2x3x4
        int[][][] cube = new int[2][3][4];
        // Initializing values
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 4; k++) {
                    cube[i][j][k] = i + j + k;
                }
            }
        }
        // printing elements
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 4; k++) {
                    System.out.print(cube[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        // acsessing the data
        System.out.println("Element at [0][1][2]: " + cube[0][1][2]); 
        System.out.println("Element at [1][2][1]: " + cube[1][2][1]); 
    }
}
