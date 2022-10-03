import java.util.Scanner;
// import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;
/**
 * Reads in from a file until a sentinel value "END" is reached.
 * 
 * @author Sarah Larkin
 * CS3090, Spring 2018
 * Date Last Modified:  April 11, 2018
 *
 */
public class SentinelString {

	
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(new File("RoundTableSentinelString.txt"))) {
			String s = "";
			while (scan.hasNext() && !s.equals("END")) {
				s = scan.nextLine();
				if (!s.equals("END")) {
					System.out.println(s);
				}
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
