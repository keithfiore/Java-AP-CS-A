import java.util.Scanner;

public class IsTwenties {
  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a number in the twenties");
    int num = scan.nextInt();

    if(!(num < 20 && num > 30)){
      System.out.println("That's not in the twenties!");
      num = 25;
    }
    System.out.println("Your number is " + num);
    scan.close();

  }
}