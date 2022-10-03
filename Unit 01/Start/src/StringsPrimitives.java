import java.util.Scanner;

public class StringsPrimitives {

    public static void main(String[] args) {

        // Create a program that asks if the end-user likes skittles
        Scanner question = new Scanner(System.in); // Instantiate a new object to get the input
        System.out.println("Do you like Skittles? ");

        String response = question.nextLine();

        System.out.println("You " + response.toLowerCase() + " skittles!");
        
        
        question.close();  // Close Scanner Class
    }
    
}
