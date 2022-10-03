public class U7_L5_Activity_One
{
  public static void sortAndPrint(String[] arr)
  {
    //The first loop iterates through each position of the array in turn.
    for(int i = 0; i < arr.length; i++)
    {
      //Use minInd to store the index of the lowest String alphabetically
      //in the remaining list.
      int minInd = i;
      for(int j = i+1; j < arr.length; j++)
      {
        //Compare the jth value with the ith one.

        if(arr[minInd].compareTo(arr[j]) > 0)
        {
          //If the jth value is less than the one at minInd this is the new
          //lowest String alphabetically
          minInd = j;
        }
      }
      //Swap the String at i with the lowest String alphabetically remaining
      String tmp = arr[i];
      arr[i] = arr[minInd];
      arr[minInd] = tmp;

      //At this point, we know that the ith value is in the
      //correct place, so we can print it. Some students may
      //prefer to use a second loop to print the results.
      System.out.print(arr[i] + " ");
    }
  }
}
