import java.io.*;  // For handling user input

public class ArrayTableAverage {
    public static void main (String arg[]) throws IOException {

        // Set up keyboard input
        InputStreamReader inStream = new InputStreamReader(System.in);
        BufferedReader stdin = new BufferedReader(inStream);

        // Create a 4x5 array to hold numbers
        int[][] numberTable = new int[4][5];
        int i = 0; // Count how many values have been entered

        // ---- Get user input ----
        for (int row = 0; row < numberTable.length; row++) {
            for (int column = 0; column < numberTable[row].length; column++) {

                System.out.print("Enter Value " + (i + 1) + ": ");
                String inData = stdin.readLine();  // Read user input
                int value = Integer.parseInt(inData);  // Convert to number
                numberTable[row][column] = value;  // Store in array
                i++;  // Increase counter
            }
        }

        // ---- Print the table ----
        System.out.println("\nTable of Values:");
        System.out.println("------------------------------");

        for (int row = 0; row < numberTable.length; row++) {
            System.out.printf("Row %d: ", (row + 1));  // Label each row

            for (int column = 0; column < numberTable[row].length; column++) {
                System.out.printf("%8d", numberTable[row][column]);  // Keep columns lined up (the percentage thing is to specify a fixed width)
            }
            System.out.println();  // Move to next line
        }

        // ---- Find and print averages ----
        System.out.print("\nAverage:");

        for (int column = 0; column < numberTable[0].length; column++) {
            int sum = 0;

            // Add up the numbers in each column
            for (int row = 0; row < numberTable.length; row++) {
                sum += numberTable[row][column];
            }

            // Calculate average
            double average = (double) sum / numberTable.length;

            // Print average with 2 decimal places
            System.out.printf("%8.2f", average);
        }

        System.out.println(); // End line
    }
}
