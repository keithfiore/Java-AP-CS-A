public class ForLoopMadness {

    public static void main(String[] args) {

        // Trace through a nested for loop... ughhh!!

        for (int i = 1; i < 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*
* OUTPUT
* *
* **
* ***
* ****
 */