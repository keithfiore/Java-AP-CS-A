/**
 * Java program to convert temperature from Celsius to Fahrenheit.
 */
import java.util.Scanner;

public class CelsiusFahrenheit {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        /* Input temperature in Celsius from user */
        System.out.print("Enter temperature in Celsius: ");
        double C = in.nextDouble();
        
        /* Convert Celsius to Fahrenheit */
        double F = C * (9/ 5) + 32;
        
        /* Print result */
        System.out.println(C + " degree Celsius is equal to " + F +" degree Fahrenheit.");
        
        in.close();
    }
}