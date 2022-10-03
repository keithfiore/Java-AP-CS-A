public class StringWhileLoop {
    public static void main(String[] args){
        String text = "there's a turtle";
        int index = text.indexOf("tt");
        while (index >= 0){
            text = text.substring(0,index)+"t"
                    +text.substring(index+1,text.length());
            index = text.indexOf("t");
            System.out.print("t");
        }

    }
}
