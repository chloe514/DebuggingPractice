public class AverageCalculator {
    public static void main(String[] args) {
        // Test the method with an array containing the numbers 1, 2, 3, 4, 5
        int[] numbers = {1, 2, 3, 4, 5};
        double average = calculateAverage(numbers);
        System.out.println("The average is: " + average); // Expected output: 3.0

        // Introduce a null pointer exception
        int[] nullArray = null;
        // Uncomment the following line to test null pointer exception
        // double nullAverage = calculateAverage(nullArray); // This will throw an IllegalArgumentException

        // Introduce an array index out of bounds exception
        int[] outOfBoundsArray = {1, 2, 3};
        // Uncomment the following line to test array index out of bounds exception
        // System.out.println(outOfBoundsArray[5]); // This will throw an ArrayIndexOutOfBoundsException

        // Introduce a logic error by modifying the calculation
        int[] logicErrorArray = {1, 2, 3, 4, 5};
        // Uncomment the following line to simulate the logic error
        // double wrongAverage = sum(logicErrorArray) / (logicErrorArray.length + 1); // Logic error
        // System.out.println("The wrong average is: " + wrongAverage); // This will print an incorrect average

        // Correct the logic error
        double correctAverage = calculateAverage(logicErrorArray);
        System.out.println("The correct average is: " + correctAverage); // Expected output: 3.0
    }

    // Method to calculate the average of an array of integers
    public static double calculateAverage(int[] numbers) {
        // Check if the array is null or empty and throw an exception
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }

        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        return sum / numbers.length;
    }

    // Helper method to demonstrate the logic error
    private static double sum(int[] numbers) {
        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}











