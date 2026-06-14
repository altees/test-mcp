public class Factorial {

    public static void main(String[] args) {
        System.out.println("Factorial of 5: " + factorial(5)); // Example for positive number
        System.out.println("Factorial of -5: " + factorial(-5)); // Example for negative number
    }

    public static String factorial(int number) {
        if (number < 0) {
            return "Factorial is not defined for negative numbers.";
        }
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return String.valueOf(result);
    }
}