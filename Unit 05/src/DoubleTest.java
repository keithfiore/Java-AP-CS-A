public class DoubleTest {
    public static void main (String[] args){

        // All about order of operations ... ughhh!

        System.out.println(3 / (double) 4);
        System.out.println((double) (3 / 4));
        System.out.println((double) 3 / 4);
        System.out.println(3 / 4);
        System.out.println("\n");
        System.out.println((double)(int)91.9);
        //System.out.println(5%0);
        System.out.println("\n");
        System.out.println((double) (1 / 8));

        int score = 0;
        score = 1 + 2 * 25;
        System.out.println(score);
        System.out.println("--------------------------");

        int num = 12345678;
        System.out.println(1000 / (num % 10000));
        System.out.println("\n");
        System.out.println((num % 10000) / 1000); //produces the correct output of 5
        System.out.println("\n");
        System.out.println((num % 1000) / 10000);
        System.out.println("\n");
        System.out.println(10000 / (num % 1000));



    }
}
