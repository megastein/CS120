import java.io.*;

public class PrimeChecker {

    public static void main(String[] args) throws IOException {
        // Set up input from the user
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

        // Friendly introduction
        System.out.println("Welcome to the Prime Number Checker!");
        System.out.print("Please enter a number to see if it's prime: ");

        // Read input and convert to integer
        int number = Integer.parseInt(stdin.readLine());

        // Numbers less than 2 are not prime
        if (number <= 1) {
            System.out.println(number + " is not a prime number.");
            return; // Exit early
        }

        // Assume the number is prime until we find a divisor
        boolean isPrime = true;

        // Check for divisors from 2 up to the square root of the number
        for (int divisor = 2; divisor * divisor <= number; divisor++) {
            if (number % divisor == 0) {
                isPrime = false; // Found a divisor, number is not prime
                break; // Stop checking further
            }
        }

        // Display the result
        if (isPrime) {
            System.out.println(number + " is a prime number!");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
