import java.util.ArrayList;

public class Team {
	
	private String name;


	int played = 0;
	int won = 0;
	int tied = 0;
	int lost = 0;

	private ArrayList<Player> members = new ArrayList<>();
	
	public Team(String name) {
		this.name = name;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public boolean addPlayer(Player player) {
		if(members.contains(player)) 
		{
			System.out.println(player + " is already on this team");
			return false;
		}else {
			members.add(player);
			System.out.println(player.getName() + " just joined " + this.name);
			return true;
		}
		
		
	}
	
	public int numPlayers()
	{
		System.out.println("The team size is " + members.size());
		return this.members.size();
	}
	
	public void matchResult(Team opponent, int ourScore, int theirScore) 
	{
		if(ourScore > theirScore)
			won++;
		if(ourScore== theirScore)
			tied++;
		if(ourScore < theirScore)
			lost++;
		played++;
		if(opponent != null)
		{
			opponent.matchResult(null, theirScore, ourScore);
		}
	}
	
	public int ranking() {
		return (won *2) + tied;
	}
	
	
	
}
