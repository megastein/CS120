import java.io.*;  // Import classes for input and output

public class CaseChangeCounter {
    public static void main(String[] args) throws IOException {

        // Create a reader to accept user input one character at a time
        InputStreamReader inStream = new InputStreamReader(System.in);
        BufferedReader stdin = new BufferedReader(inStream);

        int caseChanges = 0;  // Variable to count the number of case changes
        char ch;              // Variable to store the entered character
        String input;         // Variable to hold user input as a string

        System.out.println("Enter characters one at a time. Type 'x.' to stop:");

        while (true) {
            input = stdin.readLine();  // Read input from the user

            // Skip empty input lines (just in case)
            if (input.length() == 0) {
                continue;
            }

            ch = input.charAt(0);  // Get the first character from the line

            // If the user enters a period, end the loop
            if (ch == '.') {
                break;
            }

            // Check if the character is a lowercase letter
            if (Character.isLowerCase(ch)) {
                ch = Character.toUpperCase(ch);  // Convert to uppercase
                caseChanges++;                   // Count this as a case change
            }
            // Check if the character is an uppercase letter
            else if (Character.isUpperCase(ch)) {
                ch = Character.toLowerCase(ch);  // Convert to lowercase
                caseChanges++;                   // Count this as a case change
            }

            // Output the changed (or unchanged) character
            System.out.println("Converted: " + ch);
        }

        // After loop ends, display total number of case changes
        System.out.println("Number of case changes: " + caseChanges);
    }
}
