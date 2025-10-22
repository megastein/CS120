import java.io.*; //tells Java input will be used

class FeetToMeters {
    public static void main (String[] args) throws IOException {

        InputStreamReader inStream = new InputStreamReader(System.in);
        BufferedReader stdin = new BufferedReader(inStream);
        String inData; 
        double feet, meter; //declares feet and meters as doubles

        System.out.println("Enter feet:"); //asks for user input
        inData = stdin.readLine(); //asks for user input
        feet = Double.parseDouble(inData); /*places input into inData variable*/
        meter = feet * 0.305; //defines relation between feet and meters
        System.out.println(feet + " feet is equal to " + meter + " meters"); //prints final answer
       
    }
}