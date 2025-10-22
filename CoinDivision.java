import java.io.*;//tells Java input will be used

/*
This program has the user enter some arbitrary amount of money measured in cents, 
and divides it amongst the smallest possible number of coins 
including toonies, loonies, quarters, dimes, nickels and pennies
 */

class CoinDivision{
    public static void main (String[] args) throws IOException{
        InputStreamReader inStream = new InputStreamReader(System.in);
        BufferedReader stdin = new BufferedReader(inStream);
        String inData;

        int money;

        System.out.println("Enter amount in cents:"); // takes user input
        inData = stdin.readLine();
        money = Integer.parseInt(inData);

        /*
         * The way this program will work is by defining the number of cents (or how much money) 
         * is held by each coin type, and then takes the remainder from the int money 
         * as to continue with smaller and smaller coin types. The program accounts for largerest to smallest 
         * coin types as that method outputs the smallest number of coins required.
         */

        int toonies = money / 200; // declares integer loonie as being a hundred cents (or 20 * money) 
        money = money % 200; // takes remainder of the amount of money left after toonies have been equated for

        int loonies = money / 100; 
        money = money % 100;

        int quarters = money/25;
        money = money % 25;

        int dimes = money/10;
        money = money % 10;

        int nickels = money / 5;
        money = money % 5;

        int pennies = money / 1;
        money = money % 1;


        System.out.println("toonies = " + toonies); // prints number of each coin
        System.out.println("loonies = " + loonies); 
        System.out.println("quarters = " + quarters); 
        System.out.println("dimes = " + dimes); 
        System.out.println("nickels = " + nickels); 
        System.out.println("pennies = " + pennies); 
 
    }
}