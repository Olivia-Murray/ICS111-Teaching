
public class Sport {
	int numOfPlayers;
	int points;
	String name;
	
	Sport(String n, int np, int p) {
		this.name = n;
		this.numOfPlayers = np;
		this.points = p;
	}
	
	void printAllInfo() {
		System.out.println("Name: " + name);
		System.out.println("There are " + numOfPlayers + " players on a team");
		System.out.println("Up to " + points + " point(s) can be scored at a time");
	}
	
	void cheer() {
		System.out.println("No cheer has been set yet\n");
	}
	
}
