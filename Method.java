public class Method {

    // Method to calculate the sum of an array of integers
    public static int calculateSum(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    // Method to find the maximum value in an array of integers
    public static int findMax(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    // Method to find the minimum value in an array of integers
    public static int findMin(int[] numbers) {
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }

    // Method to calculate the average of an array of integers
    public static double calculateAverage(int[] numbers) {
        int sum = calculateSum(numbers);
        return (double) sum / numbers.length;
    }

    // Main method
    public static void main(String[] args) {
        // Array of integers
        int[] numbers = {5, 10, 15, 20, 25};

        // Calculate sum
        int sum = calculateSum(numbers);
        System.out.println("Sum of the numbers is: " + sum);

        // Find maximum
        int max = findMax(numbers);
        System.out.println("Maximum value in the array is: " + max);

        // Find minimum
        int min = findMin(numbers);
        System.out.println("Minimum value in the array is: " + min);

        // Calculate average
        double average = calculateAverage(numbers);
        System.out.println("Average of the numbers is: " + average);
    }
}
