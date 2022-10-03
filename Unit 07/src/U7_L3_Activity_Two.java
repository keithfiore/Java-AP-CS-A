import java.util.ArrayList;

public class U7_L3_Activity_Two
{
  public static void printStatistics(ArrayList<Integer> nums){
    int sum = 0;
    int mode = nums.get(0);
    boolean hasMode = false;
    int maxCount = 0;

    for(int i = 0; i < nums.size(); i++){
      // update sum variable (also used for average)
      sum += nums.get(i);

      // This loop counts all subsequent occurences of the value at index i
      int count = 1;
      for(int j = i + 1; j < nums.size(); j++){
        if(nums.get(i).equals(nums.get(j))){
          count++;
        }
      }

      // If this value appears more often than previous most-appearing set
      // it to the single mode for this list and update maxCount
      if(count > maxCount){
        mode = nums.get(i);
        hasMode = true;
        maxCount = count;
      }

      // If this appears as often as previous mode, then currently there is
      // no mode for the list (until a value appears more times)
      else if(count == maxCount){
        hasMode = false;
      }
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

}
