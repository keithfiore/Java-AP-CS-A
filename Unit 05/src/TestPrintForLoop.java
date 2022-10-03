public class TestPrintForLoop {
    public static void main(String[] args){
        int i;
        for (i = 10; i < 40; i++) {
            if (i % 5 == 0) {
                System.out.println("Going up!");
            }
            i++;
            System.out.println(i);
        }
        //How many times does this loop run?
        System.out.println("This will loop run " + i + " times");
        }
}

