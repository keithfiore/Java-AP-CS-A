public class GoingUpForLoop {

    public static void main(String[] args){

        for (int i = 10; i < 40; i++) {

            if (i % 5 == 0) {
                System.out.println("Going up!");
            }
            i++;
            System.out.println(i);
        } //How many times does this loop run?
    }
}
