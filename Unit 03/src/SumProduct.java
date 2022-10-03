import java.util.Scanner;


public class SumProduct {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i, num, product;
        product = 2;
        System.out.print("Enter a positive even number: ");
        num = scan.nextInt();
        for (i=1;i<(num/2);i++){
            product*= (i+1)*2 ;
        }
        System.out.println("Product = " + product);
        scan.close();
    }
}
