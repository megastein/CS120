import java.io.*;

class NumberTrial{
    public static void main(String[] args) throws IOException{
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

        String inData;
        int num;

        System.out.println("Enter an integer:");
        inData = stdin.readLine();
        num = Integer.parseInt(inData); //convert data into int

        //branching statements begin
        if(num < 0){ //true branch inside statement block, enclosed in braces
            System.out.println("The number " + num + "is negative"); 
            System.out.println("Negative numbers are less than zero"); 
        } 
        else{ //false branch inside statement block, enclosed in braces
            System.out.println ("The number " + num + "is positive"); 
            System.out.print("Positive numbers are greater "); 
            System.out.println("or equal to zero"); 
        } 

        // execution continues after the branching statements
        System.out.println("Good-bye for now"); //always executed
    }
}