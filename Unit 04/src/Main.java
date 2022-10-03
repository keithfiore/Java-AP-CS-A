import java.util.Random; 
import java.util.Scanner;
public class Main {
int turns = 0;
int health = 20;
int attack = 5;

public Main() {
	
}
private static String Meetings() {
	Main ta = new Main();
	String[] meetings10 = {"Adventurer", "Wandering Merchant", "Mysterious Person", "Bodyguard and his Charge"};
	if (ta.turns < 10) {
		 Random rand = new Random(); 
		return "A "+meetings10[rand.nextInt(meetings10.length)];
	}
	return "Didn't code that part yet";
}

	private static String Combat() {
		Main ta = new Main();
		String[] monsters10 = {"Goblin","Slime","Kobold","Rat","Basic Skeleton","Basic Zombie","Bandit"};
		if (ta.turns < 10) {
			 Random rand = new Random(); 
			return "A "+ monsters10[rand.nextInt(monsters10.length)]+" showed up, what do you do?";
		}
		return "Didn't code that part yet";
	}
	
	public String CombatQuestions() {
		System.out.println("If you want to fight write fight, if you want to run write run");
		Scanner scan = new Scanner(System.in);
		return scan.nextLine();
		
	}
	public String MeetingQuestions() {
		System.out.println("If you want to attack write attack, if you want to make friends write befriend");
		Scanner scan = new Scanner(System.in);
		return scan.nextLine();
		
	}
	scan.close();
	
	
	public static void main(String[] args) {
		Main ta = new Main();
		boolean alive = true;
		 Random rand = new Random();
		do {
			 int randNum = rand.nextInt(2);
			 if (randNum == 0) {
				 System.out.println(Combat());
				  String response = ta.CombatQuestions();
				  if (response.equals("fight") ){
					  System.out.println("You win");
            ta.turns++;
				  }else {
					  System.out.println("You got away safely");
             ta.turns++;
				  }
			 }else {
				 System.out.println(Meetings());
				 String response = ta.MeetingQuestions();
				  if (response.equals("attack")) {
					  System.out.println("You died, Game  Over");
					  alive = false;
				  }else {
					  System.out.println("You made a new friend");
             ta.turns++;
				  }
			 }
			System.out.println(ta.turns);
		}while(alive == true && ta.turns < 10);
	}
	public int getTurns() {
		return turns;
	}
	public void setTurns(int turns) {
		this.turns = turns;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}

}
