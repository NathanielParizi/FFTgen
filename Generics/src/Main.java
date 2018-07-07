import java.util.Scanner;

//Parametric poly-morphism: when code is written without mention of any
//specific type. It can be used transparently with any new
//type. In the object-oriented programming world, we call this
//generics or generic programming. In the functional programming
//world, they just simply call this poly-morphism.

//Prior to Java 1.5 there were no Generics purely from backwards compatibility
//(so that the code can still run)


// nerd practice

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String userName;
		
		Mage poe = new Mage("Poe");
		Knight lance = new Knight("Lance");
		Alchemist willow = new Alchemist("Willow");
		
		Team<Mage> userTeam = new Team<>("Mage's Guild");
		
		userTeam.addPlayer(poe);
	//	userTeam.addPlayer(lance);
//		userTeam.addPlayer(willow);
		
		Team<Knight> knightsGuild = new Team<>("Knight's Guild");
		
		userTeam.numPlayers();
		
		System.out.println("Welcome, what's your name?");
		userName = scan.nextLine();
		System.out.println("Welcome, to Goldenfalls "  + userName + ".");
	}

}
