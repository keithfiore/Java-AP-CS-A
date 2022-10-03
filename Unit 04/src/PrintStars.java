public class PrintStars {

    public static void triangle(int n) {
        for (int i = n; i > 0; i--) {//number of lines
            for (int j = i - 1; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = n; k >= i; k--) {        //use k>=i
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

        public static void main(String[] args){
            triangle(12);
        }
}
