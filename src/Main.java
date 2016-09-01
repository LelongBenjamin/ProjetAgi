
public class Main {
	public static void main(String[] args) {
		
		Grille grilleJoueur = new Grille();
		Grille grilleIa = new Grille();
		
		Joueur joueur = new Joueur(grilleJoueur);
		
		while(true){
			new TourJoueur(grilleJoueur, grilleIa);
		}
	}
}
