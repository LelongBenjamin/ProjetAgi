import java.util.ArrayList;
import java.util.List;

public class Joueur {

	private List<Bateau> listeBateau = new ArrayList<>();
	
	public Joueur(Grille grille) {
		grille.afficherGrille();
		int[] cood = TourJoueur.demanderCoordonnees();
		grille.placerBateau(new Bateau(3, cood[1], cood[0], true));
	}
	
	/**
	 * Nombre de vies du bateau
	 * @return
	 */
	public int bateauAlive() {
		int total = 0;
		for (int i = 0; i < this.listeBateau.size(); i++) {
			total += this.listeBateau.get(i).getTaille();
		}		
		return total;
	}	
	

}
