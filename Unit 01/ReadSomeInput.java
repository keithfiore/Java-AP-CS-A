import java.util.Scanner;

public class ReadSomeInput{
    public static void main(String[] args) {
        
        Scanner console = new Scanner(System.in);

        System.out.println("How old are you? ");

        int age = console.nextInt();

        System.out.println(age + " ... That is quite old!");
     
        console.close();
    }


}