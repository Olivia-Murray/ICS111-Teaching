
public class Hockey extends Sport {
	Hockey () {
		super("Hockey", 5, 1);
	}

	void goalie() {
		System.out.println("There exists a goalie");
	}
	
	void cheer() {
		System.out.println("DSC!\n");
	}

	void printAllInfo() {
		System.out.println("Name: " + name);
		System.out.println("There are " + numOfPlayers + " players on a team");
		System.out.println("Up to " + points + " point(s) can be scored at a time");
		goalie();
	}

}
