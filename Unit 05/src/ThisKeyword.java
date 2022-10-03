
public class ThisKeyword {
    int x;
    int y;


    public void setData(int x, int y) {
        this.x = x; // this is a reference to the variables (global) above
        this.y = y;

    }
    public static void main(String[] args){


        ThisKeyword t = new ThisKeyword(); //So abstract, right?
        t.setData(3,4);
        System.out.println(t.x);
        System.out.println(t.y);
    }

}
