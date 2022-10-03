import java.util.Scanner;

public class ScannerTest {
    
    public static void main(String[] args) {
    Scanner input =  new Scanner(System.in);
    System.out.print("Enter an integer: ");
    int sampleInputInt = input.nextInt();
    
    System.out.print("Enter a double: ");
    double sampleInputDouble = input.nextDouble();
    
    System.out.print("Enter a boolean: ");
    boolean sampleInputBoolean = input.nextBoolean();
    
    System.out.print("Enter a String: ");
    String sampleInputString = input.nextLine();

    System.out.print("The string you entered was ");
    System.out.println(sampleInputString);
    System.out.print("The integer you entered was ");
    System.out.println(sampleInputInt);
    System.out.print("The double you entered was ");
    System.out.println(sampleInputDouble);
    System.out.print("The boolean you entered was ");
    System.out.println(sampleInputBoolean);
    input.close();
  }
}