import java.util.Random; 
import java.util.Scanner;

public class TextAdventure {
int turns = 0;
int health = 20;
int attack = 5;

public TextAdventure() {
	
}
private static String Meetings() {
	TextAdventure ta = new TextAdventure();
	String[] meetings10 = {"Adventurer", "Wandering Merchant", "Mysterious Person", "Bodyguard and his Charge"};
	if (ta.turns < 10) {
		 Random rand = new Random(); 
		return "A "+meetings10[rand.nextInt(meetings10.length)];
	}
	return "Didn't code that part yet";
}

	private static String Combat() {
		TextAdventure ta = new TextAdventure();
		String[] monsters10 = {"Goblin","Slime","Kobold","Rat","Basic Skeleton","Basic Zombie","Bandit"};
		if (ta.turns < 10) {
			 Random rand = new Random(); 
			return "A "+ monsters10[rand.nextInt(monsters10.length)]+" showed up, what do you do?";
		}
		return "Didn't code that part yet";
	}
	
	public String CombatQuestions() {
		System.out.println("If you want to fight write fight, if you want to run write run");
		try (Scanner scan = new Scanner(System.in)) {
			return scan.nextLine();
		}
	}
	public String MeetingQuestions() {
		System.out.println("If you want to attack write attack, if you want to make friends write befriend");
		try (Scanner scan = new Scanner(System.in)) {
			return scan.nextLine();
		}
	}
	
	
	
	public static void main(String[] args) {
		TextAdventure ta = new TextAdventure();
		boolean alive = true;
		 Random rand = new Random();
		do {
			 int randNum = rand.nextInt(1);
			 if (randNum == 0) {
				 Combat();
				  String response = ta.CombatQuestions();
				  if (response == "fight") {
					  System.out.println("You win");
				  }else {
					  System.out.println("You got away safely");
				  }
			 }else {
				 Meetings();
				 String response = ta.MeetingQuestions();
				  if (response == "attack") {
					  System.out.println("You died, Game  Over");
					  alive = false;
				  }else {
					  System.out.println("You made a new friend");
				  }
			 }
			
		}while(alive == true);

	}

}