import java.util.Scanner;

public class PrintEveryOtherLetterAnswer {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Input a word");
        String word = scan.nextLine();
        int index = 0;
        while (index < word.length()) {
            System.out.print(word.substring(index, index + 1));
            index += 2;
        }
        scan.close();
    }
}
