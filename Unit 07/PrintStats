/* 
*
* Unit 7: Lesson 3 - Coding Activity 2
*
* Write a public static void method named printStatistics which takes a single parameter of an ArrayList of Integer 
* objects. The method should print the Sum, Average and Mode of the integers in the parameter ArrayList. If there is 
* more than one mode (i.e. two or more values appear equal numbers of times and no values appear more often), the 
* method should print "no single mode".
*/

import java.util.Scanner;
import java.util.ArrayList;

public class PrintStats{

    public static void printStatistics(ArrayList<Integer> nums){
        int sum = 0;
        int mode = nums.get(0);
        boolean hasMode = false;
        int maxCount = 0;

        for(int i = 0; i < nums.size(); i++){
            // update sum variable (also used for average)
            
			/* Missing Code */
			
			
            // This loop counts all subsequent occurences of the value at index i
            
			/* Missing Code */
			

            // If this value appears more often than previous most-appearing set
            // it to the single mode for this list and update maxCount
            
			/* Missing Code */
			
			

            // If this appears as often as previous mode, then currently there is
            // no mode for the list (until a value appears more times)
            
			/* Missing Code */
			
        }

        // Print calculated statistics
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + (double) sum/nums.size());
        System.out.print("Mode: ");

       
	   
	    // Check whether a single mode was found, print if so
        if(hasMode){
            System.out.println(mode);
        }
        else{
            System.out.println("no single mode");
        }
    }





    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<Integer>();
        System.out.println("Enter ArrayList length:");
        int len = scan.nextInt();
        System.out.println("Enter values:");
        for(int i = 0; i < len; i++){
            nums.add(scan.nextInt());
        }
        printStatistics(nums);
    }
}


