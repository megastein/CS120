import java.io.*; //tells Java input will be used
 /*
  * This program takes any integer as input and gives the sums of its digits. i.e. 765 = 18
  */
class SumDigits {
    public static void main (String[] args) throws IOException {

        InputStreamReader inStream = new InputStreamReader(System.in);
        BufferedReader stdin = new BufferedReader(inStream);
        String inData; 

        int originalNumber; //declares integer
        int number; 
        int sum = 0;

        System.out.println("Enter number:"); //asks for user input
        inData = stdin.readLine(); //asks for user input
        number = Integer.parseInt(inData); /*places input into inData variable*/
        originalNumber = number; // defines originalNumber as number 
        
        /* 
         * The way this code will work is taking the last digit of the number using modulo, then dividing the number by 10 to move on to the next digit,
         * and this works because Java rounds down any decimals in the place of an integer,
         */

         while (number > 0) { // loops until number has been reduced to zero
            int digit = number % 10;  // get the last digit
            sum += digit;             // update the value sum
            number = number / 10;     // remove the last digit
        }

        System.out.println("The sum of all digits in " + originalNumber + " is " + sum + ".");
        
    }
}