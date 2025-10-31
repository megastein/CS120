import java.io.*;

public class ReverseIntegers {

    public static void main (String arg[]) throws IOException {

        // Creates an InputStreamReader to read input from the keyboard.
        InputStreamReader inStream = new InputStreamReader(System.in);
        BufferedReader stdin = new BufferedReader(inStream);

        // Declares an integer array to hold 10 integers.
        int numbers [] = new int[10];

        System.out.println("Enter 10 integer values: ");

        // Reads 10 integers from the user.
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Value " + (i + 1) + ": ");
            String inData = stdin.readLine();          // Reads the line as a string
            numbers[i] = Integer.parseInt(inData);     // Converts the string to an integer
        }

        System.out.println();
        System.out.println("The numbers in reverse order are:");
        // Now, print the integers in reverse order.
        int i = 9;
        while (i >= 0) {
            System.out.print(numbers[i] + " ");  // Prints the integer at index i
            i--;
        }
    }
}
