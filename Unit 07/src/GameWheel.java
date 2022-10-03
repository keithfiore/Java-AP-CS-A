import java.util.ArrayList;

public class GameWheel {
  private ArrayList<Slice> slices; // List of slices making up the wheel
  private int currentPos;   // Position of currently selected slice on wheel


  /* Returns string representation of GameWheel with each numbered slice
   * on a new line
   */
  public String toString(){
    String s = "";
    for(int i = 0; i<20; i++){
      s += i + " - " + slices.get(i) + "\n";
    }
    return s;
  }


  /* Randomizes the positions of the slices that are in the wheel, but without
   * changing the pattern of the colors
   */
  public void scramble()
  {
    // Create lists for each color of slices
    ArrayList<Slice> blkSlices = new ArrayList<Slice>();
    ArrayList<Slice> redSlices = new ArrayList<Slice>();
    ArrayList<Slice> bluSlices = new ArrayList<Slice>();

    // Fills lists by putting slices in random place in appropriate list
    for(int i = 0; i < 20; i++)
    {
      if (i%5 == 0)
        insertRandom(slices.get(i), blkSlices);
      else if (i%2 == 1)
        insertRandom(slices.get(i), redSlices);
      else
        insertRandom(slices.get(i), bluSlices);
    }

    // Puts slices into main list, sorting by color and using order from separate lists
    combineLists(blkSlices, redSlices, bluSlices);
  }


  /* Sorts the positions of the slices that are in the wheel by prize amount,
   * but without changing the pattern of the colors.
   */
  public void sort(){
    // Create lists for each color of slices
    ArrayList<Slice> blkSlices = new ArrayList<Slice>();
    ArrayList<Slice> redSlices = new ArrayList<Slice>();
    ArrayList<Slice> bluSlices = new ArrayList<Slice>();

    // Fills lists by putting slices in correctly ordered place in appropriate list
    for(int i = 0; i < 20; i++)
    {
      if (i%5 == 0)
        insertInPlace(slices.get(i), blkSlices);
      else if (i%2 == 1)
        insertInPlace(slices.get(i), redSlices);
      else
        insertInPlace(slices.get(i), bluSlices);
    }

    // Puts slices into main list, sorting by color and using order from separate lists
    combineLists(blkSlices, redSlices, bluSlices);
  }

  private void insertRandom(Slice s, ArrayList<Slice> list){
    // Selects random position in list (including at end)
    int pos = (int)(Math.random()*(list.size()+1));
    list.add(pos, s);
  }

  // Helper method. Inserts slice in correct position into list sorted by prizeAmount
  // This works in a very similar way to an insertion sort algorithm
  private void insertInPlace(Slice s, ArrayList<Slice> list){
    int pos = list.size();
    while(pos > 0 && list.get(pos - 1).getPrizeAmount() > s.getPrizeAmount())
      pos--;
    list.add(pos, s);
  }

  private void combineLists(ArrayList<Slice> bk, ArrayList<Slice> rd, ArrayList<Slice> be){
    for(int i = 0; i < 20; i++)
    {
      if (i%5 == 0)
        slices.set(i, bk.remove(0));
      else if (i%2 == 1)
        slices.set(i, rd.remove(0));
      else
        slices.set(i, be.remove(0));
    }
  }

  /* COMPLETED METHODS - YOU DO NOT NEED TO CHANGE THESE */

  /* Creates a wheel with 20 preset slices
   */
  public GameWheel()
  {
    this(getStandardPrizes());
  }

  /* Creates a wheel with 20 slices, using values from array parameter
   */
  public GameWheel(int[] prizes) {
    currentPos = 0;
    slices = new ArrayList<Slice>();
    for(int i = 0; i < 20; i++){
      int pa = 0;
      String col = "blue";
      if(i < prizes.length)
        pa = prizes[i];
      if (i%5 == 0)
        col = "black";
      else if (i%2 == 1)
        col = "red";
      slices.add(new Slice(col, pa));
    }
  }

  /* Spins the wheel by so that a different slice is selected. Returns that
   * slice (Note: the 10 slices following the current slice are more likely to
   * be returned than the other 10).
   */
  public Slice spinWheel() {
    //spin power between range of 1-50 (inclusive)
    int power = (int)(Math.random()*50 + 1);
    int newPos = (currentPos + power) % slices.size();
    currentPos = newPos;
    return slices.get(currentPos);
  }

  public Slice getSlice(int i){
    int sliceNum = i;
    if(i < 0 || i > 19)
      sliceNum = 0;
    return slices.get(sliceNum);
  }

  // Makes an array with a standard list of prizes
  private static int[] getStandardPrizes() {
    int[] arr = new int[20];
    for (int i=0; i < 20; i++)
    {
      if (i%5 == 0)
        arr[i] = i*1000;
      else if (i%2 == 1)
        arr[i] = i*100;
      else
        arr[i] = i*200;
    }
    return arr;
  }
}
