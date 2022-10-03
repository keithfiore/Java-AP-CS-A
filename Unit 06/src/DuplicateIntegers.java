import java.util.Scanner;

public class DuplicateIntegers {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array length:");
        int len = scan.nextInt();
        int[] vals = new int[len];
        System.out.println("Enter values:");
        for(int i = 0; i < len; i++){
            vals[i] = scan.nextInt();
        }
        System.out.println("Has duplicates: " + hasDuplicates(vals));
    }

    public static boolean hasDuplicates(int[] arr) {

        // Iterate through each element except last
        // If we reach last element this can't be repeated after itself
        for(int i = 0; i < arr.length - 1; i++){
            int target = arr[i];

            // compare each element after the current one to see if it is a duplicate
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] == target){
                    return true;
                }
            }
        }

        // If this point is reached then no duplicates were found
        return false;
    }
}

