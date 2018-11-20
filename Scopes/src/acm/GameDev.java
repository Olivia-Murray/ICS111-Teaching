package acm;

public class GameDev extends ACM {
	
	GameDev () {
		super("Ed", "Justin");	
	}
	
	private void gameTime(String name) {
		System.out.print(name + " says: ");
		gaming();
	}
	
	public void gaming() {
		System.out.println("It's game time!");
	}
	
}
