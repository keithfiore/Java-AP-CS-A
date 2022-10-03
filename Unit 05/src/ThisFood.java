//A Java Class to make the keyword this, less abstract

public class ThisFood {
    String food;
    char size;


    public void setData(String food, char size ) {
        this.food = food; // this is a reference to the variables (global) above
        this.size = size;

    }
    public static void main(String[] args){


        ThisFood t = new ThisFood(); //So abstract, right?        t.setData("pizza",'L');
        System.out.println(t.food);
        System.out.println(t.size);
    }



}
