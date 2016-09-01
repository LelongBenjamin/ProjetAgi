
public class Main {
	public static void main(String[] args) {
		
		Joueur joueur = new Joueur();
		
		Grille grilleJoueur = new Grille();
		Grille grilleIa = new Grille();
		
		while(true){
			new TourJoueur(grilleJoueur, grilleIa);
		}
	}
}
