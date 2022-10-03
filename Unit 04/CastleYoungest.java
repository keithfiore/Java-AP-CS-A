import java.util.Scanner;

/**
 * Reads in a loop of ages from the console until someone enters -1.  
 * Then it displays the youngest age.
 * @author Sarah Larkin
 * CS3090, Spring 2018
 * Date Last Modified: April 11, 2018
 *
 */
public class CastleYoungest {

	public static void main(String[] args) {
		int youngest = Integer.MAX_VALUE;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a list of ages (integers), ending in -1");
		do {
			int age = scan.nextInt();
			if (age == -1) {
				break; 
			}
			if (age < youngest) {
				youngest = age;
			}
		} while (scan.hasNext());
		if (youngest != Integer.MAX_VALUE) {
			System.out.println("The youngest person is " + youngest + " years old!");
		} else {
			System.out.println("The castle is empty!");
		}
		scan.close();
	}

}
