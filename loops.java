import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number to calculate its factorial: ");
        int number = scanner.nextInt();

        // Calculate factorial using for loop
        int factorialFor = 1;
        for (int i = 1; i <= number; i++) {
            factorialFor *= i;
        }
        System.out.println("Factorial using for loop: " + factorialFor);

        // Calculate factorial using while loop
        int factorialWhile = 1;
        int counter = 1;
        while (counter <= number) {
            factorialWhile *= counter;
            counter++;
        }
        System.out.println("Factorial using while loop: " + factorialWhile);

        // Calculate factorial using do-while loop
        int factorialDoWhile = 1;
        int count = 1;
        do {
            factorialDoWhile *= count;
            count++;
        } while (count <= number);
        System.out.println("Factorial using do-while loop: " + factorialDoWhile);

        System.out.println("\nNested Loops:");
        for (int m = 1; m <= 3; m++) {
            for (int n = 1; n <= 2; n++) {
                System.out.println("Outer Loop Iteration: " + m + ", Inner Loop Iteration: " + n);
            }
        }
        // Close the scanner
        scanner.close();
    }
}
