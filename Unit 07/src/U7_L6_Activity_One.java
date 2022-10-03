public class U7_L6_Activity_One
{

  public static void sortAndPrint(String[] arr){

    // Iterate through each element except first (doesn't need inserting)
    for(int i = 1; i < arr.length; i++){
      // Get element to be inserted
      String val = arr[i];

      // Iterate backwards through sorted subarray until correct position is found
      // This is when first higher element is found or start of array is reached
      // Shuffle elements forwards as iterating so space for inserted element is created
      int pos = i;
      while(pos > 0 && val.compareTo(arr[pos-1]) < 0){
        arr[pos] = arr[pos-1];
        pos--;
      }
      // Insert element
      arr[pos] = val;

      //Print current array
      for(String s : arr){
        System.out.print(s + " ");
      }
      System.out.println();
    }

  }

}
