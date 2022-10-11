/*
The goal of this exercise is to program a Guess My Number game. When it’s finished, it should work like this: I'm thinking of a number between 1 and 100 (including both). Can you guess what it is? 
Type a number: 45 // get input
Your guess is: 45 
The number I was thinking of is: 14 
You were off by: 31   

Hint: You need this Java Class, Random
import java.util.Random;

This is JavaScript, but exactly how the Java program should run:
https://mdn.github.io/learning-area/javascript/introduction-to-js-1/first-splash/number-guessing-game.html

*/
import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {

public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("I am thinking of a number between 1 and 100. \n"  + "\t Can you guess what it is? \t" + 
"\n Type a number: ");

		int guess = scan.nextInt();
		Random rand = new Random(); //instance of random class
		int upperbound = 100;
        //generate random values from 0-100
		int int_random = rand.nextInt(upperbound);
		if(guess == int_random){
			System.out.println("You Guessed Correctly!");
		}
		else{
			int difference = (int_random - guess);
			System.out.print("Your guess is: " +guess+ "\n The number I was thinking of is: " +int_random +"\n You were off by: " +difference);		
			
		}
      //double double_random = rand.nextDouble();
		scan.close();
  }
}