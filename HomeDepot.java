import java.io.*; // Import classes for input handling from the console

// Define the main class
class HomeDepot {
    public static void main (String[] args) throws IOException, InterruptedException {

        // Set up input stream to read from the console
        InputStreamReader inStream = new InputStreamReader(System.in);
        BufferedReader stdin = new BufferedReader(inStream);

        // Variable to store user input
        String inData; 

        // Declare variables to hold quantities of items
        int nuts, bolts, washers;

        // Welcome message
        System.out.println("Welcome to the Home Depot order page.");
		Thread.sleep(1000); // Waits for 1 seconds
		
        // Prompt user for number of nuts
        System.out.println("Please enter quantities for nuts:");
        inData = stdin.readLine(); // Read input
        nuts = Integer.parseInt(inData); // Convert input to integer

        // Ensure minimum order quantity for nuts is 50
        if (nuts < 50) {
            System.out.println("A minimum of 50 nuts must be ordered before your order can be processed. Please re-enter the minimum amount:");
            inData = stdin.readLine(); // Read new input
            nuts = Integer.parseInt(inData);

            // If still below minimum, force quantity to 50
            if (nuts < 50) {
                System.out.println("A minimum of 50 nuts must be ordered. The number of nuts has been set to 50.");
                nuts = 50;
            }
        }

        // Prompt user for number of bolts
        System.out.println("Please enter quantities for bolts:");
        inData = stdin.readLine();
        bolts = Integer.parseInt(inData);

        // Ensure minimum order quantity for bolts is 50
        if (bolts < 50) {
            System.out.println("A minimum of 50 bolts must be ordered before your order can be processed. Please re-enter the minimum amount:");
            inData = stdin.readLine();
            bolts = Integer.parseInt(inData);

            // If still below minimum, force quantity to 50
            if (bolts < 50) {
                System.out.println("A minimum of 50 bolts must be ordered. The number of bolts has been set to 50.");
                bolts = 50;
            }
        }

        // Prompt user for number of washers
        System.out.println("Please enter quantities for washers:");
        inData = stdin.readLine();
        washers = Integer.parseInt(inData);

        // Ensure minimum order quantity for washers is 50
        if (washers < 50) {
            System.out.println("A minimum of 50 washers must be ordered before your order can be processed. Please re-enter the minimum amount:");
            inData = stdin.readLine();
            washers = Integer.parseInt(inData);

            // If still below minimum, force quantity to 50
            if (washers < 50) {
                System.out.println("A minimum of 50 washers must be ordered. The number of washers has been set to 50.");
                washers = 50;
            }
        }
		
		Thread.sleep(1000); // Waits for 1 second

        // Inform user that order is being processed
        System.out.println("Please wait while your order is processed."); 
		Thread.sleep(3000); // Waits for 3 second

        // Define item prices (in cents): nuts and bolts are $0.05 each, washers are $0.02
        int nutsTotalCents = nuts * 5;
        int boltsTotalCents = bolts * 5;
        int washersTotalCents = washers * 2;

        // Calculate 15% tax (HST) on total order
        int taxTotalCents = (int)((nutsTotalCents + washersTotalCents + boltsTotalCents) * 0.15);

        // Calculate total order cost including tax
        int totalTotalCents = nutsTotalCents + washersTotalCents + boltsTotalCents + taxTotalCents;

        // Convert nuts total to dollars and cents
        int nutsDollars = nutsTotalCents / 100;
        int nutsCents = nutsTotalCents % 100;

        // Convert bolts total to dollars and cents
        int boltsDollars = boltsTotalCents / 100;
        int boltsCents = boltsTotalCents % 100;

        // Convert washers total to dollars and cents
        int washersDollars = washersTotalCents / 100;
        int washersCents = washersTotalCents % 100;

        // Convert tax total to dollars and cents
        int taxDollars = taxTotalCents / 100;
        int taxCents = taxTotalCents % 100;

        // Convert full total to dollars and cents
        int totalDollars = totalTotalCents / 100;
        int totalCents = totalTotalCents % 100;
		
		// Convert sub total to dollars and cents by subtracting tax from total
		int subTotalDollars = totalDollars - taxDollars;
        int subTotalCents = totalCents - taxCents;

        // Print out formatted receipt
		Thread.sleep(500); // Waits for 0.5 second
        System.out.println("Nuts: " + nutsDollars + " dollars and " + nutsCents + " cents."); 
		Thread.sleep(500); // Waits for 0.5 second
        System.out.println("Bolts: " + boltsDollars + " dollars and " + boltsCents + " cents."); 
		Thread.sleep(500); // Waits for 0.5 second
        System.out.println("Washers: " + washersDollars + " dollars and " + washersCents + " cents."); 
		Thread.sleep(500); // Waits for 0.5 second
		System.out.println("Sub-total: " + subTotalDollars + " dollars and " + subTotalCents + " cents."); 
		Thread.sleep(500); // Waits for 0.5 second
        System.out.println("HST: " + taxDollars + " dollars and " + taxCents + " cents."); 
		Thread.sleep(500); // Waits for 0.5 second
        System.out.println("Total: " + totalDollars + " dollars and " + totalCents + " cents."); 
		Thread.sleep(500); // Waits for 0.5 second

        // Thank the user
        System.out.println("Thank you for shopping at Home Depot."); 
    }
}
