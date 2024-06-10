import java.util.Scanner;

public class Mathoperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.println("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.println("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Perform addition
        double sum = num1 + num2;
        System.out.println("Addition: " + sum);

        // Perform subtraction
        double difference = num1 - num2;
        System.out.println("Subtraction: " + difference);

        // Perform multiplication
        double product = num1 * num2;
        System.out.println("Multiplication: " + product);

        // Perform division with a check for division by zero
        if (num2 != 0) {
            double quotient = num1 / num2;
            System.out.println("Division: " + quotient);
        } else {
            System.out.println("Error! Division by zero.");
        }

        // Perform modulus with a check for division by zero
        if (num2 != 0) {
            double remainder = num1 % num2;
            System.out.println("Modulus: " + remainder);
        } else {
            System.out.println("Error! Division by zero.");
        }

        scanner.close();
    }
}
