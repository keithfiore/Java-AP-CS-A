import java.util.Scanner;

public class BurgerFlippers {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Welcome to Burger flippers");
        System.out.print("What's the name for the order: ");
        String name=scan.nextLine();
        String [] maindish={"None","Cheeseburger","Sausageburger","Baconburger","Pizzaburger"};
        String [] drinkd={"None", "Lemonade","MilkShake" ,"Ice tea", "Water"};
        String [] sidedish={"None", "Fries","Shrimp" ,"Baconfries", "Mac&Cheese"};
        System.out.println("Main dish?(Type the number)");
        System.out.println("Options: 1)None, 2)Cheeseburger, 3)Sausage burger, 4)Bacon burger, 5)Pizza burger ");
        int maind=scan.nextInt();
        System.out.println("Side dish?(Type the number)");
        System.out.println("Options: 1)None, 2)Fries, 3)Shrimp, 4)Baconfries, 5)Mac&Cheese");
        int sided=scan.nextInt();
        String [] typed= {"Large","Medium","Small"};
        System.out.println("Do you want anything to drink?(Type the number)");
        System.out.println("Options: 1)None, 2)Lemonade, 3)MilkShake, 4)Ice tea, 5)Water ");
        int drink=scan.nextInt();
        if(drink>1)
        {
            System.out.println("Cup Size?");
            System.out.println("1)Large, 2)Medium, 3)Small");
            int type=scan.nextInt();

            System.out.println(name+" ordered a number " +maind + maindish[maind-1]+  " for the main dish, number " + sided +sidedish[sided-1] +" for the sidedish, and size drink "+ type+typed[type-1] + " with drink " +drink+drinkd[drink-1]);
        }
        else
        {

            System.out.println(name+" ordered a number " +maind + maindish[maind-1]+  " for the main dish, number " + sided +sidedish[sided-1] + " for the sidedish with no beverages.");
        }
        scan.close();

    }
}

