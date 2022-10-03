public class SpecialityCoffee2 extends Coffee{
  
  // Additional member variable
  private String flavor;
  
  public void SpecialityCoffee(){
    // Calls super-constructor to create default coffee then sets flavor
    super();
    flavor = "vanilla";
  }
  
  public void SpecialityCoffee(String size, String type, String flavor){
    
    // Calls constructor below with a mix of parameters and default values
    this(size, false, 1, type, flavor);
  }
  
  public void SpecialityCoffee(String size, boolean isSkinny, int shots, String type, String flavor){
    
    // Calls super-constructor tos set first 4 variables then sets flavor
    super(size, isSkinny, shots, type);
    this.flavor = flavor;
  }
  
  public String toString(){
    // Calls Coffee toString and appends flavor to end
    return super.toString() + " with " + flavor;
  }
    
  public int getPrice(){
    // Variable for extra charge, 50 in most cases
    int extraCharge = 50;
    
    // If size is large or extra large, extra charge should be 70
    if(getSize().equals("large") || getSize().equals("extra large")){
      extraCharge = 70;
    }
    
    // Return base price plus the extra charge
    return super.getPrice() + extraCharge;
  }
}