package Objets;

public class Case {

	public static Case EAU = new Case("   ");

	public static Case BATEAU = new Case(" B ");
	public static Case TIRRATE = new Case(" O ");
	public static Case TIRTOUCHE = new Case(" X ");

	private String affichage;

	public Case(String affichage) {
		this.affichage = affichage;
	}

	public String getAffichage() {
		return affichage;
	}
}
