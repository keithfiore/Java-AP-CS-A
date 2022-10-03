// Important note: The Javadoc comments in this sample solution are not required for a solution to pass
// They have been left in to show how comments are used to produce the Javadoc seen in your browser

/**
 *  Represents a right triangle. Every triangle created using this class has three sides of positive length: a base, a height and a hypotenuse. The three sides always satisfy the pythagorean theorem (i.e. the square of the hypotenuse is equal to the sum of the squares of the other two sides).
 */
public class RightTriangle{
  private double base;
  private double height;

  /**
   *  Creates a right triangle with base and height both of length 1.0.
   */
  public RightTriangle(){
    base = 1;
    height = 1;
  }

  /**
   *  Creates a right triangle with base of bs and height of ht <i>if</i> these are positive. If either is not positive, set the length of that side to 1.0.
   *  @param bs The proposed base of the new triangle. This should be a positive number.
   *  @param ht The proposed height of the new triangle. This should be a positive number.
   */
  public RightTriangle(double bs, double ht){
    this();
    setBase(bs);
    setHeight(ht);
  }

  /**
   * Sets the base of the right triangle to the specified length. This also changes the length of the hypotenuse of the triangle, but not the height. Calling this method with a non-positive parameter does nothing.
   * @param bs the proposed new base. This should be a positive number.
   */
  public void setBase(double bs){
    if(bs > 0)
      base = bs;
  }

  /**
   * Sets the height of the right triangle to the specified length. This also changes the length of the hypotenuse of the triangle, but not the base. Calling this method with a non-positive parameter does nothing.
   * @param ht the proposed new height. This should be a positive number.
   */
  public void setHeight(double ht){
    if(ht > 0)
      height = ht;
  }

  /**
   *  Used to get the base of the right triangle as a <code>double</code>.
   *  @return the base of the right triangle.
   */
  public double getBase(){
    return base;
  }

  /**
   *  Used to get the height of the right triangle as a <code>double</code>.
   *  @return the height of the right triangle.
   */
  public double getHeight(){
    return height;
  }

  /**
   *  Calculates the length the hypotenuse of the right triangle and returns this as a <code>double</code>.
   *  @return the hypotenuse of the right triangle.
   */
  public double getHypotenuse(){
    return Math.sqrt(base * base + height * height);
  }

  /**
   *  Calculates the area of this right triangle as a <code>double</code>.
   *  @return the area of the right triangle.
   */
  public double getArea(){
    return 0.5 * base * height;
  }

  /**
   *  Calculates the perimeter of this right triangle as a <code>double</code>.
   *  @return the perimeter of the right triangle.
   */
  public double getPerimeter(){
    return base + height + getHypotenuse();
  }

  /** Compares this right triangle to the other. The result is true if and only if the base and height of this right triangle are equal to the base and height respectively of the other right triangle.
   *  @return true if the other right triangle has the same base and height as this one, false otherwise.
   */
  public boolean equals(RightTriangle other){
    if(base == other.getBase() && height == other.getHeight())
      return true;
    return false;
  }

    /** A <code>String</code> representation of this right triangle. This is in the form "right triangle with base <i>a</i>, height <i>b</i>, hypotenuse <i>c</i>", where <i>a</i>, <i>b</i> and <i>c</i> are the doubles representing the base, height and hypotenuse of the right triangle.
    * @return a <code>String</code> representation of this right triangle.
    */
  public String toString()
  {
    return "right triangle with base " + base + ", height " + height + ", hypotenuse " + getHypotenuse();
  }
}
