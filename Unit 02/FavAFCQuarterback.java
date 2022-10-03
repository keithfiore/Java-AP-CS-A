import java.util.Scanner;

public class FavAFCQuarterback {
    public static void main(String[] args) {
        
        Scanner myObj = new Scanner(System.in);
        System.out.println("Who is your favorite quarterback in the AFC ?");
        System.out.println("Enter 1 for Josh Allen");
        System.out.println("Enter 2 for Patrick Mahomes");
        System.out.println("Enter 3 for Joe Burrow");
        System.out.println("Enter 4 for Justin Herbert ");
        System.out.println("Enter 5 for Lamar Jackson");
        System.out.println("Enter 6 for Derek Carr");
        System.out.println("Enter 7 for Dashaun Watson");
        System.out.println("Enter 8 for Russell Wilson");

        int qb = myObj.nextInt();
        switch (qb) {
            case 1:
                System.out.println("Of course Bills fans Believe in Josh! It's fitting that the Bills' last two seasons have ended in playoff thrillers against the Chiefs, because Allen is the closest thing to Mahomes in terms of the contemporary prototype under center -- big, athletic, and wired to make the big play. Bills Mafia!");
                break;
            case 2:
                System.out.println("Chiefs... It's gotten to the point with Mahomes that anything less than highlight-reel perfection raises questions about whether he is slipping as his generations premier gunslinger.");
                break;
            case 3:
                System.out.println("Bengals fans will no doubt clamor for Joe Cool to be higher. His swagger gets all the headlines, but it's really his unfazed pocket presence and across-the-board mechanics that make him franchise material. Chemistry with big-play machine Ja'Marr Chase helps, too.  ");
                break;
            case 4:
                System.out.println("If Mahomes is the magician and Allen is the supersized dual threat, then Herbert is the prototypical pocket passer. ");
                break;
            case 5:
                System.out.println("The spectrum of opinions on Jackson is quite wide. Some see the former MVP who once led the NFL in TD passes, a one-of-a-kind specimen with the speed and arm talent to change every game. ");
                break;
            case 6:
                System.out.println("This is where you might draw the line between bona fide franchise QBs and solid, if unspectacular, starters. ");
                break;
            case 7:
                System.out.println("Here is the biggest asterisk on the list. Talent-wise, Watson has proven to be a top-10ish pocket passer with the legs to rival a Mahomes or Allen in a shootout. And the Browns are paying him to be at least that. ");
                break;
            case 8:
                System.out.println("If we are looking strictly at past performance, Wilson probably deserves to be even higher. He is on a Hall of Fame path thanks to his pristine 10-year run in Seattle");
                break;
            }

        
    myObj.close();
        
    }
    
}
