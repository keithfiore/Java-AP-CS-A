// This program produces an ASCII art drawing of a tapestry.
//
// This version has been updated to use a for loop to print
//   the fringe at the top and bottom and a nested for loop
//   to print the dots in the body of the tapestry.
public class Tapestry1 {
   public static void main(String[] args) {
      drawFringe();
      drawBody();
      drawFringe();
   }
   
   // Prints the fringe that appears at the top and bottom of the tapestry.
   public static void drawFringe() {
      System.out.print("#");
      
      for (int i = 1; i <= 16; i++) {
         System.out.print("=");
      }
      
      System.out.println("#");
   }
   
   // Prints the middle, or body, of the tapestry.
   public static void drawBody() {
      for (int line = 1; line <= 8; line++) {
         System.out.print("|");
         System.out.print("<>");
         
         for (int dot = 1; dot <= 12; dot++) {
            System.out.print(".");
         }
         
         System.out.print("<>");
         System.out.println("|");
      }
   }
}
