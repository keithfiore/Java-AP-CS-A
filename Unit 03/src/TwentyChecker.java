import java.util.Scanner;
public class TwentyChecker {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number in the twenties \n");
        int num = scan.nextInt();

        if (num < 20 || num >= 30) {
            num = 25;
            System.out.println("That's not in the twenties! Your new number is: " + num);

        } else {
            System.out.println("Congratulations! You did it!! Your number is " + num);
        }
      scan.close();  
    }
}
