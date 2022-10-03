/*
* Sentinel values in Java are specific to the while loop, which test the condition of the loop (controlled loop).
* The sentinel value is a special input value that tests the condition within the while loop.
 */
import java.util.Scanner;

public class SentinelWhileLoop {
    /** Main method */
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Read an initial data
        System.out.print("Enter an integer (the input ends if it is -1): ");
        int data = input.nextInt();

        // Keep reading data until the input is 0
        int sum = 0;
        while (data != -1){
            sum += data;

            // Read the next data
            System.out.print("Enter an integer (the input ends if it is 0): ");
            data = input.nextInt();
        }

        System.out.println("The sum is " + sum);
        input.close();
    }
}