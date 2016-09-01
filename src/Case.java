
public class Case {
	
	static Case EAU = new Case("   ");

	static Case BATEAU = new Case("B");
	static Case TIRRATE = new Case(" O ");
	static Case TIRTOUCHE = new Case(" X ");

	
	private String affichage; 
	
	public Case(String affichage) {
		this.affichage = affichage;
	}
	
	public String getAffichage(){
		return affichage;
	}
}
