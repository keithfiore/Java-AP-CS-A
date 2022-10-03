import java.util.Scanner;

public class AllNegative {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array length:");
        int len = scan.nextInt();
        double[] vals = new double[len];
        System.out.println("Enter values:");
        for(int i = 0; i < len; i++){
            vals[i] = scan.nextDouble();
        }
        System.out.println("All negative: " + allNegative(vals));
    }

    /* Type your solution (allNegative method)  below */

    public static boolean allNegative(double[] arr){

    // Iterate through elements, return false if any are non-negative
    for(int i = 0; i < arr.length; i++){
        if(arr[i] >= 0){
            return false;
        }
    }
    // If this point reached with no return, all elements must be negative
    return true;
    }

}


/*
Sample runs:

Enter array length:
5
Enter values:
-2.0 -1.5 -0.3 -2.2 -8.1
All negative: true

Enter array length:
4
Enter values:
-1.0 -10.5 0.0 -0.2
All negative: false
 */