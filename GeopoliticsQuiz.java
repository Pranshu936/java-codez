import java.util.Scanner;

public class GeopoliticsQuiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Welcome message
        System.out.println("Welcome to the Geopolitics Quiz!");

        // Initialize variables
        int totalQuestions = 3;
        int correctAnswers = 0;

        // Question 1
        System.out.println("\nQuestion 1: What is the capital of Russia?");
        System.out.println("a) Moscow");
        System.out.println("b) St. Petersburg");
        System.out.println("c) Kiev");
        System.out.print("Your answer: ");
        String answer1 = scanner.nextLine().trim().toLowerCase();
        if (answer1.equals("a")) {
            System.out.println("Correct!");
            correctAnswers++;
        } else {
            System.out.println("Incorrect!");
        }

        // Question 2
        System.out.println("\nQuestion 2: Which country has the longest border with China?");
        System.out.println("a) Russia");
        System.out.println("b) India");
        System.out.println("c) Mongolia");
        System.out.print("Your answer: ");
        String answer2 = scanner.nextLine().trim().toLowerCase();
        if (answer2.equals("a")) {
            System.out.println("Correct!");
            correctAnswers++;
        } else {
            System.out.println("Incorrect!");
        }

        // Question 3
        System.out.println("\nQuestion 3: What is the European Union's currency?");
        System.out.println("a) Euro");
        System.out.println("b) Pound Sterling");
        System.out.println("c) Swiss Franc");
        System.out.print("Your answer: ");
        String answer3 = scanner.nextLine().trim().toLowerCase();
        if (answer3.equals("a")) {
            System.out.println("Correct!");
            correctAnswers++;
        } else {
            System.out.println("Incorrect!");
        }

        // Calculate and display score
        double percentage = (double) correctAnswers / totalQuestions * 100;
        System.out.println("\nQuiz completed!");
        System.out.println("Total Correct Answers: " + correctAnswers);
        System.out.println("Total Questions: " + totalQuestions);
        System.out.printf("Your Score: %.2f%%\n", percentage);

        // Provide feedback based on the score
        if (percentage >= 70) {
            System.out.println("Congratulations! You passed the quiz!");
        } else {
            System.out.println("Sorry! You did not pass the quiz. Better luck next time!");
        }

        scanner.close();
    }
}
