import java.util.Scanner;

public class FractiontoDecimal{

     public static void main(String[] args){
       Scanner sc = new Scanner(System.in); 
       
       System.out.println("Enter numerator");
       int numerator = sc.nextInt();
       
       System.out.println("Enter denominator");
       int denominator = sc.nextInt(); 
       
       
       double decimal = (double) numerator/denominator % 10;  
       System.out.println("The Decimal: " + decimal + "\n The Numerator is: " + numerator + "\n The Denomiator is: " + denominator); 
       sc.close();

    } 

}