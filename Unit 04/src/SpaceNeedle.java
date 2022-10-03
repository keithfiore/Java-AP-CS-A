/**
 * SpaceNeedle.java
 * Assignment: SpaceNeedle
 * Purpose: This project tests
 *    my knowledge of for
 *    loops, expressions,
 *    variables, and constants.
 * @version mm/dd/yy
 */
public class SpaceNeedle {

    public static void main(String[] args ) {
            antenna ();
            haloTop();
            haloCenter();
            haloBottom();
            antenna(); // this part has the same output as the antenna
            elevator();
            haloTop(); // the top of the base has the same output as the top of the halo
            haloCenter(); // the bottom of the base has the same output as the center of the halo
        }

        public static final int SIZE = 4;

        //Print the antenna of the needle
        public static void antenna () {
            for(int line = 1; line <= SIZE; line ++) {
                for(int space = 1; space <= 3 * SIZE; space++) {
                    System.out.print(" ");
                }
                System.out.print("||");
                System.out.println();
            }
        }

        //Print the top of the halo
        public static void haloTop() {
            for(int line = 1; line <= SIZE; line++) {
                for(int space = 1; space <= -3 * line + SIZE * 3 ; space++) {
                    System.out.print(" ");
                }
                System.out.print("__/");
                for(int colon = 1; colon <= 3 * line - 3; colon++){
                    System.out.print(":");
                }
                System.out.print("||");
                for(int colon = 1; colon <= 3 * line - 3; colon++) {
                    System.out.print(":");
                }
                System.out.print("\\__");
                System.out.println();
            }
        }

        //Print the center of the halo
        public static void haloCenter() {
            System.out.print("|");
            for(int quotationmark = 1; quotationmark <= SIZE * 6; quotationmark++) {
                System.out.print("\"");
            }
            System.out.print("|");
            System.out.println();
        }

        //Print the bottom of the halo
        public static void haloBottom() {
            for(int line = 1; line <= SIZE; line++) {
                for(int space = 1; space <= 2 * line - 2; space++) {
                    System.out.print(" ");
                }
                System.out.print("\\_");
                for(int sign = 1; sign <= -2 * line + (3 * SIZE + 1); sign++) {
                    System.out.print("/\\");
                }
                System.out.print("_/");
                System.out.println();
            }
        }

        //Print the elevator of the needle
        public static void elevator() {
            for(int line = 1; line <= SIZE * SIZE; line++) {
                for(int space  = 1;  space <= 2 * SIZE + 1; space++) {
                    System.out.print(" ");
                }
                System.out.print("|");
                for(int per = 1; per <= SIZE - 2; per++) {
                    System.out.print("%");
                }
                System.out.print("||");
                for(int per = 1; per <= SIZE - 2; per++) {
                    System.out.print("%");
                }
                System.out.print("|");
                System.out.println();
            }
        }
}

