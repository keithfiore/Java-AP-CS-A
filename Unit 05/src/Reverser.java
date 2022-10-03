import java.util.Scanner;

public class Reverser {

    public static void reverser(String str){
        for(int i = str.length()-1; i>=0; i--){
            System.out.print(str.charAt(i));
            }
        }

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String rev = scan.nextLine();
            reverser(rev);
        }
}
