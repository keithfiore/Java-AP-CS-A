import java.util.Scanner;

public class PrintAverageAnswer {

    public static void main(String[] args) {


        //Declare a Scanner and prompt for scores.
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Scores: ");

        //Input the first score and declare sum and count variables.
        int test = scan.nextInt();
        int sum = 0;
        int c = 0;

        //While the input is not -1, increase the count,
        //add to the sum, and read the next input.
        while (test != -1) {
            sum += test;
            c++;
            test = scan.nextInt();
        }

        //Calculate and print the average.
        System.out.println("The average is: " + 1.0 * sum / c);
        scan.close();
    }

}
