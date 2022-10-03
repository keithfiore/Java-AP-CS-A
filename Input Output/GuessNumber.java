import java.util.Random; 
import java.util.Scanner;

/**
 * Starter code for the "Guess My Number" exercise.
 */
public class GuessNumber{

    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.println(number);

        Scanner in = new Scanner(System.in);


        in.close();
    }

}