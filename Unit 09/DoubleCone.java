public class DoubleCone extends Cone{

  private String flavor2;

  public DoubleCone(String f, boolean w){
    this(f, f, w);
  }

  public DoubleCone(String f1, String f2, boolean w){
    super(f1, w);
    flavor2 = f2;
  }

  public void setFlavor(String f){
    this.setFlavor(f, f);
  }

  public void setFlavor(String f1, String f2){
    super.setFlavor(f1);
    flavor2 = f2;
  }

  public String toString(){
    return "double " + super.toString() + " and " + flavor2;
  }

}
