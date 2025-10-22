import java.io.*; // Import library for handling input/output

class GuessGame {
    public static void main(String[] args) throws IOException {
        // Set up input stream to read user input from the console
        InputStreamReader inStream = new InputStreamReader(System.in);
        BufferedReader stdin = new BufferedReader(inStream);
        String inData; // Variable to hold raw input as text

        int number;    // Number chosen by Player 1
        int guess;     // Player 2's current guess
        int numGuess = 0; // Counter for how many guesses were made
        String highLow;   // Indicates whether the guess is too high or too low
        String errorMessage;
		
        // Welcome message
        System.out.println("Welcome to Striker-a guessing game!");

        // Ask Player 1 to enter the number to be guessed (must be less than 1000)
        System.out.println("Player one, please enter the number to be guessed (should be less than 1000!):");
        inData = stdin.readLine();
        number = Integer.parseInt(inData); // Convert input string to integer

        // Validate input to ensure number is under 1000
        while (number >= 1000 || number < 0) {
            errorMessage = (number >= 0) ? "The value entered is too large. Please enter a number less than 1000." : "The value entered is not valid. Please enter a positive number.";
            System.out.println(errorMessage);
            inData = stdin.readLine();
            number = Integer.parseInt(inData);
        }

        // Simulate clearing the screen by printing blank lines for privacy
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

        // Prompt Player 2 to start guessing
        System.out.println("Player two, guess a number:");
        guess = Integer.parseInt(stdin.readLine()); // Read first guess
        numGuess++; // Increment guess counter

        // Continue looping until Player 2 guesses correctly
        while (guess != number) {
            // Determine if the guess is too high or too low
            highLow = (guess > number) ? "high" : "low";
            System.out.println("Your guess is too " + highLow + "! Please try again.");
            
            System.out.println(); // Blank line for readability
            guess = Integer.parseInt(stdin.readLine()); // Get next guess
            numGuess++; // Increment number of guesses
        }

        // Display success message and total guesses
        System.out.println("Congratulations, you guessed it!");
        System.out.println("It took " + numGuess + " guesses to determine the number.");
        System.out.println("Thanks for playing Striker!");
    }
}
