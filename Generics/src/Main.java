import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String userName;
		
		Mage poe = new Mage("Poe");
		Knight lance = new Knight("Lance");
		Alchemist willow = new Alchemist("Willow");
		
		Team userTeam = new Team("Your team");
		userTeam.addPlayer(poe);
		userTeam.addPlayer(lance);
		userTeam.addPlayer(willow);
		
		userTeam.numPlayers();
		
		System.out.println("Welcome, what's your name?");
		userName = scan.nextLine();
		System.out.println("Welcome, to Goldenfalls "  + userName + ".");
	}

}
