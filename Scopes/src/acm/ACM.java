package acm;

public class ACM {

	private String president;
	private String vicePresident;
	
	ACM(String pres, String vicePres) {
		setPresident(pres);
		setVicePresident(vicePres);
		
	}
	
	public void setPresident(String pres) {
		this.president = pres;
	}
	
	public void setVicePresident(String vicePres) {
		this.vicePresident = vicePres;
	}
	
	private void print() {
		System.out.println("President: " + president + "\nVice President: " + vicePresident);
	}
}
