import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        // If statement
        if (number > 0) {
            System.out.println("The number is positive.");
        }

        // If-else statement
        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }

        // Else-if statement
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        // Nested if-else statement
        System.out.println("Enter another number: ");
        int anotherNumber = scanner.nextInt();

        if (anotherNumber >= 0) {
            if (anotherNumber == 0) {
                System.out.println("The number is zero.");
            } else {
                System.out.println("The number is positive.");
            }
        } else {
            System.out.println("The number is negative.");
        }

        // Ternary operator
        String parity = (number % 2 == 0) ? "even" : "odd";
        System.out.println("The number is " + parity + ".");

        scanner.close();
    }
}
