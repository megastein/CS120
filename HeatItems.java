import java.io.*; // Allows program to handle user input and output using Java’s IO system

class HeatItems {
    public static void main (String[] args) throws IOException {

        // Create objects to read user input from the keyboard
        InputStreamReader inStream = new InputStreamReader(System.in);
        BufferedReader stdin = new BufferedReader(inStream);
        String inData; // stores the text input before converting it

        double heatTime; // variable to store the base heating time for one item
        int numItems;    // variable to store the number of items the user wants to heat
        String second;   // variable to hold whether to say "second" or "seconds"

        // Ask the user for how many items they want to heat
        System.out.println("Enter the number of items you want to heat (1 to 4): ");
        inData = stdin.readLine(); // reads the user’s input as a string
        numItems = Integer.parseInt(inData); // converts input text to an integer

        // Ask the user for the base heating time for one item
        System.out.println("Enter the base heating time in seconds for one item: ");
        inData = stdin.readLine(); // reads another input line
        heatTime = Double.parseDouble(inData); // converts it to a decimal number (can handle fractions)


        // Use a switch statement to determine heating time based on number of items
        switch (numItems) {

            // Case 1: only one item — no change in heating time
            case 1:
                // Decide whether to use "second" or "seconds" for grammatical correctness
                second = (heatTime > 1.0 || heatTime == 0) ? "seconds" : "second";
                System.out.println("It will take " + heatTime + " " + second + " to heat " + numItems + " item.");
                break;
            
            // Case 2: two items — increase time by 25%
            case 2:
                heatTime = heatTime * 1.25;
                second = (heatTime > 1.0 || heatTime == 0) ? "seconds" : "second";
                System.out.println("It will take " + heatTime + " " + second + " to heat " + numItems + " items.");
                break;

            // Case 3: three items — increase time by 50%
            case 3:
                heatTime = heatTime * 1.5;
                second = (heatTime > 1.0 || heatTime == 0) ? "seconds" : "second";
                System.out.println("It will take " + heatTime + " " + second + " to heat " + numItems + " items.");
                break;

            // Case 4: four items — double the heating time
            case 4:
                heatTime = heatTime * 2;
                System.out.println("It will take " + heatTime + " seconds to heat " + numItems + " items.");
                break;

            // Default: handles any number greater than 4
            default:
                System.out.println("Warning: Heating more than four items at once is not recommended.");
                break;

        }
       
    }
}
