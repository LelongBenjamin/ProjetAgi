
public class Case {
	
	static Case EAU = new Case(" ");
	static Case BATEAU = new Case("B");
	
	private String affichage; 
	
	public Case(String affichage) {
		this.affichage = affichage;
	}
	
	public String getAffichage(){
		return affichage;
	}
}
