
public class Main {
	public static void main(String[] args) {
		Grille grilleJoueur = new Grille();
		Grille grilleIa = new Grille();
		
		new TourJoueur(grilleJoueur, grilleIa);
	}
}
