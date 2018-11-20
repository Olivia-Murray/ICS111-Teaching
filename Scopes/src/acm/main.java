package acm;

public class main {

	public static void main(String[] args) {

		ACM acmBoard = new ACM("Tyler", "Ty");
		GreyHats greyHatsBoard = new GreyHats();
		GameDev gameDevBoard = new GameDev();
		
		//This should print out the ACM president and vice president
		acmBoard.print();

		//This should print out the Grey Hats president
		System.out.println(greyHatsBoard.president);
		
		//This method should not be accessible
		greyHatsBoard.hackingMethod();

		//This should print out the Grey Hats president and vice president
		greyHatsBoard.print();
		
		//This should print out the Game Dev president
		System.out.println(gameDevBoard.president);
		//This should print out the Game Dev vice president
		System.out.println(gameDevBoard.vicePresident);
		
		//This should not be able to change the president
		gameDevBoard.setPresident("New President");
		System.out.println(gameDevBoard.president);

		//This should not be able to change the vice president
		gameDevBoard.setVicePresident("New Vice President");
		System.out.println(gameDevBoard.vicePresident);
		
		//This method should not be accessible
		gameDevBoard.gaming();
		//This method should be accessible
		gameDevBoard.gameTime("Your Name Here");
		
	}

}
